// This Game is Created by Gunesh Mohane
// On dated 16-03-2022
package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Players Move

        System.out.println("This is Rock, Papper & Scissors..... ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Rock :- Press 1.....");
        System.out.println("Papper :- Press 2.....");
        System.out.println("Scissor :- Press 3.....");
        System.out.print("Enter :- ");
        int Number = scan.nextInt();
        switch (Number) {
            case 1 -> System.out.println("You Choose Rock.");
            case 2 -> System.out.println("You Choose Papper.");
            case 3 -> System.out.println("You Choose Scissor.");
        }

        // PC Move
        Random rn = new Random();
        int random = rn.nextInt(3) + 1;

        switch (random) {
            case 1 -> System.out.println("Computer Choose Rock.");
            case 2 -> System.out.println("Computer Choose Papper.");
            case 3 -> System.out.println("Computer Choose Scissor.");
        }


        // Result

        if (Number == 1 && random == 3){
            System.out.println("Congratulations, You are Won.");
        }
        else if (Number == 2 && random == 1){
            System.out.println("Congratulations, You are Won.");
        }
        else if (Number == 3 && random == 2){
            System.out.println("Congratulations, You are Won.");
        }
        else if(Number == random){
            System.out.println("Your Game is Tie.");
        }
        else{
            System.out.println("You are Lost & Computer Wins.");
        }
    }
}
