package jogo;

import java.util.Scanner;
import java.util.Random;

public class campo2 {
    public static void main(String[] args) {
        
        Scanner game = new Scanner(System.in);

        int [][] minas = new int[5][5];
        Random random = new Random();
        int l = random.nextInt(5);
        int c = random.nextInt(5);
        int play = game.nextInt();
        System.out.println("Welcome!!!☆*: .｡. o(≧▽≦)o .｡.:*☆");
        System.out.println("You have 3 chances, Good luck!:D💕");
        System.out.println("Enter your guess for row: ");
        int foundl = game.nextInt();
        System.out.println("Enter your guess for column: ");
        int foundc = game.nextInt();

        switch (play) {
            case 1:
                if(foundl==l&&foundc==c){
                    System.out.println("🎉🎉🎉");
                    minas[l][c] = 2;
                    return;
                } else {
                    System.out.println("Sorry, that's not the treasure.❌❌❌");
                    minas[foundl][foundc] = 1;
                }
                 break;

            case 2:
                System.out.println("Game Over, BOMB💥💥💥");
                minas[l][c] = 2;
                break;

            case 3:
                for (int[] row : minas) {
                    for (int cell : row) {
                        if (cell == 0) {
                            System.out.print("- ");
                        } else if (cell == 1) {
                            System.out.print("X ");
                        } else {
                            System.out.print("* ");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
                break;

            default:
                System.out.println("ERROR❌❌❌");
        }

    }
}
