package maths.matrices.old;

import support.*;
import java.io.IOException;

public class zdetDemo {
    public static void main(String args[]) throws IOException {
        //Read read = new Read();
        readMatrix readmat = new randSquareMatrix();
        displayDet show = new displayDet();
        zMatrix mat = new zMatrix();

        int[][] x = readmat.intMatrix();
        long det = mat.det(x);
        
        show.Matrix(x, "DET", det);
    }
}
