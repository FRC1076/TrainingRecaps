
public class Functions {
    public static void main(String[] args) {
        // When we hit a function, we jump down to whever the function is (scroll down)
        // execute whatever code is in it, and finally return back up.
        int number = squared(4); // Equals 16
        // Notice how oneHalf is a double and divide() returns a double
        double oneHalf = divide(1, 2);
        // We can have functions within functions
        double anotherNumber = divide(squared(10), 6);
        // Note that just having the function on its own causes nothing to happen
        // Java does the computation, but the returned result is thrown away immediately
        divide(100,10);
        // This will actually print the value
        System.out.println(divide(100,10));
    }
    /* This is similar to public static void main(String[] args) as both
     * are functions (somethings also called methods).
     * 
     * public    Visibility keyword, tells you where you can use this function 
     *           public means from any file
     *           private means only from this file
     * static    Means that the function is shared between all instances (more on this later)
     *           not always used, harder to describe but it usually useful for functions that
     *           don't need to know the state of an instance
     * int       Return type, tells you what this function will return (in this case, we return
     *           ints). If you don't return anything, then you have void (notice the void in main).
     * squared   This is the name of the function. Try to stick to the same naming conventions as variables
     * int x     This is an argument. You can have as many as you want (or none). This means the
     *           It's similar to the x in f(x)
     */
    public static int squared(int x) {
        return x * x;
    }
    
    public static double divide(int a, int b) {
        return (double) a / b; // This guarantees double division.
    }
    
    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true; // When we hit the return statement we exit the function and RETURN to where we last called
        }
        return false;
    }
    
    // void functions are useful for doing things (for example, setting the speed of a motor)
    public static void printHi() {
        System.out.println("Hi");
    }
}
