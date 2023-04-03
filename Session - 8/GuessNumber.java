/***********************************************************
 * File: GuessNumber.java
 * Instructor: Nguyen Thai
 * Date: 3/04/2023
 * Student: Farshad Alemi
 * Description:
 * 
 ***********************************************************/

import java.util.Scanner;

public class guessNumber {
	public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int inputValue;
        
        // System.out.print("<<< Let's Play Guess Number >>>");
        
        do{
            System.out.print("Enter a guessing number between 0 and 100: ");
            inputValue = input.nextInt();
        }while (inputValue < 0);
        
        input.close();
	}
}
