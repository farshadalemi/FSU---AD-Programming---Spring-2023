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
        

        for(int r = 1; r <= 1; r++){
            int randomValue = generator.nextInt(100);
            // System.out.println(randomValue);
        }


        


        
        input.close();
	}
}
