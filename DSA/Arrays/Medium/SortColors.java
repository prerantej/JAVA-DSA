package DSA.Arrays.Medium;

class SortColors {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        SortColors solution = new SortColors();
        int[] arr = {2, 0, 2, 1, 1, 0};
        System.out.println("Before sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        solution.sortColors(arr);

        System.out.println("After sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

