
public class Week3 {
    public static void main(String[] args) {
        String[] names = {"aaron", "caleb", "luke", "gaya", "sulaymon"};

        System.out.println(names[0]); // "aaron"
        System.out.println(names[4]); // "sulaymon"
        System.out.println(names.length); // 5
        // Print out all of the names in the list.
        for (int i = 0; i < names.length; i = i + 1) {
            System.out.println(names[i]);
        }
    }
    
    public static int factorial(int x) {
        int total = 1;
        for (int i = 1; i <= x; i = i + 1) {
            total = total * i;
        }
        return total;
    }
    
    public static int sum(int x) {
        // sum(12) = 1 + 2 + 3 + 4 .... + 10 + 11 + 12
        int start = 0; // The starting number for the sum
        int total = 0; // The sum itself
        while (start <= x) {
            total += start;
            start += 1;
        }
        
        return total;
        
        // start -> 1, 2, 3, 4, 5, 6
    }
}
