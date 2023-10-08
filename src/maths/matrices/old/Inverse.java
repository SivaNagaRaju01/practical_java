package maths.matrices.old;

public class Inverse {
    public double[][] matrix(int[][] mat) {
        MatrixDet matrix = new MatrixDet();
        int det = matrix.det(mat);
        if(det == 0) {
            System.out.println("Det of the given Matrix is Zero. Inverse of such matrix is doesn't Exist..!");
            return null;
        }

        SupportMatrix get = new Adjoint();
        int[][] x = get.matrix(mat);
        int n = mat.length;
        double[][] m = new double[n][n];

        int r=0, c=0;
        for(int[] i: x) {
            c = 0;
            for(int j: i) {
                m[r][c] = (1/(double)det) * j;
                c++;
            }
            r++;
        }

        return m;
    }

    public double[][] matrix(double[][] mat) {
        MatrixDet matrix = new MatrixDet();
        double det = matrix.det(mat);
        if(det == 0) {
            System.out.println("Det of the given Matrix is Zero. Inverse of such matrix is doesn't Exist..!");
            return null;
        }

        SupportMatrix get = new Adjoint();
        double[][] x = get.matrix(mat);
        int n = mat.length;
        double[][] m = new double[n][n];

        int r=0, c=0;
        for(double[] i: x) {
            c = 0;
            for(double j: i) {
                m[r][c] = (1/(double)det) * j;
            }

        }

        return m;
    }

    public double[][] matrix(long[][] mat) {
        MatrixDet matrix = new MatrixDet();
        long det = matrix.det(mat);
        if(det == 0) {
            System.out.println("Det of the given Matrix is Zero. Inverse of such matrix is doesn't Exist..!");
            return null;
        }

        SupportMatrix get = new Adjoint();
        long[][] x = get.matrix(mat);
        int n = mat.length;
        double[][] m = new double[n][n];

        int r=0, c=0;
        for(long[] i: x) {
            c = 0;
            for(long j: i) {
                m[r][c] = (1/(double)det) * j;
            }

        }

        return m;
    }

}
