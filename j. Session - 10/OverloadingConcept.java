
public class OverloadingConcept {
    public static void main(String[] args) {
       
        int whole = divTen(42);
        System.out.println("divTen(42) = " + whole);

        double fraction = divTen(42.0);
        System.out.println("divTen(42.0) = " + fraction);

    }

    public static int divTen(int x){
        return x/10;
    }

    public static double divTen(double x){
        return x/10;
    }

}

/* A variable can be defined many times if "Type" or "Parameters"
are different. It called Overloading */