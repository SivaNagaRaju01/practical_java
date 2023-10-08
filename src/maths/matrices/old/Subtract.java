package maths.matrices.old;

public class Subtract extends toAdd implements Matrix {
    public int[][] matrix(int[][][] mat) {
        int[][] m;
        if(check(mat)) {
            return null;
        }

        int t = mat.length;
        int r = mat[0].length;
        int c = mat[0][0].length;
        m = new int[r][c];

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                m[i][j] = mat[0][i][j];
                for(int k=1; k<t; k++) {
                    m[i][j] -= mat[k][i][j]; 
                }
            }
        }

        return m;
    }

    public double[][] matrix(double[][][] mat) {
        double[][] m;
        if(check(mat)) {
            return null;
        }

        int t = mat.length;
        int r = mat[0].length;
        int c = mat[0][0].length;
        m = new double[r][c];

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                m[i][j] = mat[0][i][j];
                for(int k=1; k<t; k++) {
                    m[i][j] -= mat[k][i][j]; 
                }
            }
        }

        return m;
    }
}
