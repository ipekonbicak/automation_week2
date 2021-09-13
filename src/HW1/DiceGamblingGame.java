package HW1;

import java.util.Random;
import java.util.Scanner;

public class DiceGamblingGame {

    public static void main(String[] args) {

        // Oyunun bitişişni kontrol etmek için.
        int winnings = 0, diceNumber ;
        String controller;
        Scanner rollDice = new Scanner(System.in);
        Random rand= new Random();
        System.out.println("***** Welcome to Dice Gambling Game *****");
        System.out.println("For starting press 'y'");
        controller = rollDice.nextLine();
        diceNumber = rand.nextInt(6) + 1;

        while (controller.equals("y") && winnings < 50 && winnings != 50){
            if((diceNumber == 1) || (diceNumber == 2)){
                System.out.println("Ups!! You lost.. Your dice number is " +diceNumber+ ".");
                controller = "n";
            }else if(diceNumber == 3){
                System.out.println("Your dice number is " +diceNumber+ ". Press 'y' to roll the dice again.Press n to exit the game.");
                controller = rollDice.nextLine();
                diceNumber = rand.nextInt(6) + 1;
            }else{
                System.out.println("Your dice number is " +diceNumber+ ". Press 'y' to roll the dice again.Press n to exit the game.");
                winnings = winnings + diceNumber;
                controller = rollDice.nextLine();
                diceNumber = rand.nextInt(6) + 1;
            }
        }
        if(winnings > 0){
            System.out.print("You win " +winnings+ " Dolar.");
        }else if(winnings == 50){
            System.out.println("You have earned the maximum amount of money you can earn. You win " +winnings+ " Dolar.");
        }
        System.out.println("The game was ended. ");

    }
}
