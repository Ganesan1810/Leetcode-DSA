class Solution(object):
    def uniformArray(self, nums1):
        nums1.sort()
        if nums1[0] % 2 == 0:
            return all(x % 2 == 0 for x in nums1)
        return True