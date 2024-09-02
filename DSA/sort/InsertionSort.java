package DSA.sort;

public class InsertionSort {
    void sort(int arr[]){
        for (int i = 1; i < arr.length; ++i) {
            int temp=arr[i];
            int j=i-1;

        while(j>=0 && temp<arr[j]){
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=temp;
        }
    }

    static void printArray(int arr[]){
        for (int i = 0; i < arr.length ; ++i) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args){
        int arr[] = { 12, 11, 13, 5, 6 };

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        printArray(arr);
    }
}
