class Solution
 {
    public int findMaxConsecutiveOnes(int[] nums)
     {
        int curr_count=0;   //to find the count of the elements
        int max_count=0;    //to find the maximum concecutive count
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                curr_count++;    //increases the count value
                max_count=Math.max(max_count,curr_count); //checks which one is having the max count value
            }
            else
            {
                curr_count=0;  //if encountered the new value sets the count value to 0
            }
        }
        return max_count;
    }
}