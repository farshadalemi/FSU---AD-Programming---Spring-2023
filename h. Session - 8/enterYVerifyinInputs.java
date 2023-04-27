/***********************************************************
 * File: GuessNumber.java
 * Instructor: Nguyen Thai
 * Date: 3/04/2023
 * Student: Farshad Alemi
 * Description:
 *  
 ***********************************************************/
import java.util.Scanner;

 public class enterYVerifyinInputs {
	public static void main(String[] args) {
		
        String inputValue;
        Scanner input = new Scanner(System.in);

        
        do{
            System.out.print("Enter (y) to print this message agian >>> ");
            inputValue = input.next();
        } while (inputValue.equals("y") || inputValue.equals("Y") || inputValue.equals("Yes") || inputValue.equals("yes") );
        
        input.close();
	}
}