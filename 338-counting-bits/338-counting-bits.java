class Solution {
    public int[] countBits(int n) {
        int[] answer = new int[n+1];
        if(n ==0)
        {
            answer[0] = 0;
            return answer;
        }
        if(n == 1)
        {
            answer[0] = 0;
            answer[1] = 1;
            return answer;
        }
        answer[0] = 0;
        answer[1] = 1;
        for(int i = 2; i< answer.length;i++)
        {
            int prev = i & (i-1);
            answer[i] = answer[prev] + 1;
        }
        return answer;
    }
}