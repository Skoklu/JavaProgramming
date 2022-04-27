package day39_Recap.shapeTask;

public class Rectangle extends Shape{

    private int length;
    private int width;



    public int getLength() {
        return length;
    }

    public void setLength(int length) {

        if (length<=0){
            System.err.println("Invalid length: "+length);
            System.exit(1);
        }
        if (length<=width){
            System.err.println("Invalid entry");
            System.exit(1);
        }
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width<=0){
            System.err.println("Invalid width: "+width);
            System.exit(1);
        }
        if (width>=length){
            System.err.println("Invalid entry");
            System.exit(1);
        }
        this.width = width;
    }

    public Rectangle( int length, int width) {

        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() + '\''+
                ", perimeter=" + perimeter() +'\''+
                '}';
    }
}
/*
Rectangle extends Shape:
	variables:
		length
		width

	Encapsulate the fields

	Add a constructor to set the filed

	area(): length * width
	perimeter(): 2 * ( width + length)
	toString(): length, width, area, perimeter



 */