class Solution {
    public boolean ispalindrome(String s)
    {
        StringBuilder s1= new StringBuilder(s);
        s1.reverse();
        return s.equals(s1.toString());
    }
    public String firstPalindrome(String[] words) {
        int n=words.length;
        for(int i=0;i<n;i++)
        {
            if(ispalindrome(words[i]))
            {
                return words[i];
            }
        }
        return "";
    }
}