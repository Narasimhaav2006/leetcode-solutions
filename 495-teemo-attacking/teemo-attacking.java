class Solution
 {
    public int findPoisonedDuration(int[] timeSeries, int duration)
     {
        int total=0;
        if(timeSeries.length==0) //checks if he is not attacked the time duration is zero
        {
            return 0;
        }
        for(int i =0;i<timeSeries.length-1;i++) //in this loop goes through the attach except the last one
        {
            total+= Math.min(timeSeries[i+1]-timeSeries[i],duration); // calculate the time gap between the two attacks and compares the time gap and duration and gets the minimum one
        }
        return total+duration; //duration is added because in the for loop last attacked is missed so it should be expecetely added
    }
}