package day45_Abstraction.shapeTask;

public class Square extends Shape{

    private int side;


    public Square(int side, int height) {
        super("Square");
        setSide(side);

    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side<=0){
            throw new RuntimeException(side+ " is invalid side");
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString()+
                "side=" + side +
                '}';
    }

}
