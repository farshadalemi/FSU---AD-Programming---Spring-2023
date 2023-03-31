/***********************************************************
 * File: CalculateArea.java
 * Instructor: Nguyen Thai
 * Date: 20/03/2023
 * Student: Farshad Alemi
 * Description:
 * 
 * 
 ***********************************************************/
import java.util.Scanner;

public class ConvertToYardsFeetInches  {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int inputValue;
        System.out.print("Enter number of inches: ");
		inputValue = input.nextInt();
		
		double inchesToYard;
		int inches_per_yard = 36;
		int inches_per_foot = 12;
		int feet_per_yard = 3;
		double doubleTypeInput = inputValue;
		double remainderOfYard;
		int yardToFeet;
		double remainderOfInchFromFeet;
		double doubleTypeYardToFeet;
		double inchRemanider;

		inchesToYard = inputValue / inches_per_yard;
		remainderOfYard = (doubleTypeInput / inches_per_yard) % inchesToYard;
		//Typecasting is required here (double > int)
		yardToFeet  = (int)(remainderOfYard * feet_per_yard);
		doubleTypeYardToFeet = remainderOfYard * (double)feet_per_yard;
		remainderOfInchFromFeet = doubleTypeYardToFeet % yardToFeet;
		inchRemanider = remainderOfInchFromFeet * (double)inches_per_foot;
		

		System.out.println(inputValue + " inches equals "+ (int)inchesToYard +" yard, "+ yardToFeet +" feet and "+ (int)inchRemanider +" inches.");
		input.close();
	}
}
