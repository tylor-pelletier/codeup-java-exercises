package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;

    public Quadrilateral() {

    }

    public Quadrilateral(double length, double width) {

        this.length = length;
        this.width = width;

    }

    @Override
    public double getPerimeter() {

        System.out.println("Rectangle");

        return (this.length + this.width) * 2;

    }

    @Override
    public double getArea() {

        System.out.println("Rectangle");

        return this.length * this.width;

    }

    public double getLength() {

        return this.length;

    }

    public double getWidth() {

        return this.width;

    }

    public abstract void setLength(double length);

    public abstract void setWidth(double width);

}