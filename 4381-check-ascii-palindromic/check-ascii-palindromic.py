class Solution:
    def isPalindromic(self, s: str) -> bool:
        res=""
        for ch in s:
            ascii_code=ord(ch)
            bit_code=format(ascii_code,'08b')
            res+=bit_code
        return res==res[::-1]
        