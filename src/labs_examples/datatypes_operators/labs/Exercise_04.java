package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }

        // write your code below

        int c = 5;
        int d = 23;
        if (c <= d){
            System.out.println("c is less or equal to  d");
        }
        int e = 7;
        int f = 4;
        if (e > f){
            System.out.println("e is greater than f");
        }
        int g = 15;
        int h = 15;
        if (g >= h){
            System.out.println("g is greater than or equal to h");
        }
        int i = 12;
        int j = 12;
        if (i == j){
            System.out.println("i is equal to j");
        }

    }

}

