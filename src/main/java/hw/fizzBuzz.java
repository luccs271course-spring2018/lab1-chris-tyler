package hw;


//THIS IS PART 2
public class fizzBuzz {

    public static void fizzBuzz(int n) {
        System.out.println("Testing for part 2 below");
        System.out.println();

        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");

            } else if (i % 5 == 0) {
                System.out.println("buzz");

            } else {
                System.out.println(i);

            }

        }
    }
}