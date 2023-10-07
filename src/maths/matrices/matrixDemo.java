package maths.matrices;

import support.*;
import java.io.IOException;

public class matrixDemo {
    public static void main(String args[]) throws IOException {
        randMatrix readmat = new randMatrix();
        Read read = new Read();
        OLDMatrix mat = new OLDMatrix();
        Display show = new Display();
        //double[][][] x;
        int[][][] x;

        int n = read.read_int("Enter Number of Matrices");
        //x = new double[n][][];
        x = new int[n][][];

        for(int i=0; i<n; i++) {
            //x[i] = readmat.doubleMatrix();
            x[i] = readmat.intMatrix();
            System.out.println();
        }

        System.out.println();
        for(int i=0; i<n; i++) {
            show.Matrix(x[i], String.valueOf(i+1));
            System.out.println();
        }

        //double[][] smat = mat.subtraction(x);
        int[][] smat = mat.product(x);
        if(smat != null) {
            show.Matrix(smat, "product");
        }
    }
}
