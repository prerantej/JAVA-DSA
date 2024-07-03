package java_basics.Arrays;

public class LeftRotate {
    static void rotateArr(int arr[], int d, int n) {
        d = d % n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    static void reverse(int arr[], int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        LeftRotate solution = new LeftRotate();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        int n = arr.length;

        solution.rotateArr(arr, d, n);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
