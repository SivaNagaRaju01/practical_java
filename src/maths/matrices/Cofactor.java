package maths.matrices;

import support.Display;

public class Cofactor extends MatrixDet implements SupportMatrix {
    public int[][] matrix(int[][] mat) {
        Display show = new Display();
        int n = mat.length;
        if(n <= 1) {
            System.out.println("This Matrix Doesn't Have a Co-factor Matrix...!");
            return null;
        }

        int[][] x = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if((i+j)%2 == 0) x[i][j] = det(subMat(mat, i, j));
                else x[i][j] = -1*det(subMat(mat, i, j));
            }
        }
        show.Matrix(x, "CF");

        return x;
    }
    public long[][] matrix(long[][] mat) {
        int n = mat.length;
        if(n <= 1) {
            System.out.println("This Matrix Doesn't Have a Co-factor Matrix...!");
            return null;
        }

        long [][] x = new long[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if((i+j)%2 == 0) x[i][j] = det(subMat(mat, i, j));
                else x[i][j] = -1*det(subMat(mat, i, j));
            }
        }

        return x;
    }

    public double[][] matrix(double[][] mat) {
        int n = mat.length;
        if(n <= 1) {
            System.out.println("This Matrix Doesn't Have a Co-factor Matrix...!");
            return null;
        }

        double [][] x = new double[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if((i+j)%2 == 0) x[i][j] = det(subMat(mat, i, j));
                else x[i][j] = -1*det(subMat(mat, i, j));
            }
        }

        return x;
    }
}
