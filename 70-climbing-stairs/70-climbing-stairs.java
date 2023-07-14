class Solution {
    public int climbStairs(int n) 
    {
        int[] array = new int[n+1];
        if(n >= 2)
        {
            array[0] = 0;
            array[1] = 1;
            array[2] = 2;
        }
        else
        {
            return n;
        }
        for(int i =3;i<=n;i++)
        {
           array[i] = array[i-1] + array[i-2];

        }
         for(int i =2;i<=n;i++)
        {
           System.out.println(array[i]);

        }
         
        return array[n];
    }
}