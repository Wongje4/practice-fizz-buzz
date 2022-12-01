package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_say_the_number_when_count_off_given_normal_number() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.countOff(1);

        //then
        assertEquals("1", actual);
    }

    @Test
    void should_say_fizz_when_count_off_given_multiple3_number() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.countOff(3);

        //then
        assertEquals("Fizz", actual);
    }

    @Test
    void should_say_bizz_when_count_off_given_multiple5_number() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.countOff(5);

        //then
        assertEquals("Buzz", actual);
    }

    @Test
    void should_say_whizz_when_count_off_given_multiple7_number() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.countOff(7);

        //then
        assertEquals("Whizz", actual);
    }
}
