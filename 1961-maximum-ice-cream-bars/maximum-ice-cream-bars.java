class Solution 
{
    public int maxIceCream(int[] costs, int coins)
     {
        Arrays.sort(costs);
        int count=0;
        int sum=0;
        for(int i=0;i<costs.length;i++) //condition to check weather we can afford it or not
        {  if(sum+costs[i]<=coins)
        {
             sum+=costs[i];
             count++;
        }
        else
        {
            break; //if we cant afford it just break the loop
        }
            
          
        }
        return count;
        
    }
}