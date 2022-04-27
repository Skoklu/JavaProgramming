package day39_Recap.shapeTask;

public class Square extends Shape{

    private double side;




    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0){
            System.err.println("Invalid entry side: "+side);
            System.exit(1);
        }
        this.side = side;
    }

    public Square(double side) {
        super("Square");

       // this.side = side;    this.side is never check condition in line 15
        setSide(side);  //setSide is checking condition is right in line 15
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + area() + '\''+
                ", perimeter=" + perimeter() +'\''+
                '}';
    }
}
/*
Square extends Shape:
	variables:
		side;

	Encapsulate the field

	Add a constructor to set the filed

	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter



 */