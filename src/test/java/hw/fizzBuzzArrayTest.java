package hw;

import static org.junit.Assert.*;

import org.junit.Test;

public class fizzBuzzArrayTest {

    //Input cannot be negative.
    @Test
    public void testN1() {
        assertNull(fizzBuzzArray.FizzBuzz3(-10));
    }

    @Test
    public void testN2() {
        assertNull(fizzBuzzArray.FizzBuzz3(-1));
    }


    //Zero is not negative nor positive.
    @Test
    public void testZero() {
        assertNull(fizzBuzzArray.FizzBuzz3(0));
    }

    //Making sure the concept of fizz buzz actually works and matches what it should be doing.
    @Test
    public void testP1() {
        String[] s = {"1"};
        assertArrayEquals(s, fizzBuzzArray.FizzBuzz3(1));
    }

    @Test
    public void testP2() {
        String[] s = {"1", "2", "fizz", "4", "buzz", "6", "7"};
        assertArrayEquals(s, fizzBuzzArray.FizzBuzz3(7));
    }

    @Test
    public void testP3() {
        String[] s = {"1", "2", "fizz", "4", "buzz", "6", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizzbuzz", "16", "17"};
        assertArrayEquals(s, fizzBuzzArray.FizzBuzz3(17));
    }


}
