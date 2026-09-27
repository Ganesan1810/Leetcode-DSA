class Solution:
    def rearrangeArray(self, nums: list[int]) -> list[int]:
        freq=Counter(nums)
        ans=[]
        # print(frq)
        while freq:
            distinct_ele = sorted(freq.keys())
            for x in distinct_ele:
                ans.append(x)
                freq[x] -= 1
                if freq[x]==0:
                    del freq[x]
        return ans
        