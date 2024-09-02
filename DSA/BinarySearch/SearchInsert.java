package DSA.BinarySearch;

class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        SearchInsert searchInsert = new SearchInsert();

        // Test case 1: Target is in the middle
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        System.out.println("Test case 1: " + (searchInsert.searchInsert(nums1, target1) == 2 ? "Passed" : "Failed"));
    }
}
