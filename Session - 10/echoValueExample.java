public class echoValueExample {
    public static void main(String[] args){

        int intNum = echoValue(42);
        System.out.printf("Integer Value is %d%n", intNum); 

        double doubNum = echoValue(42.0);
        System.out.printf("Double Value is %.3f%n",  doubNum);

        String stNum = echoValue("forty-two");
        System.out.printf("String value is %s%n", stNum);

    }

    public static int echoValue(int num){
        return num;
    }

    public static double echoValue(double num){
        return num;
    }

    public static String echoValue(String txt){
        return txt;
    }

}
