/***********************************************************
 * File: NoParametersNoReturnValue.java
 * Instructor: Nguyen Thai
 * Date: 13/04/2023
 * Student: Farshad Alemi
 * Description:
 * 
 ***********************************************************/
import java.util.Scanner;

public class OneParametersOneReturnValue {
    public static void main(String[] args) {
	    int s;
        s = getString();
        System.out.println("Got: " + s);

    }      

    public static String getInteger(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an string: ");
        String input_value = input.next();
        return input_value;
    }   
}
