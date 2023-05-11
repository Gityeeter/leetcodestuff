class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        Set<List<Integer>> hashy = new HashSet<>();
        for(int i = 0;i< nums.length;i++)
        {
            int left = i+1;
            int right = nums.length -1;
            int target = -nums[i];
             System.out.println(target);
            while(left < right)
            {
               int current = nums[left] + nums[right];
               
                if( current == target)
                {
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    if(!hashy.contains(temp))
                    {
                        answer.add(temp);
                        hashy.add(temp);
                    }
                   
                    right--;
                }
                else if(current > target)
                {
                    right--;
                }
                else
                {
                    left++;
                }
            }
        }
        return answer;
    }
}