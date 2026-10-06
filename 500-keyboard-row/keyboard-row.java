class Solution
{
    public String[] findWords(String[] words)
     {
        String row1="qwertyuiop"; //keyboard row 1
        String row2="asdfghjkl"; // keyboard row 2
        String row3="zxcvbnm"; // key board row 3
        List<String> list = new LinkedList<>(); // a list to store all the results
        for(String word:words){// reading all the words one after other
            int [] rows=new int[3]; // to check whether it belongs t0 which rows
            for( char ch:word.toLowerCase().toCharArray()){ //converting to characters and converting to lowercase and also to the array
            if(row1.indexOf(ch)!=-1) 
            rows[0]=1;
            else if(row2.indexOf(ch)!=-1)
            rows[1]=1;
            else
            rows[2]=1;
            }
            int sum=rows[0]+rows[1]+rows[2];
            if(sum==1)
            list.add(word);  // if sum is one then add it the result list

        }
        String[] arr=new String[list.size()]; // arr to convert the list to the array
        int i=0;
        for(String word:list) //reads every word in the list
        arr[i++]=word;
        return arr;

    }
}