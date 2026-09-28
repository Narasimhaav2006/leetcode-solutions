class Solution
 {
    public int findContentChildren(int[] g, int[] s)
     {
      Arrays.sort(s);    // sorting cookies array
      Arrays.sort(g);    //sorting childerrn array
       int children=0;  //pointer for the children array
       int cookie=0;    //pointer for the cookies array
       while(cookie<s.length&& children<g.length) //looping till the length of the both of the arrays
       {
        if(s[cookie]>=g[children])
        {
            children++;
        }
        cookie++;
       }
       return children;
    }
}