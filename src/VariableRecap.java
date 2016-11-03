// This is a quick recap of basic variables
public class VariableRecap {
    /* public, static, and void are all keywords for the 
     * function "main". When you run your Java program, Java
     * will search for a function called "main". 
     * 
     * public is the visibility keyword, it means you can use it
     * in other files or classes
     * 
     * static is a special keyword that is tricky to explain
     * 
     * void means that the function won't return anything
     * (more on that later)
     * 
     * String[] args is an argument of main. More on that later
     */
    public static void main(String[] args) {
        /* int, double, String and boolean are all data types
         * When you declare a variable, you give the type of
         * the variable. The variable name can have a-z,
         * underscores, and numbers, but the suggested naming
         * convention is lowercaseFirstWordWithTheRestCapitalized
         */
        // An integer. Does not hold decimals
        int numberOfPeople = 10; // Notice the semicolon
        // A double, holds decimal values
        double totalMoney = 1.5;
        // A String, holds strings of characters
        String greetingMessage = "Hello World!";
        boolean isSunday = false;
        
        /* We can print out these values to the console by using
         * a function. In this case, it's a function provided by
         * the system
         */
        System.out.println(greetingMessage); // Again, note semicolon
        
        // Basic arithmetic works as you would expect
        System.out.println(1 + 1);
        System.out.println(4 * 2);
        System.out.println(5 - 10);
        // !NOTE!: Integer and double division are not the same!
        System.out.println(8 / 2);
        // Note that capitalization does matter
        int notTheSame = 0;
        int notTheSamE = 1;
        
        // You can change the value of variables later on in
        // your program, even using other variables.
        double myValue = 14.0;
        myValue = myValue + 5; // Results in 19.0
        
        // Challenges
        // What will these print out?
        // Try to answer before running
        // Feel free to play around with the
        // behaviors of these statements
        int a = 10;
        double b = 2.0;
        System.out.println(a * b);
        
        String string = "Goodbye";
        String concatination = "World!";
        System.out.println(string + concatination);
        
        int adding = 10;
        adding += 20;
        System.out.println(adding + 10);
        
        System.out.println("1" + 2);
    }
}
