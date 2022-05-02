package day43_Abstraction.shapeTask;

public class Square extends Shape{

    private double side;

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0){
          throw new RuntimeException(side+ " is invalid entry");
        }
        this.side = side;
    }

    @Override
    public void perimeter() {
        System.out.println(4 * side);
    }

    @Override
    public void area() {
        System.out.println(side *side);

    }

    @Override
    public String toString() {
        return "Square{" +
                "name=" + getName() +
                ", side=" + side +
                '}';
    }
}
/*
Square:
					area(): s * s
					perimeter: 4 * s


 */