
public class ArraysAndMoreLoops {
    public static void main(String[] args) {
        /*
         * Adding [] to a variable type makes it an array of that type int[] is
         * just a list of integers String[] a list of strings and so on
         */
        int[] evenNumbers = { 2, 4, 6, 8, 10 };
        // We can get the length of the array
        System.out.println(evenNumbers.length); // 5
        // And we can get specific elements of the array
        /*
         * !!!!SUPER IMPORTANT NOTE!!!!!! Arrays start at the zeroth index! That
         * means that the second element is at index ONE, not index zero It also
         * means that the highest index value is one less than the length
         */
        System.out.println(evenNumbers[0]); // 2
        System.out.println(evenNumbers[3]); // 8

        // Let's add all the values in this list and print it
        int total = 0;
        for (int i = 0; i < evenNumbers.length; i++) {
            // i has values 0, 1, 2, 3, 4
            // i does not equal five because evenNumbers.length = 5
            // and 5 < 5 is not true
            total += evenNumbers[i];
        }
        
        System.out.println(total); //30
    }
}
