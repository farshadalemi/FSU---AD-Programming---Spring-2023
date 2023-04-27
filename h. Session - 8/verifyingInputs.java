/***********************************************************
 * File: GuessNumber.java
 * Instructor: Nguyen Thai
 * Date: 3/04/2023
 * Student: Farshad Alemi
 * Description:
 *  
 ***********************************************************/
import java.util.Scanner;

 public class verifyingInputs {
	public static void main(String[] args) {
		
        double inputValue;
        Scanner input = new Scanner(System.in);

        
        do{
            System.out.print("Enter a positive floating number: ");
            inputValue = input.nextDouble();
        } while (inputValue <= 1);
        
        input.close();
        System.out.format("Square root is %.2f%n", Math.sqrt(inputValue));
	}
}