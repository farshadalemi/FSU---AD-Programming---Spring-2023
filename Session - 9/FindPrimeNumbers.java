/***********************************************************
 * File: FindPrimeNumbers.java
 * Instructor: Nguyen Thai
 * Date: 12/04/2023
 * Student: Farshad Alemi
 * Description:
 * 
 ***********************************************************/

import java.time.Year;
import java.util.Scanner;

public class FindPrimeNumbers {
	public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        String methodTitle = "<<< Prime Number or not! >>>";
        String tryAgain;
        
        System.out.format("%n");
        System.out.format("%50s%n", methodTitle);
        System.out.format("%n");
        
        
        do{
            System.out.print("Enter a number to check if it is a Prime number or not: ");
            int inputValue;
            inputValue = input.nextInt();

            if(inputValue >= 1){
                System.out.println("Input is: " + inputValue);

            }else{
                System.out.println("Please enter a pusitive Integer!");
            }

            
            System.out.print("Would you like to check another number? (y/n): ");
            tryAgain = input.next();
            
        }while(tryAgain.equals("y") || tryAgain.equals("Y") || tryAgain.equals("Yes") || tryAgain.equals("yes") );

     
        input.close();
	}
}


