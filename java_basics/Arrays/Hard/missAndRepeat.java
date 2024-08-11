package java_basics.Arrays.Hard;

public class missAndRepeat {
    public int[] findTwoElement(int[] arr, int n) {
        int a = 0, b = 0;

        for (int i = 0; i < n; i++) {
            if (arr[Math.abs(arr[i]) - 1] > 0) {
                arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
            } else {
                a = Math.abs(arr[i]);
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                b = i + 1;
                break;
            }
        }

        int[] v = new int[2];
        v[0] = a; // Repeated number
        v[1] = b; // Missing number
        return v;
    }

    public static void main(String[] args) {
        missAndRepeat solution = new missAndRepeat();

        int[] arr = {1, 3, 3, 4, 5}; // Example array with missing number and duplicate
        int n = arr.length;          // Length of the array

        int[] result = solution.findTwoElement(arr, n);
        System.out.println("Repeated number: " + result[0]);
        System.out.println("Missing number: " + result[1]);
    }
}
