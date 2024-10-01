import java.util.Scanner;
public class CircleTester {
    public static void main(String[] args) {
        //create instance of Circle
        Circle circle = new Circle(10.00);

        //calculate area of the circle
        double area = circle.calculateArea();
        System.out.println("The radius is: " + circle.radius);
        System.out.println("The area is: " + area);
    }
}
