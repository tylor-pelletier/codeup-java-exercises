package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        generateAreaAndCircumference();

    }

    public static void generateAreaAndCircumference() {

        Input input = new Input();

        double radius = input.getDouble("Enter the radius of a circle: ");

        Circle r = new Circle(radius);

        System.out.println("The radius of your circle is: " + radius);
        System.out.println("The area of your circle is: " + r.getArea());
        System.out.println("The circumference of your circle is: " + r.getCircumference());

        System.out.println("Do you want to enter another radius?");

        boolean yes = input.yesNo();

        if (yes) {

            generateAreaAndCircumference();

        } else if (!yes && r.getNumberOfCircles() == 1) {

            System.out.println("You created " + r.getNumberOfCircles() + " circle");

        } else {

            System.out.println("You created " + r.getNumberOfCircles() + " circles");

        }

    }

}