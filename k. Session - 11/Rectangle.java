public class Rectangle{
    public static void main(String[] args){
        RectangleInterface rectA = new RectangleInterface();
        RectangleInterface rectB = new RectangleInterface();

        rectA.length = 4.2;
        rectA.width = 10.0;

        rectB.length = 3.8;
        rectB.width = 2.5;

        // System.out.printf("*** Rectangle A length: %.3f%n", rectA.length);
        // System.out.printf("*** Rectangle A width: %.3f%n", rectA.width);
        
        // System.out.printf("*** Rectangle B length: %.3f%n", rectB.length);
        // System.out.printf("*** Rectangle B width: %.3f%n", rectB.width);

        System.out.print("******* Rectangle A: ");
        System.out.printf("area: %.1f, ", rectA.area());
        rectA.printMethod();

        System.out.print("******* Rectangle B: ");
        System.out.printf("area: %.1f, ", rectB.area());
        rectB.printMethod();

    }
}  