class Solution {
    public int lengthOfLongestSubstring(String s) {
         if(s.length() == 0)
        {
            return 0;
        }
        if(s.length() == 1)
        {
            return 1;
        }
        int start = 0;
        int end = 0;
        int max = 1;
        HashSet<Character> set = new HashSet<Character>();
        set.add(s.charAt(0));
        for(int i =1; i < s.length() ; i++)
        {
            if(!set.contains(s.charAt(i)))
            {
                set.add(s.charAt(i));
                end = i;
            }
            else
            {
                int current = start;
                while(s.charAt(current) != s.charAt(i))
                {
                    set.remove(s.charAt(current));
                    current++;
                }
               //set.remove(s.charAt(current));
                start = current + 1;
                
            }
            System.out.println(start);
           max = Math.max(max, ((end - start) + 1));
        }
        
        return max;
    }
}