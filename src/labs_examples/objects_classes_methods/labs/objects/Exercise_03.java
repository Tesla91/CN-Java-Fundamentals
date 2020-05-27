package labs_examples.objects_classes_methods.labs.objects;

/**
 * For this exercise please create two classes. The first class is the controller and it will contain the main() method.
 * The second class is a POJO. Just a simple object type class that defines an object. In this POJO, demonstrate
 * at least three overloaded constructors. In the main() method, create at least 3 objects of your POJO class, each using
 * a different constructor.
 */

public class Exercise_03 {

    public static void main(String[] args) {

        Pizza myFirstPizza = new Pizza(true, "Pepperoni", "Jalapenos");
        Pizza mySecondPizza = new Pizza("Pepperoni", "Meat Lovers", true);
        Pizza theGrossPizza = new Pizza(true, true, "Chicken");

        System.out.println("My first pizza is " + myFirstPizza.toString());
        System.out.println("My second pizza is " + mySecondPizza.toString2());
        System.out.println("Someones gross pizza is " + theGrossPizza.toString3());

    }

}

class Pizza{

    boolean hasCheesyCrust;
    String toppingOne;
    String toppingTwo;
    String halfOneTopping;
    String halfTwoTopping;
    boolean hasExtraCheese;
    boolean isVegan;
    boolean hasBBQ;


    public Pizza(boolean hasCheesyCrust, String toppingOne, String toppingTwo) {
        this.hasCheesyCrust = hasCheesyCrust;
        this.toppingOne = toppingOne;
        this.toppingTwo = toppingTwo;
    }

    public Pizza(String halfOneTopping, String halfTwoTopping, boolean hasExtraCheese) {
        this.halfOneTopping = halfOneTopping;
        this.halfTwoTopping = halfOneTopping;
        this.hasExtraCheese = hasExtraCheese;
    }

    public Pizza(boolean isVegan, boolean hasBBQ, String toppingOne){
        this.isVegan = isVegan;
        this.hasBBQ = hasBBQ;
        this.toppingOne =toppingOne;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "hasCheesyCrust=" + hasCheesyCrust +
                ", toppingOne='" + toppingOne + '\'' +
                ", toppingTwo='" + toppingTwo + '\'' +
                '}';
    }


    public String toString2() {
        return "Pizza{" +
                "halfOneTopping='" + halfOneTopping + '\'' +
                ", halfTwoTopping='" + halfTwoTopping + '\'' +
                ", hasExtraCheese=" + hasExtraCheese +
                '}';
    }


    public String toString3() {
        return "Pizza{" +
                "isVegan=" + isVegan +
                ", hasBBQ=" + hasBBQ +
                ", toppingOne=" + toppingOne +
                '}';
    }
}