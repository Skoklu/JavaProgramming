package day45_Abstraction.shapeTask;

public class Triangle extends Shape{

    private int side;
    private int height;
    private int base;

    public Triangle(int height, int base) {
        super("Triangle");
        this.side = side;
        this.height = height;
        this.base = base;
    }

    public Triangle(String name) {
        super(name);
    }

    @Override
    public double area() {
        return (height * base) / 2;
    }

    @Override
    public double perimeter() {
        return side + side + side;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                super.toString()+
                "side ="+ side+
                ", height=" + height +
                ", base=" + base +
                '}';
    }
}
