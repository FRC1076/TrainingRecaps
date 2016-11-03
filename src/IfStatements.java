
public class IfStatements {
    public static void main(String[] args) {
        /* An if statement executes a block of code
         * if the condition is true. Otherwise it skips it.
         */
        int x = 10;

        if (x == 10) {
            System.out.println("x is ten");
        }

        if (x == 11) {
            System.out.println("x is eleven");
        }
        // Quick note, double equals == compares equality
        // however single equals = is assigning values to variables
        // if (x = 10) is NOT correct, and results in an error


        /* else will run if the condition is false.
         * (aka: execute this code if ___, else execute this code
         */

        int y = 5;
        if (y > 0) {
            System.out.println("y is positive");
        } else {
            System.out.println("y is negative");
        }
        /* Please notice the curly brace { and }
         * The curly braces enclose the code to be executed
         * The parenthesis ( and ) enclose the condition to be checked
         * This is why you should use good, consistent indentation
         */

        // else if allows us to compare multiple conditions
        int cookies = 12;
        if (cookies == 1) {
            System.out.println("Did the if statement");
        } else if (cookies > 10) {
            System.out.println("Did the first else if statement");
        } else if (cookies == 12) {
            System.out.println("Did the second else if statement");
        } else {
            System.out.println("Did the else statement");
        }
        /* Notice how only one of the else if statements is 
         * run, even though two are true. In general, only one
         * block will be run (either an if, else if, or else)
         */

        /* The basic comparision operators are:
         * ==     equal to
         * <      less than
         * >      greater than
         * <=     less than or equal to
         * >=     greater than or equal to
         * !=     not equal
         */

        /* You can compare more than just doubles and ints
         * Booleans are often useful in if statements.
         */
        boolean goalScored = false;
        if (goalScored) { // You don't need to put == inside
            System.out.println("GOOOOOOOOAAAALLLLL!");
        } else {
            System.out.println("BOOOOOOOO!");
        }

        /* You can also test more than one condition at
         * the same time by using the && and || operators
         * && is logical and. It is true when both sides are true
         * true && 1 + 1 == 2 is true
         * but 8 * 2 == 16 && 1 < 0 is false because 1 < 0 is false
         * 
         * || is logical or. It is true either side is true
         * true || false is true (because true is true)
         * 1 != 1 || 1 == 1 is true (because 1 == 1)
         * 1 * 0 == 10 || 4 + 4 == 9 is false (because neither side is true
         * 
         * ! is logical not. It makes true things false and false things true
         * !true is false
         * !false is true
         * !(10 - 5 == 5) is false
         * !(20 / 2 == 11) is true
         * 
         * You can chain as many of these as you want.
         * You can also use them in boolean variables
         */
        boolean parentsAllowParty = false;
        int numberOfFriends = 15;
        boolean haveBeer = true;
        double lengthOfParty = 1.5;
        if ((haveBeer && (lengthOfParty > 2 || !(numberOfFriends < 10)) || parentsAllowParty)) {
            System.out.println("You can have a party!");
        } else {
            System.out.println("Don't have a party");
        }
    }
}
