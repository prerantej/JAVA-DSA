package java_basics.Arrays.Hard;
import java.util.Arrays;
public class mergeWithoutExtraSpace {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    public static void main(String[] args) {
        mergeWithoutExtraSpace solution = new mergeWithoutExtraSpace();

        int[] nums1 = new int[6]; // Array with extra space
        int m = 3; // Number of elements initialized in nums1
        int[] nums2 = {2, 5, 6}; // Array to merge
        int n = 3; // Number of elements in nums2

        // Initialize nums1 with some values
        nums1[0] = 1;
        nums1[1] = 3;
        nums1[2] = 4;

        // Merge nums2 into nums1
        solution.merge(nums1, m, nums2, n);

        // Print the result
        System.out.println("Merged array: " + Arrays.toString(nums1));
    }
}
