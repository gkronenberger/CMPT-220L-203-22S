package base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    /**
     * # Lab Six
     * ---
     *
     * For this lab we're going to be messing around with our Linear Data Types,
     * as well as creating a plant Object!
     *
     * Our Goals are:
     * - Creating an Array
     * - Creating an ArrayList
     * - Creating an LinkedList
     * - Creating an Queue
     * - Creating an Stack
     * - Create a Plant
     *
     * Please show the ability to:
     * - Create these data types
     * - Populate the data types
     * - Print out the Linear Data Types
     */
    public static void main(String[] args) {
        // Create an Array, Populate it, and Print it out
        int[] numArray = {74, 42, 21, 25, 7, 41, 23, 91, 64, 16};

        System.out.println("The array: ");
        for (int number: numArray) {
            System.out.println(number);
        }

        // Create an ArrayList, Populate it, and Print it out
        ArrayList<Integer> numArrayList = new ArrayList<integer>();
        numArrayList.add(3);
        numArrayList.add(65);
        numArrayList.add(99);

        System.out.println("The ArrayList: ");
        for (int number: numArrayList) {
            System.out.println(number);
        }
        // Create an LinkedList, Populate it, and Print it out
        System.out.println("Months LinkedList: ");
        LinkedList<String> months = new LinkedList<string>();

        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");

        System.out.println(months)

        // Create an Queue, Populate it, and Print it out
        System.out.println("Next stop in queue: ");
        Queue<string> stops = new LinkedList<string>();

        stops.add("NYC");
        stops.add("Philadelphia");
        stops.add("Baltimore");
        stops.add("Washington, D.C.");

        System.out.println(stops);

        // Create an Stack, Populate it, and Print it out
        System.out.println("Pyramid stack: ")
        Stack<string> numStack = new Stack<string>();

        numStack.push("one");
        numStack.push("two");
        numStack.push("three");
        numStack.push("four");
        numStack.push("five");
        
        // Using the information in the Lab 6 Jupyter Notebook create an instance of plant here.
        Plant cactus = new Plant("Saguaro", "Cactus", "It needs 10 inches of water yearly.");
        System.out.println(cactus.name);
        System.out.println(cactus.plantFamily);
        System.out.println(cactus.needsWatering);
    }
}
