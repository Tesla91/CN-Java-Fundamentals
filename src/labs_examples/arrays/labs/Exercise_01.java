package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num0 = scanner.nextInt();
        System.out.print("Please enter another number: ");
        int num1 = scanner.nextInt();
        System.out.print("Please enter another number: ");
        int num2 = scanner.nextInt();
        System.out.print("Please enter another number: ");
        int num3 = scanner.nextInt();
        System.out.print("Please enter another number: ");
        int num4 = scanner.nextInt();
        System.out.print("Please enter another number: ");
        int num5 = scanner.nextInt();
        System.out.print("Please enter another number: ");
        int num6 = scanner.nextInt();
        System.out.print("Please enter another number: ");
        int num7 = scanner.nextInt();
        System.out.print("Please enter another number: ");
        int num8 = scanner.nextInt();
        System.out.print("Please enter another number: ");
        int num9 = scanner.nextInt();


        int[] userNums = new int[10];

        userNums[0] = num0;
        userNums[1] = num1;
        userNums[2] = num2;
        userNums[3] = num3;
        userNums[4] = num4;
        userNums[5] = num5;
        userNums[6] = num6;
        userNums[7] = num7;
        userNums[8] = num8;
        userNums[9] = num9;

        int sum = 0;

        for(int x : userNums){
            sum += x;
            System.out.println(sum);
        }
        System.out.println("The sum of all your numbers is: " + sum);
        int average = sum/userNums.length;
        System.out.println("The average of all your numbers is: " + average );





    }

}