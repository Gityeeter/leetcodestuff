class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] array = new int[amount + 1];
        
        for(int i = 0; i<array.length;i++)
        {
            array[i] = -1;
        }
        array[0] = 0;
        for(int i = 1; i<array.length;i++)
        {
            int lowest = 999999;
            for(int j = 0;j< coins.length;j++)
            {
                if((i - coins[j] )>= 0)
                {
                    if(array[i - coins[j]] != -1)
                    {
                        int current = array[i - coins[j]] + 1; 
                        if(current < lowest)
                        {
                            lowest = current;
                        }
                    }
                    
                }
                
            }
            if(lowest != 999999)
            {
                array[i] = lowest;
            }
        }
         for(int i = 0; i<array.length;i++)
        {
            System.out.print(array[i]+ ",");
        }
        return array[amount];
    }
}