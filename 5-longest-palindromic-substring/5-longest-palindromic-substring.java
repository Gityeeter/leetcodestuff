class Solution {
    public String longestPalindrome(String s) {
        int maxValue = 1;
        String answer = s.charAt(0) + "";
        int[][] array = new int[s.length()][s.length()];
        for(int i =0;i< s.length() ; i++)
        {
            array[i][i] = 1;
        }
       for(int i =s.length() - 1;i> -1 ; i--)
        {
             for(int j =i+1;j< s.length();j++)
            {
               
               if(j == i+1)
               {
                 //  System.out.println(s.charAt(i) + ", " + s.charAt(j) );
                   if(s.charAt(i) == s.charAt(j))
                   {
                  //     System.out.println("debug 1");
                       array[i][j] = 2;
                       if(Math.abs(i - j) + 1 > maxValue)
                        {
                            answer = s.substring(i,j+1);
                            maxValue = Math.abs(i - j) + 1;
                        }
                   }
               }
               else
               {
                    if(s.charAt(i) == s.charAt(j) && (array[i+1][j-1] != 0))
                    {
                    //    System.out.println("debug 2");
                       array[i][j] = Math.abs(i - j) + 1;
                        if(Math.abs(i - j) + 1> maxValue)
                        {
                            answer = s.substring(i,j+1);
                            maxValue = Math.abs(i - j) + 1;
                        }
                        
                    }
               }
            }
     
        }
        return answer;
    }
}