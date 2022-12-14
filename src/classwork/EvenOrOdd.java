package classwork;

import java.util.Scanner;

// James Ding
public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        prompt(kb);
    }

    /**
     * Handles user interaction for EvenOdd behavior
     *
     * @param kb Scanner
     */
    public static void prompt(Scanner kb) {
        System.out.print("Enter a integer: ");
        int input = kb.nextInt();
        String prefix = "The integer " + input + " is ";
        String str;
        if (input % 2 == 0) str = "even";
        else str = "odd";
        System.out.println(prefix + str);
    }
}
