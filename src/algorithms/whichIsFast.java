package algorithms;

import java.io.IOException;

import support.*;

class BubbleSort extends Sort {
    public void callMethod(int[] list){
        bubble_sort(list);
        System.out.println("\nBubbleSort Ended\n");
    }
}

class SelectionSort extends Sort {
    public void callMethod(int[] list){
        selection_sort(list);
        System.out.println("\nSelectionSort Ended\n");
    }
}

class InsertionSort extends Sort {
    public void callMethod(int[] list){
        insertion_sort(list);
        System.out.println("\nInsertionSort Ended\n");
    }
}

class createThread implements Runnable {
    static Sort srt;
    Thread thrd;
    static int[] list;
    createThread(String name) {
        thrd = new Thread(this, name);
    }

    public static createThread toBubbleSort(int[] l, String name) {
        System.out.println("BubbleSort is Starting.");
        list = l;
        createThread newThread = new createThread(name);
        srt = new BubbleSort();
        newThread.thrd.start();
        return newThread;
    }

    public static createThread toSelectionSort(int[] l, String name) {
        System.out.println("SelectionSort is Starting.");
        list = l;
        createThread newThread = new createThread(name);
        srt = new SelectionSort();
        newThread.thrd.start();
        return newThread;
    }

    public static createThread toInsertionSort(int[] l, String name) {
        System.out.println("InsertionSort is Starting.");
        list = l;
        createThread newThread = new createThread(name);
        srt = new InsertionSort();
        newThread.thrd.start();
        return newThread;
    }

    public void run() {
        Display show = new Display();
        //int[] list = {99, 46, 54, 31, 44, 98, 11, 31, 68, 9, 11, 58, 934, 10, 33, 91, 1, 66, 81, 2};
        srt.callMethod(list);
        show.Array(list, thrd.getName());
        System.out.println("\n"+thrd.getName()+" is Ended.\n");
    }
}

public class whichIsFast {
    public static void main(String args[]) throws IOException {
        readArray read;
        Display show = new Display();
        read = new readRandomArray();

        int[] list = read.intArray();
        show.Array(list, "List");
        System.out.println();


        System.out.println("This is Main Thread...!");

        createThread t1 = createThread.toBubbleSort(list, "BubbleSort");
        createThread t2 = createThread.toSelectionSort(list, "SelectionSort");
        //createThread t3 = createThread.toInsertionSort(list, "InsertionSort");

        int i=0;

        try {
            do {
                Thread.sleep(100);
                System.out.println("->"+i);
            } while(t1.thrd.isAlive() || t2.thrd.isAlive() /*|| t3.thrd.isAlive()*/);
        }catch(InterruptedException exe) {
            System.out.println("Interrupted"+ exe);
        }

        System.out.println("Main Thread is ended...");
    }
}
