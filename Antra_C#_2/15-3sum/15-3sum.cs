public class Solution {
    public IList<IList<int>> ThreeSum(int[] newArr) {
        //two pointer approach
     //   HashSet<IList<int>> hash1 = new HashSet<IList<int>>();
        List<IList<int>> answer = new List<IList<int>>();
        
        for(int i =0;i< newArr.Length;i++)
        {
            Console.WriteLine(newArr[i]);
        }
        Array.Sort(newArr);
        for(int i =0;i< newArr.Length;i++)
        {
            if(i != 0)
            {
                if(newArr[i] == newArr[i-1])
                {
                    continue;
                }
            }
           int j = i+1;
           int k = newArr.Length - 1;
            while(j<k)
            {
                if(newArr[i] + newArr[j] + newArr[k]== 0)
                {
                    answer.Add(new List<int>{newArr[i],newArr[j],newArr[k]});
                    j++;
                    while(newArr[j] == newArr[j-1] && j < k)
                    {
                        j++;
                    }
                }
                else if(newArr[i] + newArr[j] + newArr[k]< 0)
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
        }
        //Console.WriteLine(hash1);
        return answer;
    }
}