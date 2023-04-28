public class CurrencyExchangeCalculator {
    /*Constant variables, The declaration of a variable as Constant 
    variable allows us to access it all over the class.*/

    static final double DOLLARS_PER_EURO = 1.14;

    public static void main(String[] args){
        System.out.format(" >>> 5 dollars is %.2f euros%n", dollarsToEuros(5));
        System.out.format(" >>> 5 euros is %.2f dollars%n", eurosTodollars(5));
        
    }
    public static double dollarsToEuros(double dollars){
        return dollars / DOLLARS_PER_EURO;
    }

    public static double eurosTodollars(double euros){
        return euros * DOLLARS_PER_EURO;
    }
}  
