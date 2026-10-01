class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int ele : nums)
        {
            if(map.get(ele)==1)
            {
                return ele;
            }
        }
        return -1;
    }
}