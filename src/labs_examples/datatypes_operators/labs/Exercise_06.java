package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        //V=πr2h
    double pi = 3.1415;
    double radius = 3.14;
    int height = 5;
    double radSquared = radius * radius;
    double volume = pi * radSquared * height;
    System.out.println("The volume of the cylinder is " + volume);

    //A=2πrh+2πr2
    double surfaceArea = (2 * pi) * radius * height + (2 * pi) * radSquared;
    System.out.println("The surface area of the cylander is " + surfaceArea);


    }
}