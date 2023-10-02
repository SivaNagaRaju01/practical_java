package algorithms;

import java.util.Scanner;

public class sample {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number between 1 and 9: ");
            int x = sc.nextInt();

            String[] text = {
                "[1]. I",
                "[2]. am",
                "[3]. Siva Naga Raju Tirumalsetti",
                "[4]. And",
                "[5]. This",
                "[6]. Is",
                "[7]. The",
                "[8]. Text",
                "[9]. Hello World"
            };

            for(int i=0; i<x; i++){
                System.out.println(text[i]);
            }
        }
    }
}
