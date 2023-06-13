import java.util.Arrays;

class Solution {
    int i = 0;

    public int[] twoSum(int[] nums, int target) {

        while (i < nums.length) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
            i++;
        }
        return null;
    }

}

class tow_sum {
    public static void main(String[] args) {
        int[] nums = { 10, 2, 7, 11, 15 };
        int[] result = new Solution().twoSum(nums, 9);
        System.out.println(Arrays.toString(result));

    }

}