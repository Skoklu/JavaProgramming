package day04_Variables;

public class Rectangle {

    public static void main(String[] args) {

        // length, width' area, perimeter

      int length = 10;
      int width = 5;
      int perimeter = 2 * (length + width);
      int area = length * width;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
        System.out.println("length = " + length);
        System.out.println("width = " + width);



    }
}


/*
2. Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
						length
						width

						area = length * width
						perimeter =  2 * (length + width)

 */