package shapes;

public class Square extends Rectangle{

    protected int side;

    public Square(int side) {

        this.side = side;
        this.length = side;
        this.width = side;

    }

    @Override
    public int getPerimeter() {

        return side * 4;

    }

    @Override
    public int getArea() {

        return (int)Math.pow(side, 2);

    }

}