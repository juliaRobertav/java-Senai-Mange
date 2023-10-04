import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert your email:");
        String email = sc.next();
        System.out.println(email);

        int tam = email.length();
        System.out.println("This string count " + tam + "  characters");

        int pos = email.indexOf("@");
        System.out.println("Number of positions up to @: " + pos + "  ");

        if (email.contains("@") && !email.endsWith("@") && !email.startsWith("@")) {
            System.out.println("Registered email!"+ email);

        }else{
            System.out.println("Invalid email");
        }
    }
}
