public class Solution {
    public bool ContainsDuplicate(int[] nums) {
        HashSet<int> nums_hash = new HashSet<int>();
        for(int i=0;i<nums.Length;i++)
        {
            if(nums_hash.Contains(nums[i]))
            {
                return true;
            }
            else
            {
                nums_hash.Add(nums[i]);
            }
        }
        return false;
    }
}