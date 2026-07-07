class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length != m*n){
            return new int[0][0];
        }
        int[][] res=new int[m][n];
        int i=0,j=0;
        for(int num:original){
            res[i][j++]=num;
            if(j>=n){
                j=0;
                i++;
            }
        }
        return res;
    }
}
