package hw;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        //int number = 0; <- using a string is better to catch.
        String input;

        System.out.println("Please enter a number: ");
        input = myInput.nextLine();

        //Detects if the input is a number or not, if it is not, program ends.
        try {
            int number = Integer.parseInt(input);

            //Part 2
            fizzBuzz.fizzBuzz2(number);

            //Part 3
            //fizzBuzzArray.FizzBuzz3(number);

            //Part 4
            //fizzBuzzList.FizzBuzz4(number);


        } catch (NumberFormatException e) {
            System.out.println("Input not recognized.");
            System.out.println("Program will end now.");
            //Exit because input was not recognized
            System.exit(0);
        }


    }
}
