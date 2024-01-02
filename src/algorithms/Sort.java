package algorithms;

class base {
    static void swap(int[] ar, int i, int j) {
        int t;
        t = ar[i];
        ar[i] = ar[j];
        ar[j] = t;
    }

    static void swap(double[] ar, int i, int j) {
        double t;
        t = ar[i];
        ar[i] = ar[j];
        ar[j] = t;
    }
}

public class Sort extends base {

    public void bubble_sort(int[] list) {
        int n = list.length;
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(list[j] > list[j+1]) swap(list, j, j+1);
            }
        }
    }

    public void bubble_sort(double[] list) {
        int n = list.length;
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(list[j] > list[j+1]) swap(list, j, j+1);
            }
        }
    }

    public void selection_sort(int[] list) {
        int n = list.length;
        int x,t;

        for(int i=0; i<n-1; i++){
            //Display show = new Display();
            x = list[i];
            t = i;
            for(int j=i+1; j<n; j++){
                if(list[j] < x) {
                    x = list[j];
                    t = j;
                }
            }
            if(t != i) swap(list, i, t);
            //show.Array(list, "Itteration["+(i+1)+"]");
        }
    }

    public void selection_sort(double[] list) {
        //Display show = new Display();
        int n = list.length;
        double x;
        int t;

        for(int i=0; i<n-1; i++){
            x = list[i];
            t = i;
            for(int j=i+1; j<n; j++){
                if(list[j] < x) {
                    x = list[j];
                    t = j;
                }
            }
            if(t != i) swap(list, i, t);
            //show.Array(list, "Itteration["+(i+1)+"]");
        }
    }

    public void insertion_sort(int[] list) {
        //Display show = new Display();
        int n = list.length;
        int j;

        for(int i=0; i<n-1; i++) {
            j = i+1;
            //c = 0;
            while(j>0 && list[j] < list[j-1]){
                swap(list, j, j-1);
                j--;
                //show.Array(list, "Itteration["+(i+1)+"]["+(c+1)+"]");
                //c++;
            }
        }
    }

    public void insertion_sort(double[] list) {
        //Display show = new Display();
        int n = list.length;
        int j;

        for(int i=0; i<n-1; i++) {
            j = i+1;
            //c = 0;
            while(j>0 && list[j] < list[j-1]){
                swap(list, j, j-1);
                j--;
                //show.Array(list, "Itteration["+(i+1)+"]["+(c+1)+"]");
                //c++;
            }
        }
    }

    public void merge_sort(int[] list) {
        int p,r;
        p = 0;
        r = list.length;

        devide(list, p, r-1);
    }

    public void merge_sort(double[] list) {
        int p,r;
        p = 0;
        r = list.length;

        devide(list, p, r-1);
    }

    private static void devide(int[] x, int p, int r) {
        int q = (p + r) / 2;
        if(r > q) {
            devide(x, p, q);
            devide(x, q+1, r);
            merge(x, p, q, r);
        }
    }

    private static void merge(int[] x, int p, int q, int r) {
        //Display show = new Display();
        int m, n;
        m = q-p+1;
        n = r-q;

        int[] L,R;
        L = new int[m];
        R = new int[n];

        for(int i=0; i<m; i++) {
            L[i] = x[p+i];
        }

        for(int i=0; i<n; i++) {
            R[i] = x[q+1+i];
        }

        //System.out.println();
        //show.Array(L, "\tL");
        //show.Array(R, "\tR");

        int i=0, j=0, k=p;
        while(i<m && j<n) {
            if(L[i] <= R[j]){
                x[k] = L[i];
                i++;
            }else{
                x[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<m) {
            x[k] = L[i];
            i++;
            k++;
        }

        while(j<n) {
            x[k] = R[j];
            j++;
            k++;
        }
        //show.Array(x, "\tList");
    }

    private static void devide(double[] x, int p, int r) {
        int q = (p + r) / 2;
        if(r > q) {
            devide(x, p, q);
            devide(x, q+1, r);
            merge(x, p, q, r);
        }
    }

    private static void merge(double[] x, int p, int q, int r) {
        //Display show = new Display();
        int m, n;
        m = q-p+1;
        n = r-q;

        double[] L,R;
        L = new double[m];
        R = new double[n];

        for(int i=0; i<m; i++) {
            L[i] = x[p+i];
        }

        for(int i=0; i<n; i++) {
            R[i] = x[q+1+i];
        }

        //System.out.println();
        //show.Array(L, "\tL");
        //show.Array(R, "\tR");

        int i=0, j=0, k=p;
        while(i<m && j<n) {
            if(L[i] <= R[j]){
                x[k] = L[i];
                i++;
            }else{
                x[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<m) {
            x[k] = L[i];
            i++;
            k++;
        }

        while(j<n) {
            x[k] = R[j];
            j++;
            k++;
        }
        //show.Array(x, "\tList");
    }

    public void quick_sort(int[] list) {
        sort(list, 0, list.length-1);
    }

    public void quick_sort(double[] list) {
        sort(list, 0, list.length-1);
    }

    private static void partition(int[] list, int p, int q, int r) {
        sort(list, p, q-1);
        sort(list, q+1, r);
    }

    private static void sort(int[] list, int p, int r) {
        //Display show = new Display();

        if(r > p) {
            //show.subArray(list, p, (r+1), "\tSubArray");
            int n = r+1;
            int x = list[r];

            int i,q = p;
            for(i=p; i<n; i++) {
                if(i<n-1 && list[i] < x) {
                    swap(list,i,q);
                    q++;
                }
                if(i==(n-1)) {
                    swap(list, i, q);
                }
            }

            /*show.subArray(list, p, (r+1), "\tSubArray");
             *System.out.println("\tp, q and r : "+p+", "+q+" and "+r);
             *System.out.println();
            */
            partition(list,p,q,r);
        }
    }

    private static void partition(double[] list, int p, int q, int r) {
        sort(list, p, q-1);
        sort(list, q+1, r);
    }

    private static void sort(double[] list, int p, int r) {
        //Display show = new Display();

        if(r > p) {
            //show.subArray(list, p, (r+1), "\tSubArray");
            int n = r+1;
            double x = list[r];

            int i,q = p;
            for(i=p; i<n; i++) {
                if(i<n-1 && list[i] < x) {
                    swap(list,i,q);
                    q++;
                }
                if(i==(n-1)) {
                    swap(list, i, q);
                }
            }

            /*show.subArray(list, p, (r+1), "\tSubArray");
             *System.out.println("\tp, q and r : "+p+", "+q+" and "+r);
             *System.out.println();
            */
            partition(list,p,q,r);
        }
    }

    void callMethod(int[] list) {
        System.out.println("Must Override this Method.");
        return;
    }
}
