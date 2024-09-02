package DSA.BinarySearch;

class LowerBound {

    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x) {
        for(int i=n-1;i>-1;i--){
            if(arr[i]<=x)return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        long[] arr = {2, 3, 5, 9, 14, 16, 18};
        int n = arr.length;
        long x = 15;

        int floorIndex = findFloor(arr, n, x);

        if (floorIndex != -1) {
            System.out.println("Floor of " + x + " is " + arr[floorIndex]);
        } else {
            System.out.println("Floor of " + x + " doesn't exist");
        }
    }
}
