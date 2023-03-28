public class Solution {
    public bool IsPalindrome(int x) {
        String numberString = x.ToString();
        char[] charArray = numberString.ToCharArray();  
        Array.Reverse(charArray);  
        String Reversed = new String(charArray);
        Console.WriteLine(Reversed);
        if(x < 0)
        {
            return false;
        }
        if(numberString.CompareTo(Reversed) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}