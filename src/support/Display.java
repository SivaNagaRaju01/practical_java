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

    public void Matrix(int[][] x, String z) {
        int r,c;
        r = x.length;
        if(r == 0){
            System.out.println("\t***----***");
            System.out.println("\t   |NA|");
        }else{
            int m=0,n=0;
            c = x[0].length;
            String[][] s = new String[r][c];

            int[] clen = new int[c];
            int rlen = 0;

            for(int[] i: x){
                n = 0;
                for(int j: i){
                    s[m][n] = String.valueOf(j);
                    n++;
                }
                m++;
            }

            n = 0;
            for(int i=0; i<c; i++){
                clen[n] = 0;
                for(int j=0; j<r; j++){
                    clen[n] = Math.max(clen[n], s[j][i].length());
                }
                rlen += clen[n];
                n++;
            }
            int q = z.length();
            int l = rlen+c-1;
            if(l < 9+q) {
                System.out.print("\t****-");
                for(int i=0; i<rlen+c-1; i++){
                    System.out.print("-");
                }
                System.out.print("\t-****");
            }else{
                int temp;
                if((l%2!=0 && q%2==0) | (l%2!=0 && q%2==0)){
                    temp = (9+q)/2;
                }else{
                    temp = (8+q)/2;
                }

                System.out.print("\t*****");
                for(int i=0; i<l/2-temp-1; i++){
                    System.out.print("*");
                }
                System.out.print("|");
                System.out.print("Matrix");
                if((l%2!=0 && q%2==0) | (l%2==0 && q%2!=0)){
                    System.out.print("-");
                }
                System.out.print("["+z+"]");
                
                System.out.print("|");
                for(int i=0; i<l/2-temp-1; i++){
                    System.out.print("*");
                }
                System.out.println("*****");
            }

            for(String[] i: s) {
                System.out.print("\t    |");
                n = 0;
                for(String j: i) {
                    if(j.length() < clen[n]) {
                        for(int p=j.length(); p<clen[n]; p++) System.out.print(" ");
                        System.out.print(j+" ");
                    }else{
                        System.out.print(j+" ");
                    }
                    n++;
                }
                System.out.println("\b|");
            }
        }
    }

    static void Matrix(String[][] x) {
        for(String[] i: x) {
            System.out.print("\t    |");
            for(String j: i) {
                System.out.print(j+" ");
            }
            System.out.println("\b|");
        }
    }
}
