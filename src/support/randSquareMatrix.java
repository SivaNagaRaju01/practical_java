package support;

import java.io.IOException;
import java.util.Random;

public class randSquareMatrix extends readSquareMatrix {
    public int[][] intMatrix() throws IOException {
        Random rand = new Random();
        int n = read_int("Enter Order of Matrix");
        int[][] x = new int[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                x[i][j] = rand.nextInt();
            }
        }

        return x;
    }

    public double[][] doubleMatrix() throws IOException {
        Random rand = new Random();
        int n = read_int("Enter Order of Matrix");
        double[][] x = new double[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                x[i][j] = rand.nextDouble();
            }
        }

        return x;
    }
}
