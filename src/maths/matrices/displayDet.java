package maths.matrices;

public class displayDet {
    public void Matrix(int[][] x, String z, long det) {
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
                System.out.println("-****");
            }else{
                int temp;
                if((l%2!=0 && q%2==0) | (l%2==0 && q%2!=0)){
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

            int g = x.length/2;

            for(int i=0; i<r; i++) {
                System.out.print("\t    |");
                n = 0;
                for(int j=0; j<r; j++) {
                    if(s[i][j].length() < clen[n]) {
                        for(int p=s[i][j].length(); p<clen[n]; p++) System.out.print(" ");
                        System.out.print(s[i][j]+" ");
                    }else {
                        System.out.print(s[i][j]+" ");
                    }
                    n++;
                }
                if(i == g) {
                    System.out.print("\b|");
                    System.out.println("\t= "+det);
                }else {
                    System.out.println("\b|");
                }
            }
        }
    }
}
