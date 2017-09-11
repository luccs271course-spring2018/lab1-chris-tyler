
package hw;

import java.util.List;
import java.util.ArrayList;


//THIS IS PART 4
public class fizzBuzzList {

    public static List<String> FizzBuzz4(int n) {

        if (n >= 1) {
            List<String> list = new ArrayList<String>();

            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 != 0) {
                   list.add("fizz");
                } else if (i % 3 != 0 && i % 5 == 0) {
                    list.add("buzz");
                } else if (i % 3 == 0 && i % 5 == 0) {
                   list.add("fizzbuzz");
                } else {
                    list.add(String.valueOf(i));
                }
            }
            return list;

        } else {
            System.out.println("Invalid Number");
            return null;
        }


    }

}