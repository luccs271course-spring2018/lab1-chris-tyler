package hw;

public class fizzBuzzArray {


    public static Object[] FizzBuzz3(int n) {
        Object array[] = new Object[n+1];

        if(n < 1) {
            System.out.println("Invalid number");
        }

        for (int i = 0; i < array.length; i++){
            if(i % 3 == 0 && i % 5 != 0)
            {
                array[i] = "fizz";
            }
            else if(i % 3 != 0 && i % 5 == 0)
            {
                array[i] = "buzz";
            }
            else if(i % 3 == 0 && i % 5 == 0)
            {
                array[i] = "fizzbuzz";
            }
            else
            {
                array[i] = i;
            }
        }
        return array;

    }



}

