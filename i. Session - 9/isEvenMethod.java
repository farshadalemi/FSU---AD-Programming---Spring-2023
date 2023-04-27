import java.util.Scanner;

public class isEvenMethod{
    public static void main(String[] args ){
        Scanner input = new Scanner(System. in);
        int input_value;
        System.out.print("Enter an integer: ");
        input_value = input .nextInt();
        if(isEven (input_value)){
            System.out.println (input_value + " is even!");
        } else {
            System.out.println (input_value + " is Odd!");
    }
}

    public static boolean isEven (int number ){
        if (number % 2 == 0){
            return true;
        } else{
            return false;
        }
}
}
