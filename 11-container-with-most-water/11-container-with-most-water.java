class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while(left < right)
        {
            int smallest = Math.min(height[left],height[right]);
            int area = smallest * (right - left);
            if(area > max)
            {
                max = area;
            }
            if(height[left] <= height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
            System.out.println("left: " + height[left] + " right: " + height[right] + " max: " + max);
        }
        return max;
    }
}