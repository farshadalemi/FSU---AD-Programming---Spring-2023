/***********************************************************
 * File: GuessNumber.java
 * Instructor: Nguyen Thai
 * Date: 3/04/2023
 * Student: Farshad Alemi
 * Description:
 *  
 ***********************************************************/
import java.util.Scanner;

 public class loopsStructuresInputWithDO {
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);

        int inputValue;
        
        do{
            System.out.print("Enter 1 to print this message again: ");
            inputValue = input.nextInt();
        } while (inputValue == 1);
                
        input.close();
	}
}