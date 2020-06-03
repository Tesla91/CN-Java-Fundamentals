package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        System.out.println(multiply(3,6));
        System.out.println(divide(34, 2));
        joke();
        System.out.println(yearsInSeconds(9));
        int[] newArray = new int[7];
        int myLength = myVarags("this","is","a","varargs","method");
        System.out.println(myLength);


    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b){

        return a * b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b){

        return a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke(){

        String myJoke = "99 little bugs in the code, 99 little bugs in the code. " +
                "Take one down, patch it around 117 little bugs in the code.";
        System.out.println(myJoke);
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int yearsInSeconds(int years){

        return years * 31536000;
    }


    // 5) Create a varargs method that will return the length of the varargs array passed in

    public static int myVarags(String...vararg){
        int count = 0;
        for(String x : vararg){
            count++;
        }

        return count;
    }






}
