class Solution {
public:
    int maxSubarraySumCircular(vector<int>& nums) {
        int totalSum = 0;
        int maxSum = INT_MIN, minSum = INT_MAX;
        int curMax=0,curMin = 0;
    for (int x : nums) {

        curMax = max(x, curMax + x);
        maxSum = max(maxSum, curMax); 
        curMin = min(x, curMin + x);  
        minSum = min(minSum, curMin); 
        totalSum += x;
    }
    return maxSum > 0 ? max(maxSum, totalSum - minSum) : maxSum;
    }
};