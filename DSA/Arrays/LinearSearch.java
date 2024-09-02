package DSA.Arrays;

class LinearSearch {
    // Function to perform a linear search in the array.
    public static int linearSearch(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i; // Element found at index i
            }
        }
        return -1; // Element not found
    }


    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;

        int result = LinearSearch.linearSearch(arr, n, x);

        if (result == -1) {
            System.out.println("Element not present in the array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}