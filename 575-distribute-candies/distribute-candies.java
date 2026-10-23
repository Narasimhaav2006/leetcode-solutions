class Solution
 {
    public int distributeCandies(int[] candyType) 
    {
        Set<Integer> set=new HashSet(); //hash set counts the unique candytypes
        for(int c:candyType)
        set.add(c); //adding of each candy type
        return Math.min(candyType.length/2,set.size());
        //min returns the min value
        //sets the limits to eat the candy
        //number of different candies available
    }
}




