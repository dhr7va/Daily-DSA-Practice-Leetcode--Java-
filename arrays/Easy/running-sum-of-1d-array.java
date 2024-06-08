class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] run_sum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            run_sum[i] = sum;
        }
        return run_sum;
    }
}