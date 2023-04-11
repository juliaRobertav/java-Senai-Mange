package jogo;
import java.util.Random;
import java.util.Scanner;

public class campo3 {
    public static void main(String[] args) {
    }

    public static void  iniciaMinas(int[][] m) {
    for(int x = 0;x<5;x++){
        for (int y = 0; y < 5; y++) {
            if(m[x][y]==0){
                System.out.println("-");
            }else if(m[x][y]==1){
                System.out.println("x");
            }else{
                System.out.println("*");
            }
        }
    }
    }

    public static void jogador(int  [][]j) {
        Scanner sc = new Scanner(System.in);
        int [][] minas = new int[5][5];
        Random random = new Random();
        int l = random.nextInt(5);
        int c = random.nextInt(5); for (int i = 0; i < 3; i++) {
            System.out.println("Start!");
            drawTab(minas);
            
            System.out.printf("Enter your guess for row #%d: ", i + 1);
            int foundl = sc.nextInt();

            System.out.printf("Enter your guess for column #%d: ", i + 1);
            int foundc = sc.nextInt();

            if (foundl == l && foundc == c) {
                System.out.println("Congratulations!!!🎉🎉🎉");
                minas[l][c] = 2;
                drawTab(minas);
                return;
            } else {
                System.out.println("Sorry, that's not the treasure.❌❌❌");
                minas[foundl][foundc] = 1;
            }
        }
        System.out.println("Game Over, BOMB💥💥💥");
        minas[l][c] = 2;
            drawTab(minas);
    }

    public static void drawTab (int[][] minas) {
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
    }


}       
