class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int s = 2 * nums.length;
        int[]ans = new int[s];
        for(int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}