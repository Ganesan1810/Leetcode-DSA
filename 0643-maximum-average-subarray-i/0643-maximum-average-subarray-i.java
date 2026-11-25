class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        if (n < k) {
            return 0; 
        }
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        int maxsum = currentSum;
        for (int i = k; i < n; i++) {
           
            currentSum += nums[i] - nums[i - k];
            
            maxsum = Math.max(maxsum, currentSum);
        }
        return(double) maxsum/k;
    }
    }
