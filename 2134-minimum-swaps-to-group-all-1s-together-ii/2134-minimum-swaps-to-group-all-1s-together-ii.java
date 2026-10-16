class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length, k = 0;
        for (int x : nums){
         k += x;
        }
        if(k <= 1)
            return 0;

        int zeros = 0;
        for (int i = 0; i < k; i++){
            if (nums[i] == 0)
                 zeros++;
        }
        int best = zeros;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == 0) 
                zeros--;
            if (nums[(i + k) % n] == 0) 
                zeros++;
            best = Math.min(best, zeros);
        }
        return best;
    }
}
