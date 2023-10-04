package support;

import java.io.IOException;

public class readMatrix extends Read {
    public int[][] intMatrix() throws IOException {
        int m = read_int("Enter Row Size");
        int n = read_int("Enter Column Size");
        int[][] x = new int[m][n];

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                x[i][j] = read_int("Enter Element["+(i+1)+"]["+(j+1)+"]");
            }
        }

        return x;
    }

    public double[][] doubleMatrix() throws IOException {
        int m = read_int("Enter Row Size");
        int n = read_int("Enter Column Size");
        double[][] x = new double[m][n];

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                x[i][j] = read_double("Enter Element["+(i+1)+"]["+(j+1)+"]");
            }
        }

        return x;
    }
}
