import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("Options:");
            System.out.println("1: Triangle Area");
            System.out.println("2: Square Area");
            System.out.println("3: Circle Area");
            System.out.println("4: Rectangle Area");
            System.out.println("Choose one of the options:");
            String option = sc.nextLine();

            switch (option) {

                case "1" :
                    double base;
                    double height;
                    double area ;
                    System.out.println("Enter the value of the base:");
                    base = sc.nextDouble();
                    System.out.println("Enter the value of the height:");
                    height = sc.nextDouble();
                    area = (base * height) / 2;
                    System.out.println("Triangle Area =" + area);
                    break;

                case "2" :
                    System.out.println("Enter the value of the base:");
                    base = sc.nextDouble();
                    System.out.println("Enter the value of the height:");
                    height = sc.nextDouble();
                    area = (base * height * 2);
                    System.out.println("Square Area ="+ area);
                    break;

                case "3":
                    double pi;
                    double radius;
                    System.out.println("Enter the value of pi:");
                    pi = sc.nextDouble();
                    System.out.println("Enter the value of the radius:");
                    radius = sc.nextDouble();
                    area = (pi * radius * 2);
                    System.out.println("Circle Area ="+area);
                    break;

                case "4":
                 System.out.println("Enter the value of the base:");
                 base = sc.nextDouble();
                    System.out.println("Enter the value of the height:");
                    height = sc.nextDouble();
                    area = (base * height);
                    System.out.println("Rectangle Area ="+area);
                    break;
                case "finish":
                    System.out.println("Ending code...");
                    System.exit(0);

                default:
                    System.out.println("This option doesn't exist.");
                    break;
            }
        }
    }
}
