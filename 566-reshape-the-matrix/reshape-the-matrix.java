class Solution 
{
    public int[][] matrixReshape(int[][] mat, int r, int c)
     {
        int row =mat.length;
        int column =mat[0].length;
        if((row*column)!=(r*c))return mat;
        int[][] rel=new int[r][c];
        int rows=0;
        int columns=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                rel[rows][columns]=mat[i][j];
                columns++;
                if(columns==c)
                {
                    columns=0;
                    rows++;
                }
            }
        }
        return rel;
    }
}