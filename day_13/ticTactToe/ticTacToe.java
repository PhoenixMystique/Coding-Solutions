package day_13.ticTactToe;

import java.util.Random;
import java.util.Scanner;

public class ticTacToe {
    int[] arr;
   ticTacToe(){
        arr = new int[]{-11, -11, -11, -11, -11, -11, -11, -11, -11};
   }

    boolean Start() throws InterruptedException {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 9; i++) {
            System.out.println("\n");
            printBoard();
            if(i%2!=0){
                System.out.print("\nPlayer1 Chose the Position $");
                arr[scan.nextInt()-1]=1;
            }
            else {
                System.out.print("\n Bot Playing!!!\n\n\n");
                Thread.sleep(1000);
                arr[rand.nextInt(9)]=0;
            }
            if ("NO".equals(isGameOver())){continue;} else if ("X".equals(isGameOver())) {
                System.out.println("\n\n\n_______________Player1 is the Winner!!!!!___________________\n");
               return true;
            }
            else {
                System.out.println("\n\n\n________________BOT is the Winner!!!!!______________\n");
              return true;
            }
        }
        printBoard();
        System.out.println("\n\n______________________________________DRAW_______________________________________");
   return false;
   }

    private String isGameOver() {
        for (int a = 0; a < 8; a++) {
            int line=11 ;

            switch (a) {
                case 0:
                    line = arr[0] + arr[1] + arr[2];
                    break;
                case 1:
                    line = arr[3] + arr[4] + arr[5];
                    break;
                case 2:
                    line = arr[6] + arr[7] + arr[8];
                    break;
                case 3:
                    line = arr[0] + arr[3] + arr[6];
                    break;
                case 4:
                    line = arr[1] +arr[4] + arr[7];
                    break;
                case 5:
                    line = arr[2] + arr[5] + arr[8];
                    break;
                case 6:
                    line = arr[0] + arr[4] + arr[8];
                    break;
                case 7:
                    line =arr[2] + arr[4] + arr[6];
                    break;
            }
            //For X winner
            if (line==3) {
                return "X";
            }

            // For O winner
            else if (line==0) {
                return "O";
            }
        }
    return "NO";
    }
        private  void printBoard(){
            int index = 0;
            for (int i = 1; i <= 5; i++) {

                for (int j = 1; j <= 5; j++) {

                    if (i % 2 != 0) {
                        if (j % 2 != 0) {
                            if (arr[index] == -11) {
                                System.out.print("  ");
                            } else if (arr[index] == 0) {
                                System.out.print(" O");
                            } else {
                                System.out.print(" X");
                            }

                            index++;
                        } else {
                            System.out.print(" |");
                        }
                    } else {
                        if (j == 1) {
                            System.out.print("---");
                            continue;
                        }
                        if (j == 5) {
                            System.out.print("--");
                            continue;
                        }
                        System.out.print("--");

                    }

                }
                System.out.println("");


            }

        }

}