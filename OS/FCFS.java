package OS;

import java.util.Scanner;

public class FCFS {
    static void findAvgTime(){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of processes");
        int n=sc.nextInt();

        int[] burstTimes= new int[n];

        System.out.println("Enter the burst times of each process");
        for (int i = 0; i < n; i++) {
            burstTimes[i] = sc.nextInt();
        }




    }
}
