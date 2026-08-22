class Solution {
    boolean verify(int n)
    {
        int temp=n;
        while(temp>0)
        {
            int digit=temp%10;
            if(digit==0 || n%digit!=0) 
                return false;
            temp/=10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(verify(i))
                list.add(i);
        }
        return list;
        
    }
}