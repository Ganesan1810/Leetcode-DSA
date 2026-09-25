class Solution {
    public int minimumOneBitOperations(int n) {
        int bit = 0;
        if(n<=1)
            return n;
        while((1<<bit) <= n) 
            bit++;
        int min_op = minimumOneBitOperations (n - (1 << bit-1));
        return ((1<<bit) - 1) - min_op;
        
        
    }
}