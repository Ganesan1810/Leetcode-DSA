class Solution {
    public int maxOperations(int[] nums, int k) {
        // int n=nums.length;
        // int count=0;
        // for(int i=0;i<n;i++)
        // {  
        //     if(nums[i]==0)
        //         continue;

        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(nums[j]!=0 && nums[i]+nums[j]==k)
        //         {
        //             nums[i]=0;
        //             nums[j]=0;
        //             count++;
        //             break;
        //         }
        //     }
        // }
        // return count;   // Time limit Exceeds (On^2)

        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int count=0;
        
        while(left<right)
        {
            int sum=nums[left]+nums[right];
            if(sum==k)
            {
                count++;
                left++;
                right--;
            }
            else if(sum<k) left++;
            else right--;
        }
        return count;


        
    }
}