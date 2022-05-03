package day45_Abstraction.shapeTask;

public class Rectangle extends Shape{

    private int width;
    private int length;

    public Rectangle(int width, int length) {
        super("Rectangle");
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width<=0){
            throw new RuntimeException(width+ " is invalid width");
        }
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length<=0){
            throw new RuntimeException(length+ " is invalid length");
        }
        this.length = length;
    }



    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}
