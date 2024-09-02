package DSA.Arrays;

class SecondLargest {
    int print2largest(int arr[], int n) {
        int large = arr[0];
        int secondLarge = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                secondLarge = large;
                large = arr[i];
            } else if (arr[i] > secondLarge && arr[i] != large) {
                secondLarge = arr[i];
            }
        }
        return secondLarge;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int n = arr.length;

        SecondLargest sl = new SecondLargest();
        int result = sl.print2largest(arr, n);

        System.out.println("The second largest element is: " + result);
    }
}
