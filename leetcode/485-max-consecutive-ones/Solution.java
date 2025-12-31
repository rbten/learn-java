public class Solution {
    public static void main(String[] args) {

        int result = 0;
        int count = 0;
        int[] nums;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                result = Math.max(count, result);
            }

            else {
                count = 0;
            }
        }
    }
}