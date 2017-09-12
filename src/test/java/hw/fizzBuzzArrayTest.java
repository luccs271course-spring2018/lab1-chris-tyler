package hw;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class fizzBuzzArrayTest {

    private fizzBuzzArray fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new fizzBuzzArray();
    }

    @After
    public void tearDown() throws Exception {
        fixture = null;
    }
    //Input cannot be negative.
    @Test
    public void testN1() {
        assertNull(fixture.FizzBuzz3(-10));
    }

    @Test
    public void testN2() {
        assertNull(fixture.FizzBuzz3(-1));
    }


    //Zero is not negative nor positive.
    @Test
    public void testZero() {
        assertNull(fixture.FizzBuzz3(0));
    }

    //Making sure the concept of fizz buzz actually works and matches what it should be doing.
    @Test
    public void testP1() {
        assertNotNull(fixture);
        String[] s = {"1"};
        assertArrayEquals(s, fixture.FizzBuzz3(1));
    }

    @Test
    public void testP2() {
        assertNotNull(fixture);
        String[] s = {"1", "2", "fizz", "4", "buzz", "6", "7"};
        assertArrayEquals(s, fixture.FizzBuzz3(7));
    }

    @Test
    public void testP3() {
        assertNotNull(fixture);
        String[] s = {"1", "2", "fizz", "4", "buzz", "6", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizzbuzz", "16", "17"};
        assertArrayEquals(s, fixture.FizzBuzz3(17));
    }


}
