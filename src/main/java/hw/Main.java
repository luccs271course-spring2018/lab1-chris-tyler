package hw;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.println("Enter sequence number: ");
        int number = myInput.nextInt();

        fizzBuzz.fizzBuzz(number);

    }
}