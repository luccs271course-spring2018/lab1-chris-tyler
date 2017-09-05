package hw;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);

		System.out.println("Enter sequence number: ");
		int number = myInput.nextInt();

		//  fizzBuzz.fizzBuzz(number);
		fizzBuzzArray.FizzBuzz3(number);

		Object tempArray[] = fizzBuzzArray.FizzBuzz3(number);


		//Testing to make sure data is in array.
		for(int i = 0; i < tempArray.length; i++) {
			System.out.println(tempArray[i]);
		}


	}


}
