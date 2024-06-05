package gfg.school;

import java.util.ArrayList;

public class valueEqualToIndex {
    static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> array= new ArrayList<Integer>();
        for(int i=0; i < n; i++){
            if(arr[i]==i+1){
                array.add(i+1);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(valueEqualToIndex(new int[]{1, 3, 4, 5, 6},5));
    }
}
