/***********************************************************
 * File: GuessNumber.java
 * Instructor: Nguyen Thai
 * Date: 3/04/2023
 * Student: Farshad Alemi
 * Description:
 *  
 ***********************************************************/

 public class forLoop {
	public static void main(String[] args) {

        System.out.println(">>>>>>>>> Incrementation");

        for(int count = 1; count <= 10; count++){
            System.out.println(count + " squared is " + count * count);
        }
        System.out.println(">>>>>>>>> Decrementation");
        
        for(int iterator = 10; iterator >= 0; iterator--){
            System.out.println(iterator);
        }

        System.out.println(">>>>>>>>> Incrementation + Multiplication");

        double total = 0;
        for(double value = 1; value <= 1000; value = value * 10){
            total = total + value;
            System.out.println(total);
        }

        System.out.println(">>>>>>>>> Incrementation + n to power 2");

        for(int binary = 1; binary <= 1000000; binary = binary * 2){
            System.out.println(binary);
        }
	}
}