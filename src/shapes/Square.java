package shapes;

public class Square extends Quadrilateral {

    public Square(double length) {

        super(length, length);

    }

    public void setLength(double length) {

        this.length = this.width = length;

    }

    public void setWidth(double length) {

        this.length = this.width =  length;

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