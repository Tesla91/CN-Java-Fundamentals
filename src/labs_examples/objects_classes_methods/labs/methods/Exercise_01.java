package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        System.out.println(multiply());
        System.out.println(divide());
        System.out.println(joke());
        System.out.println(yearsInSeconds());
        System.out.println(varags());

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(){

        int a = 4;
        int b = 7;

        int result = a * b;
        return result;

    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(){

        int a = 9;
        int b = 5;

        int result = a / b;
        return result;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static String joke(){
        String myJoke = "99 little bugs in the code, 99 little bugs in the code. " +
                "Take one down, patch it around 117 little bugs in the code.";
        return myJoke;
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int yearsInSeconds(){
        int numOfYears = 63;
        int yearsInSeconds = numOfYears * 31536000;
        return yearsInSeconds;
    }


    // 5) Create a varargs method that will return the length of the varargs array passed in

    public static int varags(){

        int[] varags = new int[5];

        int length = varags.length;

        return length;
    }






}
