class Solution {
    public boolean isVowel(char ch)
    {
        return "AEIOUaeiou".indexOf(ch)!=-1; 
    }

    public String reverseVowels(String s) 
    {
        char[] chars = s.toCharArray();
        int left =0 , right=chars.length-1;

        while(left<right)
        {
            while(left<right && !isVowel(chars[left]))  
            {
                left++;
            }
            while(left<right && !isVowel(chars[right])) 
            {
                right--;
            }

            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            
            left++;
            right--;
        }
        return new String(chars);
    }
}