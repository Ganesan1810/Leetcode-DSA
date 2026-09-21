class Solution:
    def sortArray(self, nums: list[int]) -> list[int]:
        def merge_sort(nums):
            n=len(nums)
            if n<=1:
                return nums
            mid=n//2
            left=nums[:mid]
            right=nums[mid:]
            left=merge_sort(left)
            right=merge_sort(right)
            res=[]
            i=j=0
            while i<len(left) and j<len(right):
                if left[i]<=right[j]:
                    res.append(left[i])
                    i+=1
                else:
                    res.append(right[j])
                    j+=1
            while i<len(left):
                res.append(left[i])
                i+=1
            while j<len(right):
                res.append(right[j])
                j+=1
            return res
        nums=merge_sort(nums)
        return nums
            