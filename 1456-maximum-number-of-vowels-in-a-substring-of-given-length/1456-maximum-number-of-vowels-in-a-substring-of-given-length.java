class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels=Set.of('a','e','i','o','u');
        int n=s.length();
        int currentvowels = 0;
        for (int i = 0; i < k; i++) {
            if(isvowels(s.charAt(i)))
                currentvowels++;
        }
        int maxvowels = currentvowels;
        for (int i = k; i < n; i++) {

          if(isvowels(s.charAt(i)))
            currentvowels++;
          if(isvowels(s.charAt(i-k)))
            currentvowels--;
          maxvowels=Math.max(maxvowels,currentvowels);
    }
    return maxvowels;
}
private boolean isvowels(char c){
    return c=='a'|| c=='e'|| c=='i'||c=='o'||c=='u';
}
}