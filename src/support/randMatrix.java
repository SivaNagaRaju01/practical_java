package support;

import java.io.IOException;
import java.util.Random;

public class randMatrix extends readMatrix {
    public int[][] intMatrix() throws IOException {
        Random rand = new Random();
        int m = read_int("Enter Row Size");
        int n = read_int("Enter Column Size");
        int[][] x = new int[m][n];

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                x[i][j] = rand.nextInt(10000);
            }
        }

        return x;
    }

    public double[][] doubleMatrix() throws IOException {
        Random rand = new Random();
        int m = read_int("Enter Row Size");
        int n = read_int("Enter Column Size");
        double[][] x = new double[m][n];

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                x[i][j] = rand.nextDouble(100);
            }
        }

        return x;
    }
}
