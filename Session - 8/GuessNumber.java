/***********************************************************
 * File: GuessNumber.java
 * Instructor: Nguyen Thai
 * Date: 29/03/2023
 * Student: Farshad Alemi
 * Description:
 * 
 ***********************************************************/

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        int a = 123;
        double b = 123.123;
        double c = -123.129;
        // System.out.print("Enter your : ");
        // month = input.nextInt();
        System.out.format("%3d%n", a);
        System.out.format("%7.2f%n", b);
        System.out.format("%10.2f%n", c);
        // System.out.format("%5d%n", a);
        // System.out.format("%5d%n", a);
        // System.out.format("%6d%n", a);
        // System.out.format("%7d%n", a);
        

		input.close();
	}

}
