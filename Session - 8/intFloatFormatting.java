/***********************************************************
 * File: GuessNumber.java
 * Instructor: Nguyen Thai
 * Date: 3/04/2023
 * Student: Farshad Alemi
 * Description:
 *  
 ***********************************************************/

public class intFloatFormatting {
	public static void main(String[] args) {
		

        int a = 123;
        double b = 123.123;
        double c = -123.129;
        double d = -321.7654;
        String e = "Farshad";


        System.out.format("%3d%n", a);        //   123
        System.out.format("%7.2f%n", b);     //    123.12
        System.out.format("%10.3f%n", c);   //    -123.129
        System.out.format("%7.3f%n", d);   //     -321.765
        System.out.format("%.1f%n", d);   //      -321.8
        System.out.format("%s%n", e);
        System.out.format("%14s%n", e);
        

	}

}
