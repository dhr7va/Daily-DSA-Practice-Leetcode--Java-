class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0)
            return;

        int zeroIndex = 0;

        for(int num : nums){
            if(num != 0){
                nums[zeroIndex] = num;
                zeroIndex++;
            }
        } 
        for(int i = zeroIndex; i<nums.length; i++){
            nums[i] = 0;
        }
    }
}
