class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash1 = new HashSet<Integer>();
        for(int i = 0;i < nums.length; i++)
        {
            if(hash1.contains(nums[i]))
               {
                   return true;
               }
              else
               {
                   hash1.add(nums[i]);
               }
        }
        return false;
    }
}