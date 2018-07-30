package shapes;

public class Circle {

    private double radius;

    private static int numberOfCircles = 0;

    public Circle(double radius) {

        numberOfCircles += 1;

        this.radius = radius;

    }

    public double getArea() {

        double area = Math.PI * Math.pow(radius, 2);
        return area;

    }

    public double getCircumference() {

        double circumference = 2 * Math.PI * radius;
        return circumference;

    }

    public static int getNumberOfCircles() {

        return numberOfCircles;

    }

}