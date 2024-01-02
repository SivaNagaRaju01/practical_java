package support;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Read {
    public int read_int(String str)throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        System.out.print(str+": ");
        int x = Integer.parseInt(br.readLine());

        br.close();

        return x;
    }

    public double read_double(String str)throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        System.out.print(str+": ");
        double x = Integer.parseInt(br.readLine());

        br.close();

        return x;
    }
}
