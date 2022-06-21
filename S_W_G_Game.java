package com.company;
import java.util.Scanner;
import java.util.Random;

public class S_W_G_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int no, inp, man = 0, comp = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("----Enter---- \n1 for scissor\n2 for Paper\n3 for rock\n");// for computer same 1 for scissor  2 for Paper  3 for rock
            inp = sc.nextInt();
            no = ran.nextInt(1, 4);
            System.out.println("comuter opt "+no);

            if (inp == 1 && no == 2) {
                System.out.println("You win \nyour option for scissor and computer opt paper\n");
                man++;
            } else if (inp == 1 && no == 3) {
                System.out.println("You loss\nYou option is scissor and computer opt Rock\n");
                comp++;
            } else if (inp == 2 && no == 1) {
                System.out.println("You loss\nYou option is paper and computer opt Scissor\n");
                comp++;
            } else if (inp == 2 && no == 3) {
                System.out.println("You win\nYou option is Paper and computer opt Rock\n");
                man++;
            } else if (inp == 3 && no == 1) {
                System.out.println("You win\nYou option is Rock and computer opt Scissor\n");
                man++;
            } else if (inp == 3 && no == 2) {
                System.out.println("You loss\nYou option is Rock and computer opt Paper\n");
                comp++;
            }
            else if (inp == no) {
                System.out.println("No point for this turn as both opt same option\n");
                comp++;
            }
            else {
                System.out.println("something went wrong!\nAs you give invalid input");
            }
        }
        if(comp > man){
            System.out.println("Computer win this match as computer point is "+comp+" and you get "+man);
        }
        else {
            System.out.println("You win this match as computer point is "+comp+" and you get "+man);
        }
    }
}
