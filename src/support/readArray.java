package support;

import java.io.IOException;

public class readArray extends Read {
    public int[] intArray()throws IOException {
        int n = read_int("Enter Size of the List");
        int[] x = new int[n];

        for(int i=0; i<n; i++) {
            x[i] = read_int("Enter Element["+(i+1)+"]");
        }

        return x;
    }

    public double[] doubleArray()throws IOException {
        int n = read_int("Enter Size of the List");
        double[] x = new double[n];

        for(int i=0; i<n; i++) {
            x[i] = read_double("Enter Element["+(i+1)+"]");
        }

        return x;
    }
}
