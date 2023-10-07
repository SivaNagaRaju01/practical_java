package maths.matrices;

import support.*;
import java.io.IOException;

public class InverseDemo {
    public static void main(String args[]) throws IOException {
        readMatrix read = new randSquareMatrix();
        Inverse inv = new Inverse();
        Display show = new Display();
        int[][] x = read.intMatrix();
        show.Matrix(x, "I");
        double[][] y = inv.matrix(x);
        show.Matrix(y, "Inverse");
    }
}
