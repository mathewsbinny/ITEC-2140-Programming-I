public class Circle {

    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public static double calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
}
