/***********************************************************
 * File: methodArguments.java
 * Instructor: Nguyen Thai
 * Date: 13/04/2023
 * Student: Farshad Alemi
 * Description:
 * 
 ***********************************************************/

public class methodArguments {
    /**
     * @param args
     */
    public static void main(String[] args) {
		

        int x = 1;
        int result;
    
        while(x <= 12){
            result = (int)Math.pow(2, x);
            System.out.format("2**%d = %d%n", x, result);          
            x++;
        }

	}

}

/* x in this class is defined as an argument to pass to the method "pow"
in orther to calculate each time the new value. */ 