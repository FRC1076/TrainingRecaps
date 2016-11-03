
public class WhileAndFor {
    public static void main(String[] args) {
        System.out.println();
    }

    public static int sum() {
        /* Lets say we want to loop until some condition is true.
         * We can use a while loop for this. The while loop will
         * execute code between its curly braces WHILE the condition is true.
         * This function sums all the numbers from ten to zero
         */
        int x = 1;
        int total = 1;
        while (x <= 4) {
            total *= x; // total = total + x
            //System.out.println(total);
            x += 1;
        }
        
        return total;
    }
    
     /*
      * 
      * for (the starting value; condition; the change to the starting value) {
      *     code
      * }
     * For loops are useful for looping a specific number of times This is
     * really useful for, say looping through every element of a list, (more on
     * lists later)
     * 
     * for loops have three major parts for (int i = 0; i < 10; i++) int i = 0;
     * creates a new variable called i and sets it to zero (just like normal) i
     * < 10 is the condition. While this condition is true we run the for loop
     * i++ is the modification to i. It runs after the code in the for loop has
     * run
     */
    public static int factorial(int x) {
        /*
         * This function computers x factorial (x! = 1 * 2 * 3 ... x)
         */
        int total = 1;
        
        // i < x is our condition, which ensures that we
        // have i go from 1 to x (we have 1, 2, 3, 4...)
        // By multiplying total by i, we have 1 * 2 * 3 * 4...
        for (int i = 1; i < x; i++) {
            total = total * i;
        }
        return total;
    }
}












// total = 1 (i = 1
// total = 2 (i = 2)
// total = 6 (t = 3)
// 24