package exercicios;

import java.util.Scanner;
import java.util.Random;

public class ex2 {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        Random random = new Random();

        int[] i = new int[6];
        int b = Integer.MIN_VALUE;  //b=bigger
        int indexb = -1;

        for (int j = 0; j <i.length ; j++) {
            i[j] = random.nextInt(20);
            System.out.println(i[j]);

            if (i[j]>b){
                b = i[j];
                indexb = j;
            }
        }

        System.out.printf("Higher number is %d, in the index %d", b, indexb);

    }
}
