class Solution {
    public class Tuple 
	{
		public Tuple(int number, int freq) {
			this.number = number;
			this.freq = freq;
		}
		public int number;
		public int freq;
	}
	public class TupleComparator implements Comparator<Tuple>
	{
		public int number;
		public int freq;
		
		@Override
		public int compare(Tuple o1, Tuple o2) {
			return o2.freq-o1.freq;
		}
	}
	public int[] topKFrequent(int[] nums, int k) 
    {
        int[] answer = new int[k];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i< nums.length;i++)
        {
        	if(map.containsKey(nums[i]))
        	{
        		map.put(nums[i], map.get(nums[i])+1);
                System.out.println(map.get(nums[i]));
        	}
        	else
        	{
        		map.put(nums[i], 1);
        	}
        }
        PriorityQueue<Tuple> pq = new PriorityQueue<Tuple>(new TupleComparator());
        for (Integer i : map.keySet()) 
        { 
            int freq = map.get(i);
        	pq.add(new Tuple(i,freq));
        }
        for(int i = 0;i< k;i++)
        {
        	answer[i] = pq.poll().number;
        }
        return answer;
    }
}