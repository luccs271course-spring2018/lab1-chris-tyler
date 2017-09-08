
package hw;

import java.util.List;
import java.util.ArrayList;


//THIS IS PART 4
public class fizzBuzzList {

    public static List<Object> FizzBuzz4(int n) {

        List<Object> list = new ArrayList<Object>();

        if (n < 1) {
            System.out.println("Invalid number");
        }

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                list.add("fizz");
            } else if (i % 3 != 0 && i % 5 == 0) {
                list.add("buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                list.add("fizzbuzz");
            } else {
                list.add(i);
            }
        }
        return list;

    }
    
}