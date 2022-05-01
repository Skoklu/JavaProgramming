package day43_Abstraction.shapeTask;

public abstract class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {

        if (name ==null || name.isEmpty() || name.isBlank()){
            throw new RuntimeException(name+ " is invalid name");
        }
        this.name = name;
    }

    public abstract void perimeter();
    public abstract void area();

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
/*
Shape task:

	Shape:
		name

		Encapsulate the fields

		Add constructor to set the fields

		area()
		perimeter()
		toString(): name, area, perimeter


	Create the following subclasses of Shape and add the aditional features that are needed:

				Rectangle:
					area(): w * l
					perimeter(): 2 * (w+l)

				Square:
					area(): s * s
					perimeter: 4 * s

				Circle:
					area(): r * r * pi
					perimeter(): 2 * r * pi



 */