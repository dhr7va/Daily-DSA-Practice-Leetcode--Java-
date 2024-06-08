class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int left_sum=0;
        for(int i = 0; i<nums.length;i++){
            if(left_sum == sum - left_sum -nums[i]){
                return i;
                }
                left_sum += nums[i];
        }

        return -1;
    }
}
