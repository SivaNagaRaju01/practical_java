package maths.matrices;

public class Adjoint implements SupportMatrix {
    SupportMatrix get;
    public int[][] matrix(int[][] mat) {
        get = new Cofactor();
        int[][] x = get.matrix(mat);
        get = new Transpose();
        x = get.matrix(x);
        return x;
    }

    public long[][] matrix(long[][] mat) {
        get = new Cofactor();
        long[][] x = get.matrix(mat);
        get = new Transpose();
        x = get.matrix(x);
        return x;
    }

    public double[][] matrix(double[][] mat) {
        get = new Cofactor();
        double[][] x = get.matrix(mat);
        get = new Transpose();
        x = get.matrix(x);
        return x;
    }
}
