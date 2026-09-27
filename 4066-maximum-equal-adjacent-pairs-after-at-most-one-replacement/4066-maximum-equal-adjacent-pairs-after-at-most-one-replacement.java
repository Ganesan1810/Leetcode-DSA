class Solution {
    public int maxEqualAdjacentPairs(int[] nums) {
        HashMap<String,Integer> freq = new HashMap<>();
        int pairs=0 , max_pairs=0;
        int n=nums.length;

        for(int i=0;i<n-1;i++)
        {
            int x=nums[i];
            int y=nums[i+1];
            
            if(x==y) 
            {
                pairs++;
            }
            else
            {
                int min_ele = Math.min(x,y);
                int max_ele = Math.max(x,y);
                
                String key = min_ele + "_" + max_ele;

                int newfreq = freq.getOrDefault(key,0)+1;
                freq.put(key,newfreq);
                
                max_pairs=Math.max(newfreq,max_pairs);
                
            }
            
        }
        return pairs+max_pairs;
        
    }
}