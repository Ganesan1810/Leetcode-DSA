class Solution {
    public int minMoves(int[] nums) {
        int max_ele=0;
        for(int n : nums){
            max_ele=Math.max(max_ele,n);
        }
        int count=0;
        while(true)
        {
           boolean flag=false;

           for(int i=0;i<nums.length;i++)
           {  
             
              if(nums[i]<max_ele)
              {
                 nums[i]=nums[i]+1;
                 count++;
                 flag=true;
              }
            }
           if(!flag) 
             break;
        }
       return count;
        
        // int len=nums.length;
        // int max_ele=0;
        // int sum=0;
        // for(int n:nums)
        // {
        //     max_no=Math.max(max_ele,n);
        //     sum+=n;
        // }
        // return (max_ele * len) - sum;
    }
}