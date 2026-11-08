class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; 
        int j=0;
        int[] dup=new int[n];
        for (int i=n-k;i<n;i++)
            dup[j++]=nums[i];
        for(int i=0;i<n-k;i++)
            dup[j++]=nums[i];
        for(int i=0;i<n;i++)
            nums[i]=dup[i];
    }
}