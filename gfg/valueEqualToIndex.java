package gfg;
import java.io.*;
import java.util.*;

public class valueEqualToIndex {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == i + 1) {
                array.add(i + 1);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        valueEqualToIndex solution = new valueEqualToIndex();
        int[] arr = {15, 2, 45, 4, 7};
        int n = arr.length;
        ArrayList<Integer> result = solution.valueEqualToIndex(arr, n);
        System.out.println(result);
    }
}

