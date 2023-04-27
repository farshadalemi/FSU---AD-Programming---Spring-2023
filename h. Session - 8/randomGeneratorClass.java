/***********************************************************
 * File: GuessNumber.java
 * Instructor: Nguyen Thai
 * Date: 3/04/2023
 * Student: Farshad Alemi
 * Description:
 *  
 ***********************************************************/

 import java.util.Random;

 public class randomGeneratorClass {
	public static void main(String[] args) {
		
        Random generator = new Random();
        
        for(int iterator = 1; iterator <= 1 ; iterator++){
            int randomValue = generator.nextInt(10);
            System.out.println(randomValue);
        }     
	}
}