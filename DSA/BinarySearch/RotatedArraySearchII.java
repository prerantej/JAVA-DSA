package DSA.BinarySearch;

class RotatedArraySearchII {
    public boolean search(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                return true;
            }
            else if (nums[l] < nums[mid]) {
                if (nums[l] <= target && target < nums[mid]) {
                    h = mid - 1;
                }
                else {
                    l = mid + 1;
                }
            }
            else if (nums[mid] < nums[l]) {
                if (nums[mid] < target && target <= nums[h]) {
                    l = mid + 1;
                }
                else {
                    h = mid - 1;
                }
            }
            else {
                l++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Create an instance of the RotatedArraySearchII class
        RotatedArraySearchII solution = new RotatedArraySearchII();

        // Define the test case array and target
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        // Call the search method and get the result
        boolean result = solution.search(nums, target);

        // Print the result
        System.out.println("Target " + target + " found: " + result);
    }
}