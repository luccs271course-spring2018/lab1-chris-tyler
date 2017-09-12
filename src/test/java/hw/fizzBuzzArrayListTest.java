package hw;

import org.junit.*;

import java.util.*;

import static org.junit.Assert.*;

public class fizzBuzzArrayListTest {

    private fizzBuzzList fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new fizzBuzzList();
    }

    @After
    public void tearDown() throws Exception {
        fixture = null;
    }

    //Input cannot be negative or zero.
    @Test
    public void testNZ() {
        assertNull(fixture.FizzBuzz4(-10));
        assertNull(fixture.FizzBuzz4(-1));
        assertNull(fixture.FizzBuzz4(0));

    }

    @Test
    public void testP1() {
        assertNotNull(fixture);
        //If the input is one, fizzbuzz should only run once.
        List<String> s = Arrays.asList("1");
        assertEquals(s, fixture.FizzBuzz4(1));
    }

    @Test
    public void testP2() {
        assertNotNull(fixture);
        //If the input is 7, fizzbuzz should only run 7 times.
        List<String> s = Arrays.asList("1", "2", "fizz", "4", "buzz", "6", "7");
        assertEquals(s, fixture.FizzBuzz4(7));
    }

    @Test
    public void testP3() {
        assertNotNull(fixture);
        //If the input is 17, fizzbuzz should only run 17 times.
        List<String> s = Arrays.asList("1", "2", "fizz", "4", "buzz", "6", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizzbuzz", "16", "17");
        assertEquals(s, fixture.FizzBuzz4(17));
    }


}
