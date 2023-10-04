package support;

import java.io.IOException;
import java.util.Random;

public class readRandomArray extends readArray {
    public int[] intArray()throws IOException {
        Random rand = new Random();
        int n = read_int("Enter Size of the List");
        int[] x = new int[n];

        for(int i=0; i<n; i++) {
            x[i] = rand.nextInt(100);
        }

        return x;
    }

    public double[] doubleArray()throws IOException {
        Random rand = new Random();
        int n = read_int("Enter Size of the List");
        double[] x = new double[n];

        for(int i=0; i<n; i++) {
            x[i] = rand.nextDouble(100);
        }

        return x;
    }
}
