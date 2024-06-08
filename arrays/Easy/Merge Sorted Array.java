class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0; i<n; i++){
            nums1[m+i+1]=nums2[i];
        }
        int min = nums1[0];
        for(int i=0; i<m+n; i++){
            if(nums1[i]<min){
                min=nums1[i];
            }
        }
        return nums1;
    }
}
