class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length, prefix = 1, suffix = 1;
        int[] res = new int[n];
        Arrays.fill(res, 1);

        for (int i = 0; i < n; i++) {
            res[i] *= prefix;
            prefix *= nums[i];
            res[n - 1 - i] *= suffix;
            suffix *= nums[n - 1 - i];
        }
        return res;
    }
}