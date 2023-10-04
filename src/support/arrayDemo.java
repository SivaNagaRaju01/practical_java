package support;

import java.io.IOException;

public class arrayDemo {
    public static void main(String args[]) throws IOException {
        readArray read;
        read = new readRandomArray();
        Display show = new Display();
        double[] x;

        x = read.doubleArray();
        show.Array(x, "List");
    }
}
