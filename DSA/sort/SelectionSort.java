package DSA.sort;

public class SelectionSort {
    void sort(int[] arr){
        int n= arr.length;
        for (int i = 0; i < n-1; i++) {
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    void printarray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        SelectionSort ob= new SelectionSort();
        int[] arr= {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Arrazy is sorted");
        ob.printarray(arr);

    }
}
