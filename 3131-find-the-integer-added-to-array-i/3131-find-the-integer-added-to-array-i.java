class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int sum1=0,sum2=0;
        for(int n1 : nums1)
        {
            sum1+=n1;
        }
        for(int n2 : nums2)
        {
            sum2+=n2;
        }
        return (sum2-sum1)/n;
    }
}