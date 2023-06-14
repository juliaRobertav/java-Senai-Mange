import java.util.Scanner;

public class des4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Input a number between 1 and 1000 (enter 0 to finish): ");
            int num = sc.nextInt();
            int numDouble = num * 2;
            if (num > 0 && num <= 1000){
                System.out.printf("O dobro de %d é igual a %d\n", num, numDouble);
            } else if (num == 0) {
                System.out.println("Program Finish");
                break;
            } else{
                System.out.println("Error");
            }
        }
    }
}
