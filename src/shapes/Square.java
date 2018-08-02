package shapes;

public class Square extends Quadrilateral {

    public void setLength(double length) {

        this.length = length;

    }

    public void setWidth(double width) {

        this.width = width;

    }

    @Override
    public double getPerimeter() {

        System.out.println("Square");

        return (length + width) * 2;

    }

    @Override
    public double getArea() {

        System.out.println("Square");

        return length * width;

    }

///////////////////////////////////    INHERITANCE AND POLYMORPHISM

//    protected int side;
//
//    public Square(int side) {
//
//        this.side = side;
//        this.length = side;
//        this.width = side;
//
//    }
//
//    @Override
//    public int getPerimeter() {
//
//        return side * 4;
//
//    }
//
//    @Override
//    public int getArea() {
//
//        return (int)Math.pow(side, 2);
//
//    }

}