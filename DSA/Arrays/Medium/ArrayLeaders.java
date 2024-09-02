package DSA.Arrays.Medium;


import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders{
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        ArrayList<Integer> leaders = new ArrayList<Integer>();
        int lead = arr[n - 1];
        leaders.add(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= lead) {
                leaders.add(arr[i]);
                lead = arr[i];
            }
        }

        // Reverse the list to maintain the order from left to right
        Collections.reverse(leaders);

        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> result = leaders(arr.length, arr);
        System.out.println("Leaders in the array: " + result);
        // Output should be [17, 5, 2]
    }
}
