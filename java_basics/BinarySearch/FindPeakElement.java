package java_basics.BinarySearch;

class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int peakIndex = 0;  // Changed variable name from count to peakIndex
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // Check if mid is the peak element
            if ((mid == 0 || nums[mid] > nums[mid - 1]) &&
                    (mid == nums.length - 1 || nums[mid] > nums[mid + 1])) {
                return mid;
            }
            // Move to the right side if the mid element is smaller than the next element
            else if (mid < nums.length - 1 && nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            }
            // Move to the left side if the mid element is smaller than the previous element
            else {
                high = mid - 1;
            }
        }
        return peakIndex;
    }

    public static void main(String[] args) {
        // Create an instance of the FindPeakElement class
        FindPeakElement solution = new FindPeakElement();

        // Define the test case array
        int[] nums = {1, 3, 5, 6, 4, 2};

        // Call the findPeakElement method and get the result
        int peakIndex = solution.findPeakElement(nums);

        // Print the result
        System.out.println("The peak element is at index: " + peakIndex);
        System.out.println("The peak element is: " + nums[peakIndex]);
    }
}
