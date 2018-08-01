package shapes;

public class Rectangle {

    protected int length;
    protected int width;

    public Rectangle() {

    }

    public Rectangle(int length, int width) {

        this.length = length;
        this.width = width;

    }

    public int  getPerimeter() {

        return (length + width) * 2;

    }

    public int getArea() {

        return length * width;

    }

}