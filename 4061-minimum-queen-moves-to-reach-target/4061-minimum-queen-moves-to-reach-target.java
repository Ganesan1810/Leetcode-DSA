class Solution {
    public int minQueenMoves(int[] source, int[] target) {
        int dr = Math.abs(source[0]-target[0]);
        int dc = Math.abs(source[1]-target[1]);

        if(dr==0 && dc==0)
            return 0;
        int res = (dr==0 || dc ==0 || dr==dc) ? 1 : 2;
        
        return res;
        
    }
}