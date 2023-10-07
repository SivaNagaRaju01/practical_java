package maths.matrices;

public class Multiply extends toMultiply implements Matrix {
    public int[][] matrix(int[][][] mat) {
        int t = mat.length;
        if(t < 2) {
            System.out.println("Can't Multiply a Single Matrix...!");
            return null;
        }

        if(check(mat)) {
            return null;
        }

        int[][] m;
        m = multiply(mat[0], mat[1]);

        if(t > 2) {
            for(int i=2; i<t; i++) {
                m = multiply(m, mat[i]);
            }
        }

        return m;
    }

    private static int[][] multiply(int[][] x, int[][] y) {
        int m = x.length;
        int n = y[0].length;
        int p = y.length;

        int[][] z = new int[m][n];

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                z[i][j] = 0;
                for(int k=0; k<p; k++) {
                    z[i][j] += x[i][k] * y[k][j];
                }
            }
        }

        return z;
    }

    public double[][] matrix(double[][][] mat) {
        int t = mat.length;
        if(t < 2) {
            System.out.println("Can't Multiply a Single Matrix...!");
            return null;
        }

        if(check(mat)) {
            return null;
        }

        double[][] m;
        m = multiply(mat[0], mat[1]);

        if(t > 2) {
            for(int i=2; i<t; i++) {
                m = multiply(m, mat[i]);
            }
        }

        return m;
    }

    private static double[][] multiply(double[][] x, double[][] y) {
        int m = x.length;
        int n = y[0].length;
        int p = y.length;

        double[][] z = new double[m][n];

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                z[i][j] = 0;
                for(int k=0; k<p; k++) {
                    z[i][j] += x[i][k] * y[k][j];
                }
            }
        }

        return z;
    }
}
