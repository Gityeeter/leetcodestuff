class Solution {
    public int getSum(int a, int b) {
        int c = a;
        int d = b;
  //      System.out.println(3 << 1);
        while(d!=0)
        {
            int temp_c =c ^ d;
            int temp_d = (c & d) << 1;
            c = temp_c;
            d = temp_d;
        }
        return c;
    }
}