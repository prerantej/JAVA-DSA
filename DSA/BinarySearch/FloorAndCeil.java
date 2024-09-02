package DSA.BinarySearch;

import java.util.Arrays;

class FloorAndCeil {
    public int[] getFloorAndCeil(int x, int[] arr) {
        Arrays.sort(arr);
        int[] res = new int[2];
        res[0] = floor(arr, x);
        res[1] = ceil(arr, x);
        return res;
    }

    public int floor(int[] arr, int x) {
        int l = 0;
        int h = arr.length - 1;
        int ans = -1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (arr[mid] <= x) {
                ans = arr[mid];
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return ans;
    }

    public int ceil(int[] arr, int x) {
        int l = 0;
        int h = arr.length - 1;
        int ans = -1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (arr[mid] >= x) {
                ans = arr[mid];
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        FloorAndCeil fc = new FloorAndCeil();
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 5;
        int[] result = fc.getFloorAndCeil(x, arr);

        System.out.println("Floor: " + result[0]);
        System.out.println("Ceil: " + result[1]);
    }
}
