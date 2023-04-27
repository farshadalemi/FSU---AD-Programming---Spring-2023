/***********************************************************
 * File: GuessNumber.java
 * Instructor: Nguyen Thai
 * Date: 3/04/2023
 * Student: Farshad Alemi
 * Description:
 *  
 ***********************************************************/
import java.util.Scanner;

 public class loopsStructuresInput {
	public static void main(String[] args) {
		

        Scanner input = new Scanner(System.in);

        int inputValue;
        int checkPoint = 0;
        System.out.print(" Enter an integer: ");
        inputValue = input.nextInt();
        
        
        while (inputValue >= checkPoint){
            System.out.println(checkPoint);
            checkPoint++;
        }
        
        System.out.println(checkPoint);
        
        input.close();
	}

}