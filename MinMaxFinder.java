import java.util.Arrays;

public class MinMaxFinder {
    public static int[] findMaxMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int max = nums[0];
        int min = nums[0];

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        return new int[]{max, min};
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 7, 2, 9, 3};
        System.out.println(Arrays.toString(findMaxMin(nums)));
    }
}

