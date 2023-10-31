package maths.matrices;

public interface Matrix {
    default int[][] matrix(int x) {
        System.out.println("This Method Must Be Overriden...!");
        return null;
    }

    double[][] matrix(double x);
    long[][] matrix(long x);

    default long[][] matrix() {
        System.out.println("This Method Must Be Overriden...!");
        return null;
    }
}
