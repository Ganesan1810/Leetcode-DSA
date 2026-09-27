class Solution {
    public boolean canTransform(int[] source, int[] target) {
        int n=source.length;
        int m=target.length;
        if(n!=m)
            return false;
        
        long sum_s=0;
        long sum_t=0;
        
        for(int i=0;i<n;i++)
        {
            sum_s+=source[i];
            sum_t+=target[i];
        }
        return sum_s==sum_t;
        
    }
}