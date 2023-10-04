package support;

public class Display {
    public void Array(int[] x, String s) {
        System.out.print(s+": [");

        for(int i: x) {
            System.out.print(i+", ");
        }

        System.out.println("\b\b]");
    }

    public void Array(double[] x, String s) {
        System.out.print(s+": [");

        for(double i: x) {
            System.out.print(String.format("%.3f", i)+", ");
        }

        System.out.println("\b\b]");
    }

    public void subArray(int[] x, int p, int r, String s) {
        System.out.print(s+": [");

        while(p<r) {
            System.out.print(x[p]+", ");
            p++;
        }

        System.out.println("\b\b]");
    }

    public void subArray(double[] x, int p, int r, String s) {
        System.out.print(s+": [");

        while(p<r) {
            System.out.print(x[p]+", ");
            p++;
        }

        System.out.println("\b\b]");
    }

    
}
