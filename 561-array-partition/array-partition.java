class Solution
 {
    public int arrayPairSum(int[] nums)
     {
        Arrays.sort(nums); // sorting the array elements 
        int count=0; //to store the sum result
        for(int  i=0;i<nums.length;i=i+2) //i=i+2 after sorting it checks the all the first elements sum 
        {
            count+=nums[i];  //stors the sum of the smallest elements sum
        }
        return count; //return the greatest sum of all the smallest sum
    }
}