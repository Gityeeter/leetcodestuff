class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    //    HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        HashMap<List<Integer>, Integer> list_map = new HashMap<List<Integer>, Integer>();
        for(int i =0; i< nums.length -2 ; i++)
        {
            HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
            int adjusted_total = -1 * nums[i];
            for(int j =i+1; j< nums.length ; j++)
            {
                if(numbers.containsKey(nums[j]))
                {
                    numbers.put(nums[j],numbers.get(nums[j]) + 1);
                }
                else
                {
                    numbers.put(nums[j],1);
                }
                
            }
         //   System.out.println("fixing " + nums[i]);
            for(int j =i+1; j< nums.length ; j++)
            {
           //     System.out.println("2nd is " + nums[j]);
                int required = adjusted_total - nums[j];
                if(numbers.containsKey(required))
                {
                    if(numbers.get(required) == 1)
                    {
                        numbers.remove(nums[j]);
                    }
                    else
                    {
                        numbers.put(nums[j],numbers.get(nums[j]) - 1);
                    }
                }
                
                if(numbers.containsKey(required))
                {
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(required);
                    Collections.sort(temp);
                    if(!list_map.containsKey(temp))
                    {
                        answer.add(temp);
                        list_map.put(temp,1);
                    }
                    
                    // System.out.println("adding.... " + temp);
                }
             //   numbers.put(nums[j],nums[j]);
            }
            
        }
        return answer;
    }
}