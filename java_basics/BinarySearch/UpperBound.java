package java_basics.BinarySearch;

public class UpperBound {
    static int findCeil(int arr[], int n, int x) {
        int l = 0;
        int h = n - 1;
        int res = -1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (arr[mid] >= x) {
                res = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int n = arr.length;
        int x = 15;

        int ceilIndex = findCeil(arr, n, x);

        if (ceilIndex != -1) {
            System.out.println("Ceiling of " + x + " is " + arr[ceilIndex]);
        } else {
            System.out.println("Ceiling of " + x + " doesn't exist");
        }
    }
}
