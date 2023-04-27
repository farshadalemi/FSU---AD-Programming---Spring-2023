/***********************************************************
 * File: NoParametersNoReturnValue.java
 * Instructor: Nguyen Thai
 * Date: 13/04/2023
 * Student: Farshad Alemi
 * Description:
 * 
 ***********************************************************/
import java.util.Scanner;

public class NoParametersOneReturnValue {
    public static void main(String[] args) {
	    int i;
        i = getInteger();
        System.out.println("Got: " + i);

    }      

    public static int getInteger(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input_value = input.next();
        return input_value;
    }   
}
