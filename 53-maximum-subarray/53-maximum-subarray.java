class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int current =0;
        for(int i =0;i<nums.length;i++)
            {
            
                if(current + nums[i] > 0)
                {
                    if(current + nums[i] > max)
                    {
                        max = current + nums[i];
                    }
                    current = current + nums[i];
                }
            else
                {
                if(nums[i] > max)
                {
                    max = nums[i];
                }
                    current = 0;
                }
            }
        return max;
        }
}