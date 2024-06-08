class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length];
        int index = 0;
        for(int num : nums){
            squares[index] = num*num;
            index++;
        }
        Arrays.sort(squares);
        return squares;
    }
}
