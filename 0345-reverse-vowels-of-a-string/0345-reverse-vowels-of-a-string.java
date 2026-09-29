class Solution {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();

        boolean[] vowel = new boolean[128];
        for (char c : "AEIOUaeiou".toCharArray())
            vowel[c] = true;

        int l = 0, r = a.length - 1;

        while (l < r) {
            while (l < r && !vowel[a[l]]) l++;
            while (l < r && !vowel[a[r]]) r--;

            char temp = a[l];
            a[l] = a[r];
            a[r] = temp;

            l++;
            r--;
        }

        return new String(a);
    }
}