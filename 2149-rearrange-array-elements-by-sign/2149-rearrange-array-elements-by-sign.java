class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2 =new ArrayList<>();
        ArrayList<Integer> arr3=new ArrayList<>();
        for(int num:nums)
        {
            if(num>0)
            {
                arr1.add(num);
            }
            else{
                arr2.add(num);
            }
        }
        for(int i=0;i<nums.length/2;i++)
        {
            arr3.add(arr1.get(i));
            arr3.add(arr2.get(i));
        }
        int[] answer=new int[nums.length];
        
            for (int i=0;i<nums.length;i++)
            {
                answer[i]=arr3.get(i);
            }
        return answer;
        
    }
}