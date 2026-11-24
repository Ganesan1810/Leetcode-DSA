class Solution {
    public boolean isSubsequence(String s, String t) {
        int left=0;
        for(int i=0;i<s.length();i++)
        {
            boolean find=false;
            for(int j=left;j<t.length();j++)
            {
                if(s.charAt(i)==t.charAt(j))
                {
                    find=true;
                    left=j+1;
                    break;
                }
            }
             if(!find)
                return false;
        }
        return true;
        
    }
}