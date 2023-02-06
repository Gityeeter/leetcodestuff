class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] answer = new int[2*n];
        int count = 0;
        for(int i =0;i<nums.length;i = i +2)
        {
            answer[i] = nums[count];
            answer[i+1] = nums[count+n];
            System.out.println(answer[i] + " ///" + answer[i+1]);
            count++;
        }
        return answer;
    }
}