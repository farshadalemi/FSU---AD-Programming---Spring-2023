public class AreaOverloading {
    public static void main(String[] args) {
       
        double rectangle = area(4.5, 10.0);
        System.out.printf(" >>> Area of  rectangle with sides 4.5 and 10 is %.3f%n", rectangle);
        
        double circle = area(5.2);
        System.out.printf(" >>> Area of circle with radius 5.2 is %.3f%n", circle);
    }
    
    public static double area (double radius){
        return Math.PI + radius * radius;
    }

    public static double area(double length, double width){
        return length * width;
    }
}

 

        