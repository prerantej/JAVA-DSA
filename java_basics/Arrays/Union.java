package java_basics.Arrays;

import java.util.ArrayList;

class Union {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        int i = 0;
        int j = 0;
        int temp = -1;
        ArrayList<Integer> arr = new ArrayList<Integer>();

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                temp = arr1[i];
                i++;
            } else if (arr2[j] < arr1[i]) {
                temp = arr2[j];
                j++;
            } else {
                temp = arr1[i];
                i++;
                j++;
            }

            if (arr.size() == 0 || arr.get(arr.size() - 1) < temp) {
                arr.add(temp);
            }
        }

        while (i < n) {
            if (arr.size() == 0 || arr.get(arr.size() - 1) < arr1[i]) {
                arr.add(arr1[i]);
            }
            i++; // Increment i
        }

        while (j < m) {
            if (arr.size() == 0 || arr.get(arr.size() - 1) < arr2[j]) {
                arr.add(arr2[j]);
            }
            j++; // Increment j
        }

        return arr;
    }



    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 5, 6};
        int arr2[] = {2, 3, 5, 7};
        int n = arr1.length;
        int m = arr2.length;

        ArrayList<Integer> result = Union.findUnion(arr1, arr2, n, m);

        System.out.println("Union of the two arrays is:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
