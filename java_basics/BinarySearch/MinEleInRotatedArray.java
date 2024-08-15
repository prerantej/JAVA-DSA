package java_basics.BinarySearch;

class MinEleInRotatedArray {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[low] <= nums[mid]) {
                min = Math.min(nums[low], min);
                low = mid + 1;
            } else {
                min = Math.min(nums[mid], min);
                high = mid - 1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        // Create an instance of the MinEleInRotatedArray class
        MinEleInRotatedArray solution = new MinEleInRotatedArray();

        // Define the test case array
        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        // Call the findMin method and get the result
        int min = solution.findMin(nums);

        // Print the result
        System.out.println("The minimum element in the rotated array is: " + min);
    }
}
