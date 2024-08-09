package java_basics.Arrays.Hard;

import java.util.HashMap;

class MaxLengthSubarray {
    int maxLen(int arr[], int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int s = 0, r = 0;

        for (int i = 0; i < n; i++) {
            s += arr[i];
            if (!hm.containsKey(s)) {
                hm.put(s, i);
            } else {
                r = Math.max(r, i - hm.get(s));
            }
            if (s == 0) {
                r = Math.max(r, i + 1);
            }
        }
        return r;
    }

    public static void main(String[] args) {
        MaxLengthSubarray obj = new MaxLengthSubarray();
        int[] arr = {1, -1, 5, -2, 3};  // Example input
        int n = arr.length;
        System.out.println("The maximum length of the subarray with sum 0 is: " + obj.maxLen(arr, n));
    }
}
