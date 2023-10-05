package maths.matrices;

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
}

public class Matrix extends base{
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
}
