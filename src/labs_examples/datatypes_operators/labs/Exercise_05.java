package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below
        boolean c = true;

        if (a & c){
            System.out.println("a and c are true");
        }

        if (a && c){
            System.out.println("if a is true and if it is c is true");
        }

        if (a || b){
            System.out.println("a is true if its not than b is true");
        }

        if (a ^ b){
            System.out.println("one of the two is true and the other is false");
        }

        if (!b){
            System.out.println("b is false");
        }

    }

}

