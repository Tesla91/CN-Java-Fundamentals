package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {

        int[] newArray = new int[6];

        for (int  x = 0; x < newArray.length; x++){
            newArray[x] = x * 3;
        }

        for (int y = newArray.length - 1; y >= 0; y--){
            if (y % 2 == 0){
                System.out.println(newArray[y]);
            }
        }

    }


}
