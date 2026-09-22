class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int window_product=1;
        window_product=nums[n-1]*nums[n-2]*nums[n-3];
        int max_product=window_product;
        window_product=nums[0]*nums[1]*nums[n-1];
        max_product=Math.max(max_product,window_product);
        return max_product;
        
       
        
    }
}