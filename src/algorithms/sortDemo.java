package algorithms;

import java.io.IOException;

import support.*;

public class sortDemo extends Sort {
    public static void main(String args[]) throws IOException {
        readArray read;
        Display show = new Display();
        read = new readRandomArray();
        Sort srt = new DescSort();

        //double[] list = read.doubleArray();
        int[] list = read.intArray();
        show.Array(list, "List");
        System.out.println();

        //srt.bubble_sort(list);
        //srt.selection_sort(list);
        //srt.insertion_sort(list);
        //srt.merge_sort(list);
        srt.quick_sort(list);

        show.Array(list, "Sorted-List");
        System.out.println();

        if(check(list)){
            System.out.println("Successfully Sorted...!");
        }else{
            System.out.println("Error Occured...!");
        }
    }

    static boolean check(int[] x) {
        for(int i=0; i<x.length-1; i++){
            if(x[i] < x[i+1]) return false;
        }
        return true;
    }

    static boolean check(double[] x) {
        for(int i=0; i<x.length-1; i++){
            if(x[i] < x[i+1]) return false;
        }
        return true;
    }
}
