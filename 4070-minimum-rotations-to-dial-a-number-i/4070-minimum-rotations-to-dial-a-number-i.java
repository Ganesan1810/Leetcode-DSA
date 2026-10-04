class Solution {
    public int minRotations(String s) {
        int total=0;
        int curr=0;
        for(char num : s.toCharArray())
        {
            int diff=Math.abs((num -'0')-curr);
            total+=Math.min(diff,10-diff);
            curr=num-'0';
        }
        return total;
        
        
    }
}