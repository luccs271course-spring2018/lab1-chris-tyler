package hw;

import java.util.Arrays;

//THIS IS PART 3
public class fizzBuzzArray {


    public static String[] FizzBuzz3(int n) {

        if (n >= 1) {
            String[] array = new String[n];

            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 != 0) {
                    array[i - 1] = "fizz";
                } else if (i % 3 != 0 && i % 5 == 0) {
                    array[i - 1] = "buzz";
                } else if (i % 3 == 0 && i % 5 == 0) {
                    array[i - 1] = "fizzbuzz";
                } else {
                    array[i - 1] = String.valueOf(i);
                }
            }
            System.out.println(Arrays.toString(array));
            return array;

        } else {
            System.out.println("Invalid Number");
            return null;
        }


    }
}