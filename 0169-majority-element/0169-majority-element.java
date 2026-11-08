class Solution {
    public int majorityElement(int[] nums) {
    //solution 1
    // Arrays.sort(nums);
    // return nums[nums.length/2];
    //solution 2
    // int n=nums.length;
    // for(int i=0;i<n;i++)
    // {
    //     int count=0;
    //     for(int j=0;j<n;j++)
    //     {
    //         if(nums[i]==nums[j])
    //         {
    //             ++count;
    //         }
    //     }
    //     if(count>n/2)
    //         return nums[i];
    // }
    // return -1;
    int voter=nums[0];
    int votecount=1;
    for(int i=1;i<nums.length;i++)
    {
        if(nums[i]==voter) ++votecount;
        else --votecount;
        if(votecount==0)
        {
            voter=nums[i];
            votecount=1;
        }
    }
    return voter;
    }
}