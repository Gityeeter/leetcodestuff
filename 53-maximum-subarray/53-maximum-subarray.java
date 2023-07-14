class Solution {
    public int maxSubArray(int[] nums) 
    {
        int maxValue = -99999999;
        int currentValue = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(currentValue + nums[i] < nums[i])
            {
                currentValue = nums[i];
            }
            else
            {
                currentValue = currentValue + nums[i];
            }
            if(currentValue > maxValue)
            {
                maxValue = currentValue;
            }
        }
        return maxValue;
    }
}