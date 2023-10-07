package maths.matrices;

public class MatrixDet {
    public int det(int[][] mat) {
        int det = 0;
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

    public long det(long[][] mat) {
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

    public int[][] subMat(int[][] mat, int p, int q) {
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

    public double[][] subMat(double[][] mat, int p, int q) {
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

    public long[][] subMat(long[][] mat, int p, int q) {
        int n = mat.length;
        if(n <= 1) {
            System.out.println("This Matrix Doesn't hava any Sub-Matrix...!");
            return null;
        }

        long[][] x = new long[n-1][n-1];
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
