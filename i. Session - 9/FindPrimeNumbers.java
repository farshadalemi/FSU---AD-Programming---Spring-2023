/***********************************************************
 * File: FindPrimeNumbers.java
 * Instructor: Nguyen Thai
 * Date: 12/04/2023
 * Student: Farshad Alemi
 * Description:
 * 
 ***********************************************************/
import java.util.Scanner;

public class FindPrimeNumbers {
    public static void main(String[] args) {
        
        String methodTitle = "<<< Prime Number or not! >>>";
        System.out.format("%n");
        System.out.format("%50s%n", methodTitle);
        System.out.format("%n");
        
        Scanner input = new Scanner(System.in);
        String tryAgain;
        
        
        do {
            System.out.print("Enter a number: ");
            int inputValue= input.nextInt();

            if(inputValue >= 1){

                if(isPrime(inputValue)) {
                    System.out.println(inputValue + " is prime number");
                }
                else{
                    System.out.println(inputValue + " is a non-prime number");
                }
                
            }else{
                System.out.format("Please enter a pusitive Integer! %n %d is a non-prime number.", inputValue);
            }    

            System.out.print(" Would you like to check another number? (y/n): ");
            tryAgain = input.next();
        }while(tryAgain.equals("y") || tryAgain.equals("Y") || tryAgain.equals("Yes") || tryAgain.equals("yes") );

        input.close();
    }

    static  boolean isPrime(int inputArgument)
    {
        if(inputArgument<=1)
        {
            return false;
        }
       for(int i=2;i<=inputArgument/2;i++)
       {
           if((inputArgument%i)==0)
               return  false;
       }
       return true;
    }

}