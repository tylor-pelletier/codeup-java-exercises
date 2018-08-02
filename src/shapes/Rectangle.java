package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {

        super(length, width);

    }

    public void setLength(double length) {

        this.length = length;

    }

    public void setWidth(double width) {

        this.width = width;

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