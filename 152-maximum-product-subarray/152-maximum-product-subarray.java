class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int highest = nums[0];
        for(int i = 1;i< nums.length;i++)
        {
           int temp_max = Math.max(max*nums[i],Math.max(min*nums[i],nums[i]));
            int temp_min = Math.min(max*nums[i],Math.min(min*nums[i],nums[i]));
            max = temp_max;
            min = temp_min;
            if(highest < max )
            {
                highest = max;
              //  System.out.println(max);
            }
            
            System.out.println(max);
        }
        return highest;
    }
}