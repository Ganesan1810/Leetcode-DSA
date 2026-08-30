class Solution:
    def sumDecoded(self, nums: list[int]) -> int:
        mod=10**9+7
        total=0
        for num in nums:
            width=num%10
            d=num//10
            d_str=str(d)
            x=int(d_str[:width])
            y=int(d_str[width:])

            total=(total+pow(x,y,mod)) % mod 
            
        return total
            
        