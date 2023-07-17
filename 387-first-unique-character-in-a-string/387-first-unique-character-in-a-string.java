class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> singles = new HashMap<>();
        for(int i = 0; i< s.length();i++)
        {
            if(singles.containsKey(s.charAt(i)))
               {
                    singles.put(s.charAt(i),singles.get(s.charAt(i)) +1);
               }
               else
               {
                   singles.put(s.charAt(i),1);
               }
        }
         for(int i = 0; i< s.length();i++)
        {
            if(singles.get(s.charAt(i)) == 1)
               {
                    return i;
               }
        }       
               return -1;
    }
}