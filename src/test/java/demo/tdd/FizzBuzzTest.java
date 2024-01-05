package demo.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    //TEST MULTIPLE DE 3

    @ParameterizedTest
    @CsvSource({
            "1,1",
            "2,2"
    })
    public void should_return_string_if_no_multiple_of_3_or_5_or_both(int givenNuber, String expected) {

        String result = fizzBuzz.say(givenNuber);
        assertEquals(expected,result);
    }

    //Etape 2 Refactor du test
    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    public void should_return_fizz_when_3(int number) {
        String result = fizzBuzz.say(number);
        assertEquals("Fizz",result);
    }

    //Etape 1 Test
    /*@Test
    public void should_return_fizz_when_6() {
        String result = fizzBuzz.say(6);
        assertEquals("Fizz",result);
    }*/



    // TEST MULTIPLE DE 5

    /*//Etape 1
    @Test
    public void should_return_buzz_when_5(){
        String result = fizzBuzz.say(5);
        assertEquals("Buzz", result);
    }*/


    //Etape 2
    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20})
    public void should_return_buzz_when_multiple_of_5(int number){
        String result = fizzBuzz.say(number);
        assertEquals("Buzz", result);
    }

    // TEST MULTIPLE DE 3 ET 5

    /*//Etape 1
    @Test
    void should_return_FizzBuzz_when_15() {
        String result = fizzBuzz.say(15);
        assertEquals("FizzBuzz", result);
    }*/

    //Etape 2
    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    public void should_return_FizzBuzz_when_multipe_of_3_or_5(int number) {
        String result = fizzBuzz.say(number);
        assertEquals("FizzBuzz", result);

    }
}


