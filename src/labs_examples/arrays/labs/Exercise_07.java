package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList();

        myList.add("Cats");
        myList.add("Dogs");
        myList.add("Horses");
        myList.add("Turtles");
        myList.add("Figs");

        System.out.println("Here are some types of animals: ");

        for( String x : myList){

            System.out.println(x + " ");

        }

        System.out.println();
        System.out.println("Whoops Figs are not a type of animal.");

        myList.remove("Figs");

        System.out.println();
        System.out.println("Here is our revised list: ");

        for( String x : myList){

            System.out.println(x + " ");

        }



    }

}
