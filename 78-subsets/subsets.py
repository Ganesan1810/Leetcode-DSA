class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res=[[]]
        for num in nums:
            n=len(res)
            for i in range(n):
                interval=res[i]+[num]
                res.append(interval)
        return res