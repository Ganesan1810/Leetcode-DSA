class Solution {
    public int gcd(int len1,int len2)
    {
        if(len1==0) return len2;
        if(len2==0) return len1;
        int ans=1;
        for(int i=1;i<=len1 && i<=len2;i++)
        {
            if(len1%i==0 && len2%i==0)
            {
                ans=i;
            }
        }
        return ans;
    }
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))
        {
            return "";
        }
        int gcd_len=gcd(str1.length(),str2.length());
        return str1.substring(0,gcd_len);

    }
}