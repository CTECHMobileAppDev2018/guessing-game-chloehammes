import java.util.Random;
import java.util.Scanner;
import java.lang.System;

public class GuessingGame {
//This is a meaningful comment. I dare you to not find meaning in it
  
    public static void main(String[] args){

      //Main idea: pick a number, that number is the maximum of a list guess ex. input 5 = guessing from 1-5, then guess numbers between 1 and maxnum

        System.out.println("Hello and welcome to my guessing game.");
        System.out.println("Pick a number: ");

        Scanner inputnum = new Scanner(System.in);  //This number will be the max number the player has to guess too.
        int maxnum;
        maxnum = inputnum.nextInt();
        inputnum.close();   //Closes scanner to prevent errors
        
        Random rand = new Random(); //Creates random number
        int number = rand.nextInt(maxnum);
        int tries = 0; //Will increase depending on how many tries it takes
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;

        while (win == false){  //This while loop false the code with in it repeat until win === true

            System.out.println("Guess a number between 1 and "+ maxnum +": ");
            guess = input.nextInt();
            tries++; //Increasing the number set in the variable tries by 1
            
            if (guess == number){
                win = true; //Since the number is correct win == true then ending the loop
                //First thing the guess is compared too
            }

            else if(guess < number){
                System.out.println("Number is too low, try again");
                //2nd thing guess is compared too.
            }

            else if(guess > number){
                System.out.println("Number is too high, try again");
                //3rd thing guess is compared too.
            }

        }

        System.out.println("You win!");
        System.out.println("It took you "+ tries + " tries.");
        input.close();

    }
}
