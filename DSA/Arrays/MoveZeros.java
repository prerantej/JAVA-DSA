package DSA.Arrays;

class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        while (i < n) {
            nums[i] = 0;
            i++;
        }
    }


    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        MoveZeroes mz = new MoveZeroes();
        mz.moveZeroes(nums);

        System.out.println("Array after moving zeroes:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
