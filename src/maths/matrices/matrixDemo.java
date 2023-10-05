package maths.matrices;

import support.*;
import java.io.IOException;

public class matrixDemo {
    public static void main(String args[]) throws IOException {
        randMatrix readmat = new randMatrix();
        Read read = new Read();
        Matrix mat = new Matrix();
        Display show = new Display();
        double[][][] x;

        int n = read.read_int("Enter Number of Matrices");
        x = new double[n][][];

        for(int i=0; i<n; i++) {
            x[i] = readmat.doubleMatrix();
            System.out.println();
        }

        System.out.println();
        for(int i=0; i<n; i++) {
            show.Matrix(x[i], String.valueOf(i+1));
            System.out.println();
        }

        double[][] smat = mat.addition(x);
        if(smat != null) {
            show.Matrix(smat, "Add");
        }
    }
}
