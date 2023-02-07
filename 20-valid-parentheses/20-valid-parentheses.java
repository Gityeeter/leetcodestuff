class Solution {
    public boolean isValid(String s) {
        if(s.length() > 400)
        {
            System.out.println("string length = " + s.length());
        }
       
       if(s.length() == 0)
       {

       //    System.out.println("empty and passed");
           return true;
       }
       if(s.length() == 1)
       {
            System.out.println("one ");
           return false;
       }  
       else
       {
         char[] temp = s.toCharArray();
         char original = temp[0];
         char first = temp[0];
         int extra = 0;
         if(first == '(' )
         {
             first = ')';
         }
         else if(first == '[' )
         {
             first = ']';
         }
         else if(first == '{' )
         {
             first = '}';
         }
         else
         {
             return false;
         }
      //   int i = 1;
         
         int i = 1;

         for(i = 1;i<temp.length;i++)
         {
             char close = temp[i];
              close = temp[i];
          //     System.out.println("checking " + first + " and " + close);
               if(original == close)
               {
           //        System.out.println("extra detected");
                   extra++;
                  
               }
               if(extra > 0)
               {
                    if(first == close)
                    {
          //          System.out.println("extra subtracted");
                  //  i++;
                    extra--;
                    
                    }
               }
               else
               {
                    if(first == close)
                    {
           //             System.out.println("got it");
                        i++;
                        break;
                    
                    }
               }
            
               
        //     System.out.println("i is now " + i);
         }
         
         i--;
         char close = temp[i];
         if(i == temp.length -1)
         {
             if(first != close)
             {
                 return false;
             }
         }    
            
            
             
         
         boolean sub_result  = true;
         System.out.println("i is " + i);
       //  if(i - 1 > 1)
   //      {
             sub_result = isValid(s.substring(1,i));
    //     }  
        if(sub_result == false)
        {
      //       System.out.println("three");
            return false;
        }
        
       System.out.println("i is " + i);
        
        if(i < temp.length-1)
        {

           return isValid(s.substring(i + 1,temp.length));
        }
        else
        {
     //       System.out.println("end and passed for " + s);
            return true;
        }
       }
    }
}