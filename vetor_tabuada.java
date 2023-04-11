import java.util.Scanner;

public class desafiovetor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Number:");
        int number = sc.nextInt();

        int[] table = new int[11];

        for(int i=0;i<=10;i++) {
        for(int i=0;i<=table.length-1;i++)   //outro tipo de limite 
           table[i] = number*i;
            System.out.println(number+"x"+i+"="+table[i]);

        }
    }
}
