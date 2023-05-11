class Solution {
    public int search(int[] nums, int target) {
               int start = 0;
        int end = nums.length - 1;
        int mid = (end + start)/2;
     //   int answer = 10000;
        while(start <= end)
        {
            mid = (end + start)/2;
          //  System.out.println(start + ":::" + mid + ":::"+ end);
            
            if(start > nums.length - 1 || start < 0 || end > nums.length - 1 || end < 0)
            {
             //   System.out.println("2");
                break;
            }
            else if(end - start == 0)
            {
                if(nums[start]  == target)
                {
                    return start;
                }
                return -1;
            }
            else if(end - start == 1)
            {
                int temp = Math.min(nums[start],nums[end]);
                if(nums[start] == target)
                {
                    return start;
                }
                else if(nums[end] == target)
                {
                    return end;
                }
                return -1;
            }
            else if(nums[start] < nums[end])
            {
                System.out.println("1");
                return helper(nums,start,end,target);
            }
            else if(nums[start] < nums[mid])
            {
                System.out.println("2");
                if(target >= nums[start] && target <= nums[mid])
                {
                    return helper(nums,start,mid,target);
                }
                else
                {
                    start = mid + 1;
                }
            }
            else if(nums[mid] < nums[end])
            {
                System.out.println("3");
                if(target >= nums[mid] && target <= nums[end])
                {
                    return helper(nums,mid,end,target);
                }
                else 
                {
                    end = mid - 1;
                }
            }
           
        }
        // System.out.println("5");
            return -1;
    }
    
    
      public int helper(int[] nums,int begin, int fin, int target) 
      {
          int start = begin;
          int end = fin;
          int mid = (end + start)/2;
          while(start <= end)
          {
              mid = (end + start)/2;
              if(nums[mid] == target)
                {
                    return mid;
                }
                if(target > nums[mid])
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }
          }
        return -1;
      }
    
}