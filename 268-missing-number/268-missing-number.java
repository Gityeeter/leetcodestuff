class Solution {
    public int missingNumber(int[] nums) {
        int temp = 0;
        for(int i = 0;i<=nums.length;i++)
        {
            temp = temp ^ i;
        }
        for(int i = 0;i<nums.length;i++)
        {
            temp = temp ^ nums[i];
         }
        return temp;
    }
}