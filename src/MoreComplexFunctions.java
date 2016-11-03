
public class MoreComplexFunctions {
    public static void main(String[] args) {
        System.out.println(recursiveFibbonaci(10));
    }
    
    /* Functions can have more than one argument, and 
     * two functions can even have the same name (as long as they have different
     * argument types)
     */
    public static int addTheseNumbers(int a, int b, int c) {
        return a + b + c;
    }
    
    public static int addTheseNumbers(int a, int b) {
        return a + b;
    }
    // Notice the same number of arguments, but the types are different
    public static double addTheseNumbers(double a, double b) {
        return a + b;
    }
    /* The fibbonaci sequence starts as 0, 1, 1, 2, 3, 5, 8, 13...
     * It's defined as a sequence where
     * f(0) = 0
     * f(1) = 1
     * f(n) = f(n - 1) + f(n - 2) // sum of previous two numbers
     * 
     * Thus f(3) = f(2)        + f(1)
     *           = f(2)        + 1
     *           = f(1) + f(0) + 1
     *           = 1    + 0    + 1
     *           
     * We can make a recursive function that computes the nth fibbonacci number 
     */
    public static int recursiveFibbonaci(int n) {
        if (n == 0) {
            return 0; // Base case: f(0) = 0
        } else if (n == 1) {
            return 1; // Base case: f(1) = 1
        } else {
            // f(n) = f(n - 1) + f(n - 2) 
            return recursiveFibbonaci(n - 1) + recursiveFibbonaci(n - 2); 
        }
    }
    
    /* We don't have to write this recursively though, we can use a 
     * for loop instead. For this, what we need to do is keep track of
     * the last two previous values so we can add them. Then, we need to update our
     * previous values so we can get the next one. We do this for some number of times
     */
    public static int interativeFibbonaci(int n) {
        int grandparent = 0; // Base case 0
        int parent = 1; // Base case 1
        int child = 0;
        for (int i = 0; i < n; i++) {
            child = grandparent + parent; // Compute next value in sequence
            grandparent = parent;  // Make n - 2th value equal to n - 1th value
            parent = child - grandparent; // Make n - 1th value equal to old nth value
        }
        
        return child;
    }
    
}
