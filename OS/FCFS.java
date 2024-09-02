package OS;
import java.util.Scanner;
class FCFS {

    public static double calculateAvgWaitingTime(int[] arrivalTime, int[] burstTime, int n) {
        int[] waitingTime = new int[n];
        int[] completionTime = new int[n];
        int[] turnAroundTime = new int[n];

        completionTime[0] = arrivalTime[0] + burstTime[0];
        for (int i = 1; i < n; i++) {
            completionTime[i] = Math.max(arrivalTime[i], completionTime[i-1]) + burstTime[i];
        }

        for (int i = 0; i < n; i++) {
            turnAroundTime[i] = completionTime[i] - arrivalTime[i];
            waitingTime[i] = turnAroundTime[i] - burstTime[i];
        }

        double totalWaitingTime = 0;
        for (int i = 0; i < n; i++) {
            totalWaitingTime += waitingTime[i];
        }

        return totalWaitingTime / n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int n = sc.nextInt();

        int[] processID = new int[n];
        int[] arrivalTime = new int[n];
        int[] burstTime = new int[n];

        System.out.println("Enter Process ID, Arrival Time, and Burst Time for each process:");
        for (int i = 0; i < n; i++) {
            System.out.print("Process " + (i + 1) + " ID: ");
            processID[i] = sc.nextInt();
            System.out.print("Arrival Time: ");
            arrivalTime[i] = sc.nextInt();
            System.out.print("Burst Time: ");
            burstTime[i] = sc.nextInt();
        }

        double avgWaitingTime = calculateAvgWaitingTime(arrivalTime, burstTime, n);

        System.out.printf("Average Waiting Time: %.2f\n", avgWaitingTime);

        sc.close();
    }
}

