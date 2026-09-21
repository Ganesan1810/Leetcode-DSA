class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=1;i<=s.length();i++)
        {
            int charVal = 'z' - s.charAt(i - 1) + 1;
            sum+=i*charVal;
        }
        return sum;
    }
}