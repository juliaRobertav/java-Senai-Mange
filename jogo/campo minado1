package jogo;
import java.util.Random;
import java.util.Scanner;

public class campominado {
    public static void main(String[] args) {

        Scanner jogo = new Scanner(System.in);
        //System.out.println("Line:");
        //int line = jogo.nextInt();
        //System.out.println("Column:");
        //int column = jogo.nextInt();
        //boolean terminar = false;
        //boolean ganhou = false;

        int [][] minas = new int[5][5];
        Random random = new Random();
        int l = random.nextInt(5);
        int c = random.nextInt(5);


        System.out.println("Welcome!!!☆*: .｡. o(≧▽≦)o .｡.:*☆");
        System.out.println("You have 3 chances, Good luck!:D💕");

        //int tab[][] = new int[line][column];
        for (int i = 0; i < 3; i++) {
            System.out.println("Start!");
            drawMinas(minas);
            
            System.out.printf("Enter your guess for row #%d: ", i + 1);
            int foundl = jogo.nextInt();

            System.out.printf("Enter your guess for column #%d: ", i + 1);
            int foundc = jogo.nextInt();

            if (foundl == l && foundc == c) {
                System.out.println("Congratulations!!!🎉🎉🎉");
                minas[l][c] = 2;
                drawMinas(minas);
                return;
            } else {
                System.out.println("Sorry, that's not the treasure.❌❌❌");
                minas[foundl][foundc] = 1;
            }
        }
        System.out.println("Game Over, BOMB💥💥💥");
        minas[l][c] = 2;
            drawMinas(minas);
    }


    public static void drawMinas(int[][] minas) {
        for (int[] row : minas) {
            for (int cell : row) {
                if (cell == 0) {
                    System.out.print("- ");
                } else if (cell == 1) {
                    System.out.print("⭕ ");
                } else {
                    System.out.print("💣 ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }


}
