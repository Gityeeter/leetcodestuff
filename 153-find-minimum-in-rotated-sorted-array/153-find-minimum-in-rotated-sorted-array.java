class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (end + start)/2;
        int answer = 10000;
        while(start <= end)
        {
            mid = (end + start)/2;
            System.out.println(start + ":::" + mid + ":::"+ end);
            
            if(start > nums.length - 1 || start < 0 || end > nums.length - 1 || end < 0)
            {
             //   System.out.println("2");
                break;
            }
            else if(end - start == 0)
            {
                if(nums[start] < answer)
                {
                    answer = nums[start];
                }
                break;
            }
            else if(end - start == 1)
            {
                int temp = Math.min(nums[start],nums[end]);
                if(temp < answer)
                {
                    answer = temp;
                }
                break;
            }
            else if(nums[start] < nums[end])
            {
                if(nums[start] < answer)
                {
                    answer = nums[start];
                }
                break;
            }
            else if(nums[start] < nums[mid])
            {
                if(nums[start] < answer)
                {
                    answer = nums[start];
                }
                start = mid + 1;
            }
            else if(nums[mid] < nums[end])
            {
                if(nums[mid] < answer)
                {
                    answer = nums[mid];
                }
                end = mid - 1;
            }
           
        }
        // System.out.println("5");
            return answer;
    }
}