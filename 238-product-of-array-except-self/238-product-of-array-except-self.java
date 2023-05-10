class Solution {
    public int[] productExceptSelf(int[] nums) {
        int previous = 1;
        int after = 1;
        int[] answer = new int[nums.length];
        for(int i = 0;i< nums.length;i++)
        {
            if(i == 0)
            {
                answer[i] = 1;
                previous = nums[i];
            }
            else
            {
                answer[i] = previous * answer[i - 1];
                previous = nums[i];
            }
        }
        
        for(int i = nums.length - 1;i> -1;i--)
        {
            if(i == nums.length - 1)
            {
                //answer[i] = 1;
                after = nums[i];
            }
            else
            {
                answer[i] = after * answer[i] ;
                after = nums[i] * after;
            }
        }
        
        return answer;
    }
}