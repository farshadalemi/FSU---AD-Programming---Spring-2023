
public class RectangleInterface{
    public double length;
    public double width;

    /*  It also can be wrriten lke this: 
    public double length, width;
    */

    public double area(){
        return length * width;
    }


    public void printMethod(){
        System.out.printf("length: %.1f, ", length);
        System.out.printf("width: %.1f%n", width);
    }
};
