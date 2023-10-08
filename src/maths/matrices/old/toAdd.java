package maths.matrices.old;

public class toAdd implements checkOrder {
    public boolean check(int[][][] mat) {
        int m1,n1,m2,n2,i;
        boolean flag=false;
        for(i=0; i<mat.length-1; i++) {
            m1 = mat[i].length;
            n1 = mat[i][0].length;
            m2 = mat[i+1].length;
            n2 = mat[i+1][0].length;

            if(m1 != m2 | n1 != n2){
                flag = true;
                System.out.println("Order of a Matrix["+(i+2)+"] does not match with other Matrices...! Addition is Not Possible.");
                break;
            }
        }

        return flag;
    }

    public boolean check(double[][][] mat) {
        int m1,n1,m2,n2,i;
        boolean flag=false;
        for(i=0; i<mat.length-1; i++) {
            m1 = mat[i].length;
            n1 = mat[i][0].length;
            m2 = mat[i+1].length;
            n2 = mat[i+1][0].length;

            if(m1 != m2 | n1 != n2){
                flag = true;
                System.out.println("Order of a Matrix["+(i+2)+"] does not match with other Matrices...! Addition is Not Possible.");
                break;
            }
        }

        return flag;
    }
}
