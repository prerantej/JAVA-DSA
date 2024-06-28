package java_basics.sort;

import java.util.Arrays;

public class recurInsert {
    static void recurInsertionsort(int[ ] arr , int i, int n){
        if(i==n){
            return;
        }
        else{
            int temp = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }

        recurInsertionsort(arr,i+1,n);
    }

    public static void main(String[] args) {
        int[] array = {13, 46, 24, 52, 20, 9};
        int n = array.length;
        recurInsertionsort(array,0,n);
        System.out.println(Arrays.toString(array));
    }
}
