
public class Week3 {
    public static void main(String[] args) {
        System.out.println(sum(100));
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
