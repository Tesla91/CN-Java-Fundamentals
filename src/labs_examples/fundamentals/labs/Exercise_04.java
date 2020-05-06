package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);


        // write your code below
        boolean myBoo = true;
        byte myByte = 2;
        short myShort = 23345;
        long myLong = 983479574345667788l;
        float myFloat = 938475.76f;
        double myDouble = 373736455564738392.92;
        char myChar = 'r';

        System.out.println("boolean myBoo is: " + myBoo);
        System.out.println("byte myByte is: " + myByte);
        System.out.println("short myShort is: " + myShort);
        System.out.println("long myLong is: " + myLong);
        System.out.println("float myFloat is: " + myFloat);
        System.out.println("double myDouble is: " + myDouble);
        System.out.println("char myChar is: " + myChar);

    }

}