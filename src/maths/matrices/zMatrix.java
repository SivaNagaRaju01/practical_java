package maths.matrices;

import java.io.IOException;

class base {
    static boolean sumCheck(int[][][] mat) {
        int m1,n1,m2,n2,i;
        boolean flag=false;
        for(i=0; i<mat.length-1; i++) {
            m1 = mat[i].length;
            n1 = mat[i][0].length;
            m2 = mat[i+1].length;
            n2 = mat[i+1][0].length;

            if(m1 != m2 | n1 != n2){
                flag = true;
                System.out.println("Order of a Matrix["+(i+2)+"] does not match with other Matrices...! Addition is Not Possible.");
                break;
            }
        }

        return flag;
    }

    static boolean multCheck(int[][][] mat) {
        int n1,m2,i;
        boolean flag=false;
        for(i=0; i<mat.length-1; i++) {
            n1 = mat[i][0].length;
            m2 = mat[i+1].length;

            if(n1 != m2){
                flag = true;
                System.out.println("Order of a Matrix["+(i+2)+"] does not match with other Matrices...! Addition is Not Possible.");
                break;
            }
        }

        return flag;
    }
    

    static boolean sumCheck(double[][][] mat) {
        int m1,n1,m2,n2,i;
        boolean flag=false;
        for(i=0; i<mat.length-1; i++) {
            m1 = mat[i].length;
            n1 = mat[i][0].length;
            m2 = mat[i+1].length;
            n2 = mat[i+1][0].length;

            if(m1 != m2 | n1 != n2){
                flag = true;
                System.out.println("Order of a Matrix["+(i+2)+"] does not match with other Matrices...! Addition is Not Possible.");
                break;
            }
        }

        return flag;
    }

    static boolean multCheck(double[][][] mat) {
        int n1,m2,i;
        boolean flag=false;
        for(i=0; i<mat.length-1; i++) {
            n1 = mat[i][0].length;
            m2 = mat[i+1].length;

            if(n1 != m2){
                flag = true;
                System.out.println("Order of a Matrix["+(i+2)+"] does not match with other Matrices...! Addition is Not Possible.");
                break;
            }
        }

        return flag;
    }
}

public class zMatrix extends base{
    public int[][] addition(int[][][] mat) {
        int[][] m;
        if(sumCheck(mat)) {
            return null;
        }

        int t = mat.length;
        int r = mat[0].length;
        int c = mat[0][0].length;
        m = new int[r][c];

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                m[i][j] = 0;
                for(int k=0; k<t; k++) {
                    m[i][j] += mat[k][i][j]; 
                }
            }
        }

        return m;
    }

    public double[][] addition(double[][][] mat) {
        double[][] m;
        if(sumCheck(mat)) {
            return null;
        }

        int t = mat.length;
        int r = mat[0].length;
        int c = mat[0][0].length;
        m = new double[r][c];

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                m[i][j] = 0;
                for(int k=0; k<t; k++) {
                    m[i][j] += mat[k][i][j]; 
                }
            }
        }

        return m;
    }

    public int[][] subtraction(int[][][] mat) {
        int[][] m;
        if(sumCheck(mat)) {
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

    public double[][] subtraction(double[][][] mat) {
        double[][] m;
        if(sumCheck(mat)) {
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

    public int[][] product(int[][][] mat) throws IOException {
        int t = mat.length;
        if(t < 2) {
            System.out.println("Can't Multiply a Single Matrix...!");
            return null;
        }

        if(multCheck(mat)) {
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

    public double[][] product(double[][][] mat) throws IOException {
        int t = mat.length;
        if(t < 2) {
            System.out.println("Can't Multiply a Single Matrix...!");
            return null;
        }

        if(multCheck(mat)) {
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

    public long det(int[][] mat) {
        long det = 0;
        int n = mat.length;

        if(n == 0) {
            System.out.println("This Matrix Doesn't have any Elements to caliculate DET...!");
        }else if(n != mat[0].length) {
            System.out.println("This is Not a Square Matrix. DET is not possible...!");
        }else if(n == 1) {
            det = mat[0][0];
        }else {
            for(int i=0; i<n; i++) {
                if(i%2 == 0) {
                    det += mat[0][i]*det(subMat(mat, 0, i));
                }else {
                    det -= mat[0][i]*det(subMat(mat, 0, i));
                }
            }
        }

        return det;
    }

    public static int[][] subMat(int[][] mat, int p, int q) {
        int n = mat.length;
        if(n <= 1) {
            System.out.println("This Matrix Doesn't hava any Sub-Matrix...!");
            return null;
        }

        int[][] x = new int[n-1][n-1];
        int r=0, c=0;
        for(int i=0; i<n; i++) {
            if(i != p) {
                c = 0;
                for(int j=0; j<n; j++) {
                    if(j != q) {
                        x[r][c] = mat[i][j];
                        c++;
                    }
                }
                r++;
            }
        }

        return x;
    }

    public double det(double[][] mat) {
        double det = 0;
        int n = mat.length;

        if(n == 0) {
            System.out.println("This Matrix Doesn't have any Elements to caliculate DET...!");
        }else if(n != mat[0].length) {
            System.out.println("This is Not a Square Matrix. DET is not possible...!");
        }else if(n == 1) {
            det = mat[0][0];
        }else {
            for(int i=0; i<n; i++) {
                if(i%2 == 0) {
                    det += mat[0][i]*det(subMat(mat, 0, i));
                }else {
                    det -= mat[0][i]*det(subMat(mat, 0, i));
                }
            }
        }

        return det;
    }

    public static double[][] subMat(double[][] mat, int p, int q) {
        int n = mat.length;
        if(n <= 1) {
            System.out.println("This Matrix Doesn't hava any Sub-Matrix...!");
            return null;
        }

        double[][] x = new double[n-1][n-1];
        int r=0, c=0;
        for(int i=0; i<n; i++) {
            if(i != p) {
                c = 0;
                for(int j=0; j<n; j++) {
                    if(j != q) {
                        x[r][c] = mat[i][j];
                        c++;
                    }
                }
                r++;
            }
        }

        return x;
    }
}
