package maths.matrices;

public class toMultiply implements checkOrder {
    public boolean check(int[][][] mat) {
        int n1,m2,i;
        boolean flag=false;
        for(i=0; i<mat.length-1; i++) {
            n1 = mat[i][0].length;
            m2 = mat[i+1].length;

            if(n1 != m2){
                flag = true;
                System.out.println("Order of a Matrix["+(i+2)+"] does not match with other Matrices...! Addition is Not Possible.");
                break;
            }
        }

        return flag;
    }

    public boolean check(double[][][] mat) {
        int n1,m2,i;
        boolean flag=false;
        for(i=0; i<mat.length-1; i++) {
            n1 = mat[i][0].length;
            m2 = mat[i+1].length;

            if(n1 != m2){
                flag = true;
                System.out.println("Order of a Matrix["+(i+2)+"] does not match with other Matrices...! Addition is Not Possible.");
                break;
            }
        }

        return flag;
    }
}
