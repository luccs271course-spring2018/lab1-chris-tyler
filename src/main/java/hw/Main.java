package hw;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        int number = 0;

        System.out.println("Enter sequence number: ");
        number = myInput.nextInt();

        fizzBuzzArray.FizzBuzz3(number);

    }
}