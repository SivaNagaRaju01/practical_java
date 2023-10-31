package maths.matrices;

public class Add implements Matrix{
    int[][] imat1,imat2;
    long[][] lmat1, lmat2;
    double[][] dmat1, dmat2;
    int r1,c1,r2,c2;

    private boolean check() {
        if(c1==0 | c2==0){
            System.out.println("Fatal Error: Column Size of Your Matrix is ZERO..!");
            return true;
        }
        else if(r1 == r2){
            if(c1 != c2) {
                System.out.println("Error: Column Size Of Both Matrices Must Be Equal...!\n\t1: R1="+r1+", R2="+r2);
                return true;
            }
        }
        else{
            System.out.println("Error: Row Size Of Both Matrices Must Be Equal...!\n\t1: R1="+r1+", R2="+r2);
            return true;
        }

        return false;
    }

    public Add(int[][] x, int[][] y) {
        r1 = x.length;
        r2 = y.length;

        try {
            c1 = x[0].length;
            c2 = y[0].length;

            if(check()) {
                imat1 = imat2 = null;
            }else {
                imat1 = x;
                imat2 = y;
            }
        }
        catch(ArrayIndexOutOfBoundsException exe) {
            System.out.println("Fatal Error: Row Size of Your Matrix is ZERO..!");
            imat1 = imat2 = null;
        }
    }

    public Add(long[][] x, long[][] y) {
        r1 = x.length;
        r2 = y.length;

        try {
            c1 = x[0].length;
            c2 = y[0].length;

            if(check()) {
                lmat1 = lmat2 = null;
            }else {
                lmat1 = x;
                lmat2 = y;
            }
        }
        catch(ArrayIndexOutOfBoundsException exe) {
            System.out.println("Fatal Error: Row Size of Your Matrix is ZERO..!");
            imat1 = imat2 = null;
        }
    }

    public Add(double[][] x, double[][] y) {
        r1 = x.length;
        r2 = y.length;

        try {
            c1 = x[0].length;
            c2 = y[0].length;

            if(check()) {
                dmat1 = dmat2 = null;
            }else {
                dmat1 = x;
                dmat2 = y;
            }
        }
        catch(ArrayIndexOutOfBoundsException exe) {
            System.out.println("Fatal Error: Row Size of Your Matrix is ZERO..!");
            imat1 = imat2 = null;
        }
    }

    public int[][] matrix(int w) {
        int[][] m;

        if(imat1 == null) m = null;
        else{
            m = new int[r1][c1];
            for(int i=0; i<r1; i++) {
                for(int j=0; j<c1; j++) {
                    m[i][j] = imat1[i][j] + imat2[i][j]; 
                }
            }
        }

        return m;
    }

    public long[][] matrix(long w) {
        long[][] m;

        if(dmat1 == null) m = null;
        else{
            m = new long[r1][c1];
            for(int i=0; i<r1; i++) {
                for(int j=0; j<c1; j++) {
                    m[i][j] = lmat1[i][j] + lmat2[i][j]; 
                }
            }
        }

        return m;
    }

    public double[][] matrix(double w) {
        double[][] m;

        if(dmat1 == null) m = null;
        else{
            m = new double[r1][c1];
            for(int i=0; i<r1; i++) {
                for(int j=0; j<c1; j++) {
                    m[i][j] = dmat1[i][j] + dmat2[i][j]; 
                }
            }
        }

        return m;
    }
}
