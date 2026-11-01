class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
     HashSet<Integer> set1=new HashSet<>();
     HashSet<Integer> set2=new HashSet<>();
     int answer1=0,answer2=0;
     for(int n1 : nums1)
     {
        set1.add(n1);
     }
     for(int n2 : nums2)
     {
        set2.add(n2);
        if(set1.contains(n2))
            answer2++;
     }
     for(int num:nums1)
     {
        if(set2.contains(num))
            answer1++;
     }

     return new int[]{answer1,answer2};
    }
}