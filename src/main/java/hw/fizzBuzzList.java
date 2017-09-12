
package hw;

import java.util.List;
import java.util.ArrayList;


//THIS IS PART 4
public class fizzBuzzList {

    public static List<String> FizzBuzz4(int n) {

        if (n >= 1) {
            List<String> list = new ArrayList<String>();

            for (int i = 1; i <= n; i++) {
               //More efficient way for testing fizzbuzz.
                int f = i % 3;
                int b = i % 5;
                if (f == 0 && b != 0) {
                   list.add("fizz");
                } else if (f != 0 && b == 0) {
                    list.add("buzz");
                } else if (f == 0 && b == 0) {
                   list.add("fizzbuzz");
                } else {
                    list.add(String.valueOf(i));
                }
            }

            //Only purpose is to show that the values are getting into the list.
            System.out.println(list);

            return list;

        } else {
            System.out.println("Invalid Number");
            return null;
        }


    }

}