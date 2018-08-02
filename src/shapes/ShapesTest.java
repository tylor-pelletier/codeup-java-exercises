package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape1 = new Rectangle(5.0, 10.0);
        Measurable myShape2 = new Square(4.0);

        System.out.println("Area: " + myShape1.getArea());
        System.out.println();
        System.out.println("Perimeter: " + myShape1.getPerimeter());

        System.out.println();

        System.out.println("Area: " + myShape2.getArea());
        System.out.println();
        System.out.println("Perimeter: " + myShape2.getPerimeter());

//        System.out.println();
//        System.out.println(myShape1.getLength());
//        System.out.println(myShape1.getWidth());

///////////////////////////////////    INHERITANCE AND POLYMORPHISM

//        Rectangle box1 = new Rectangle(5, 4);
//        Rectangle box2 = new Square(5);
//
//        System.out.println("The perimeter of the rectangle is: " + box1.getPerimeter());
//        System.out.println("The area of the rectangle is: " + box1.getArea());
//
//        System.out.println();
//
//        System.out.println("The perimeter of the square is: " + box2.getPerimeter());
//        System.out.println("The area of the square is: " + box2.getArea());

    }

}