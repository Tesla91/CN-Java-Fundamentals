package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {
        int x = 15;

        while (x > 5){
            
            x--;
            if(x == 13){
                continue;
            }
            System.out.println("x = " + x);

        }

    }
}
