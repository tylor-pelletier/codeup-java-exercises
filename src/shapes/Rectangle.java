package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public void setLength(double length) {

        this.length = length;

    }

    public void setWidth(double width) {

        this.width = width;

    }

    @Override
    public double getPerimeter() {

        System.out.println("Rectangle");

        return (length + width) * 2;

    }

    @Override
    public double getArea() {

        System.out.println("Rectangle");

        return length * width;

    }

///////////////////////////////////    INHERITANCE AND POLYMORPHISM

//    protected int length;
//    protected int width;
//
//    public Rectangle() {
//
//    }
//
//    public Rectangle(int length, int width) {
//
//        this.length = length;
//        this.width = width;
//
//    }
//
//    public int  getPerimeter() {
//
//        return (length + width) * 2;
//
//    }
//
//    public int getArea() {
//
//        return length * width;
//
//    }

}