package DSA.Arrays;

class RightRotate {
    static void rotateArr(int arr[], int k, int n) {
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
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
        RightRotate solution = new RightRotate();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        int n = arr.length;

        solution.rotateArr(arr, k, n);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
