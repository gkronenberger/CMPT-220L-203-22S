package base;

import java.util.List;

public class Main {
    /**
     * # Lab Four
     * ---
     *
     * For this lab we're going to be making and using a bunch of functions.
     *
     * Our Goals are:
     * - Switch Case
     * - Looping
     * - Making our own functions
     * - Combining functions
     * - Structuring solutions
     */
    static int value1 = 2;
    static int value2 = 7;
    static int[] nums = {0,1,2,3,4,5,6,7,8,9};
    public static void main(String[] args) {
        // Give me an example of you using switch case.
        switch(value1){
            case 1:
                System.out.println("The number is 1.");
                break;
            case 2:
                System.out.println("The number is 2.");
                break;
            case 3:
                System.out.println("The number is 3");
                break;
            default:
                System.out.println("The number isn't in the range.");
                break;
        }
        // Give me an example of you using a for loop
        for (int x = 1; x < 7; x++) {
            System.out.println("The value is" + x);
        }
        // Give me an example of you using a while loop
        while (value1 < 11) {
            System.out.println("The value is" + value1);
            value1 = value1++;
        }
    }
    // For the following todos you'll probably want to define them below and then call them from the main function above.

    /**
     * I want you to write a function that will take in a number and raise it to the power given.
     * For example if given the numbers 2 and 3. The math that the function should do is 2^3
     * and should print out or return 8. Print the output.
     */
    public static int raise(int value1, int value2) {
        int pow = (int) Math.pow(value1, value2);
        return pow;
    }

    /**
     * I want you to write a function that will take in a list and see how many times a given number is in the list.
     * For example if the array given is [2,3,5,2,3,6,7,8,2] and the number given is 2 the function should print out
     * or return 3. Print the output.
     */
    public static int listcount(int value1, int [] nums) {
        int numcount = 0;
        for (int i = 0; i < nums.length; i++)
            {
                if (value1 == nums[i])
                {
                   numcount = numcount + 1;
                }
            }
        return numcount;
    }


    /**
     * Create a function named summation that will take in an int[ ] and return an int.
     * I want the function to then go through the given array and sum up digits in the array.
     * Once that’s done print or return the answer. Print the output
     */
    public static int summation(int [] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            total = total + nums[i];
        }
        return total;
    }

    /**
     * Give me a function that gives the answer to the pythagorean theorem.
     * I'd like you to reuse the exponent function from above as well as the functions below to make your function.
     *
     * If you don't remember the pythagorean theorem the formula is (a^2 + b^2 = c^2).
     * Given a and b as parameters i'd like you to return c.
     *
     * If this doesn't make sense look up `Pythagorean Theorem Formula` on google.
     *
     * Once that’s done print or return the answer. Print the output
     */
    public static int pytheorem(int value1, int value2) {
        double a2 = Math.pow(value1, 2);
        double b2 = Math.pow(value2, 2);
        double sum = a2 + b2;
        double c = Math.sqrt(sum);
        return (int) c;
    }

    int addition(int a2, int b2) {
        int answer = a2 + b2;
        return answer;
    }

    int division(int a, int b) {
        int answer = a / b;
        return answer;
    }
}
