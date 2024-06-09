class Solution {
       public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  // Sort the array
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; 
            int left = i + 1;
            int right = n - 1;
            int a = nums[i];
            int complement = -a;

            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == complement) {
                    result.add(Arrays.asList(a, nums[left], nums[right])); 
                    
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    left++;
                    right--;
                } else if (sum < complement) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}
