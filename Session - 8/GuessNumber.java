/***********************************************************
 * File: GuessNumber.java
 * Instructor: Nguyen Thai
 * Date: 3/04/2023
 * Student: Farshad Alemi
 * Description:
 * 
 ***********************************************************/

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
	public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        int inputValue;
        String gameTitle = "<<< Let's Play Guess Number >>>";

        System.out.format("%n");
        System.out.format("%60s%n", gameTitle);
        System.out.format("%n");
        

        
        do{
            System.out.print("Enter a guessing number between 0 and 100: ");
            inputValue = input.nextInt();
        }while (inputValue < 0 || inputValue > 100);
        


        int randomValue = generator.nextInt(100);
        System.out.println(randomValue);



        while(randomValue > inputValue || randomValue < inputValue){
            if(randomValue > inputValue){
                System.out.println("Your guess is too low.");
            }
            else if(randomValue < inputValue){
                System.out.println("Your guess is too high.");
            }
                        
            do{
                System.out.print("Enter a guessing number between 0 and 100: ");
                inputValue = input.nextInt();
            }while (inputValue < 0 || inputValue > 100);

            if(randomValue == inputValue){
                System.out.println("It is correct.  The number is " + randomValue);
            }
        }

        input.close();
	}
}
