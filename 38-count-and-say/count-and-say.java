class Solution {
    public String countAndSay(int n) {
        String res="1";
        for(int i=1;i<n;i++)
        {
            res=buildNext(res);
        }
        return res;
    }
    public String buildNext(String s){
        StringBuilder ans=new StringBuilder();
        int count=1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1)) count++;
            else{
                ans.append(count).append(s.charAt(i-1));
                count=1;
            }
        }
        ans.append(count).append(s.charAt(s.length()-1));
        return ans.toString();
    }
}