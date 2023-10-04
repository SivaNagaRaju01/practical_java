package support;

import java.io.IOException;

public class readSquareMatrix extends readMatrix {
    public int[][] intMatrix() throws IOException {
        int n = read_int("Enter Order of Matrix");
        int[][] x = new int[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                x[i][j] = read_int("Enter Element["+(i+1)+"]["+(j+1)+"]");
            }
        }

        return x;
    }

    public double[][] doubleMatrix() throws IOException {
        int n = read_int("Enter Order of Matrix");
        double[][] x = new double[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                x[i][j] = read_double("Enter Element["+(i+1)+"]["+(j+1)+"]");
            }
        }

        return x;
    }
}
