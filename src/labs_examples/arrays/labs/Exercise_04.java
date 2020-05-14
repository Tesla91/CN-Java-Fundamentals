package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int[][] twoD = {
                {2, 4, 6, 8},
                {22, 44},
                {666, 888, 1010}
        };

        for (int x = 0; x < twoD.length; x++){
            for (int y = 0; y < twoD[x].length; y++){
                System.out.print(twoD[x][y] + "  ");
            }
            System.out.println();
        }



    }

}
