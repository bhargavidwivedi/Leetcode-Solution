class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;

        if(m*n != r*c){
            return mat;
        }

        int result [][] = new int[r][c];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                int k = i*m+j;
                result[k/c][k%c] = mat[i][j];
            }
        }
        return result;
    }
}