/***********************************************************
 * File: GuessNumber.java
 * Instructor: Nguyen Thai
 * Date: 3/04/2023
 * Student: Farshad Alemi
 * Description:
 *  
 ***********************************************************/

 public class loopsStructures {
	public static void main(String[] args) {
		

        int a = 123;
        String e = "Farshad";


        while(a < 150 || e.length() == 8){
            System.out.println("*");
            System.out.println(e);
            a = a + 3;
            e = e + 3;
            a++;
        }

	}

}