package support;

import java.io.IOException;

public class matrixDemo {
    public static void main(String args[]) throws IOException {
        readMatrix read = new randMatrix();
        Display show = new Display();
        int[][] x = read.intMatrix();
        show.Matrix(x,"Demo");
    }
}
