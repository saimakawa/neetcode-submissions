class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int s = 2 * n;
        int[] ans = new int[s];
        System.arraycopy(nums, 0, ans, 0, n);
        System.arraycopy(nums, 0, ans, n, n);
        return ans;
    }
}