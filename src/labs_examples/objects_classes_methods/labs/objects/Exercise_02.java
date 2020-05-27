package labs_examples.objects_classes_methods.labs.objects;

/**
 * Please demonstrate Object association by creating at least two POJOs and a Controller class. The Controller
 * class will contain the main() method. In the main() create an object of each POJO you just created and associate
 * the two together. (This is easier than it sounds. Refer to the Object Association documentation if you're not sure.)
 */

public class Exercise_02 {

    public static void main(String[] args) {

        IceCream myIceCream = new IceCream("Mint Chip", true);
        Toppings myTopping = new Toppings("Chocolate Chips");

        System.out.println("My ice cream is " + myIceCream.flavor + " flavored and it has " + myTopping.typeOfTopping + " as a topping.");

    }
}

class IceCream{

    String flavor;
    boolean inCone;

    public IceCream(String flavor, boolean inCone) {
        this.flavor = flavor;
        this.inCone = inCone;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", inCone=" + inCone +
                '}';
    }
}

class Toppings{

    String typeOfTopping;

    public Toppings(String typeOfTopping) {
        this.typeOfTopping = typeOfTopping;
    }

    @Override
    public String toString() {
        return "Toppings{" +
                "typeOfTopping='" + typeOfTopping + '\'' +
                '}';
    }
}