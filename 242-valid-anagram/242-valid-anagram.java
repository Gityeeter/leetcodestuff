class Solution {
    public boolean isAnagram(String s, String t) 
	{
		int[] array = new int[26];
		
		for(int i = 0;i< s.length();i++)
        {
        	array[s.charAt(i) - (int)'a'] = array[s.charAt(i) - (int)'a'] + 1;
        }
		for(int i = 0;i< t.length();i++)
        {
        	array[t.charAt(i) - (int)'a'] = array[t.charAt(i) - (int)'a'] - 1;
        }
		for(int i = 0;i< 26;i++)
        {
        	if(array[i] != 0)
        	{
        		return false;
        	}
        }
		return true;
        
    }
}