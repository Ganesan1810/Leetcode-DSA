class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        boolean[] vowel = new boolean[128];
        for (char ch : "AEIOUaeiou".toCharArray())
        {
            vowel[ch] = true;
        }
        int l = 0, r = arr.length - 1;
        while (l < r) 
        {
            while (l < r && !vowel[arr[l]]) l++;
            while (l < r && !vowel[arr[r]]) r--;

            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }
        return new String(arr);
    }
}