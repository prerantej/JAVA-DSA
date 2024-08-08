package java_basics.Arrays.Hard;

class FirstLastEle {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false);
        result[0] = left;
        result[1] = right;
        return result;
    }

    private int binarySearch(int[] nums, int target, boolean searchLeft) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                index = mid;
                if (searchLeft) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {
        FirstLastEle solution = new FirstLastEle();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = solution.searchRange(nums, target);
        System.out.println("First and Last Positions:");
        System.out.println("First: " + result[0] + ", Last: " + result[1]);
    }
}
