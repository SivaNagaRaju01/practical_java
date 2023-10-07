package maths.matrices;

import support.*;
import java.io.IOException;

public class detDemo {
    public static void main(String args[]) throws IOException {
        //Read read = new Read();
        readMatrix readmat = new randSquareMatrix();
        displayDet show = new displayDet();
        OLDMatrix mat = new OLDMatrix();

        int[][] x = readmat.intMatrix();
        long det = mat.det(x);
        
        show.Matrix(x, "DET", det);
    }
}
