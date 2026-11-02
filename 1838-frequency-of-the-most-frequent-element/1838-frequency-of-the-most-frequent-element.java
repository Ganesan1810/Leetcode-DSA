class Solution {
public int maxFrequency(int[] nums, int k) {
    Arrays.sort(nums);
    int ans = 1, left = 0;
    long sum = 0;  
    for (int right = 0; right < nums.length; right++)
    {
        sum += nums[right];
        while ((long) nums[right] * (right - left + 1) > sum + k) 
        {
            sum -= nums[left++];
        }
        ans = Math.max(ans, right - left + 1);
    }
    return ans;
    }
}