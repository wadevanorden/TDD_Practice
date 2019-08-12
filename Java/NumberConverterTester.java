/** Practice using TDD (Test Driven Development) by converting numbers to strings in Java.
 Run tests until they pass and then comment out the next Disabled line and continue through-
 -all of the tests insuring all tests are passing as you go.
 Inspired by James Grenning (@jwgrenning) and Jeff Langr (@jlangr)
 Created/Modified by Wade Van Orden
 **/

//Uses Jupiter unit testing framework
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class NumberConverterTester {

    // @Disabled
    @Test
    void testSingleDigits() throws Exception {
        assertEquals(NumberConverter.toWords(0), "zero");
        assertEquals(NumberConverter.toWords(1), "one");
        assertEquals(NumberConverter.toWords(2), "two");
        assertEquals(NumberConverter.toWords(3), "three");
        assertEquals(NumberConverter.toWords(4), "four");
        assertEquals(NumberConverter.toWords(5), "five");
        assertEquals(NumberConverter.toWords(6), "six");
        assertEquals(NumberConverter.toWords(7), "seven");
        assertEquals(NumberConverter.toWords(8), "eight");
        assertEquals(NumberConverter.toWords(9), "nine");
    }

    @Disabled
    @Test
    void testTeenDigits() throws Exception {
        assertEquals(NumberConverter.toWords(10), "ten");
        assertEquals(NumberConverter.toWords(11), "eleven");
        assertEquals(NumberConverter.toWords(12), "twelve");
        assertEquals(NumberConverter.toWords(13), "thirteen");
        assertEquals(NumberConverter.toWords(14), "fourteen");
        assertEquals(NumberConverter.toWords(15), "fifteen");
        assertEquals(NumberConverter.toWords(16), "sixteen");
        assertEquals(NumberConverter.toWords(17), "seventeen");
        assertEquals(NumberConverter.toWords(18), "eighteen");
        assertEquals(NumberConverter.toWords(19), "nineteen");
    }

    @Disabled
    @Test
    void testTwentiesDigits() throws Exception {
        assertEquals(NumberConverter.toWords(20), "twenty");
        assertEquals(NumberConverter.toWords(21), "twenty-one");
        assertEquals(NumberConverter.toWords(22), "twenty-two");
        assertEquals(NumberConverter.toWords(23), "twenty-three");
        assertEquals(NumberConverter.toWords(24), "twenty-four");
        assertEquals(NumberConverter.toWords(25), "twenty-five");
        assertEquals(NumberConverter.toWords(26), "twenty-six");
        assertEquals(NumberConverter.toWords(27), "twenty-seven");
        assertEquals(NumberConverter.toWords(28), "twenty-eight");
        assertEquals(NumberConverter.toWords(29), "wenty-nine");
    }

    @Disabled
    @Test
    void testThirtiesDigits() throws Exception {
        assertEquals(NumberConverter.toWords(30), "thirty");
        assertEquals(NumberConverter.toWords(33), "thirty-three");
        assertEquals(NumberConverter.toWords(35), "thirty-five");
        assertEquals(NumberConverter.toWords(38), "thirty-eight");
    }

    @Disabled
    @Test
    void testUpToOneHunderedDigits() throws Exception {
        assertEquals(NumberConverter.toWords(40), "fourty");
        assertEquals(NumberConverter.toWords(50), "fifty");
        assertEquals(NumberConverter.toWords(60), "sixty");
        assertEquals(NumberConverter.toWords(70), "seventy");
        assertEquals(NumberConverter.toWords(80), "eighty");
        assertEquals(NumberConverter.toWords(90), "ninety");
        assertEquals(NumberConverter.toWords(100), "one-hundered");
    }

    @Disabled
    @Test
    void testLessThanOneThousandDigits() throws Exception {
        assertEquals(NumberConverter.toWords(101), "one-hundered-one");
        assertEquals(NumberConverter.toWords(204), "two-hundered-four");
        assertEquals(NumberConverter.toWords(386), "three-hundered-eighty-six");
        assertEquals(NumberConverter.toWords(482), "four-hundered-eighty-two");
        assertEquals(NumberConverter.toWords(580), "five-hundered-eighty");
        assertEquals(NumberConverter.toWords(702), "seven-hundered-two");
        assertEquals(NumberConverter.toWords(999), "nine-hundered-ninety-nine");
    }

    @Disabled
    @Test
    void testLessThanTenThousandDigits() throws Exception {
        assertEquals(NumberConverter.toWords(1014), "one-thousand-fourteen");
        assertEquals(NumberConverter.toWords(2047), "two-thousand-fourty-seven");
        assertEquals(NumberConverter.toWords(3864), "three-thousand-sixty-four");
        assertEquals(NumberConverter.toWords(4822), "four-thousand-twenty-two");
        assertEquals(NumberConverter.toWords(5806), "five-thousand-eight-hundered-six");
        assertEquals(NumberConverter.toWords(7024), "seven-thousand-twenty-four");
        assertEquals(NumberConverter.toWords(9999), "nine-thousand-nine-hundered-ninety-nine");
    }

    @Disabled
    @Test
    void testLessThanOneMillionDigits() throws Exception {
        assertEquals(NumberConverter.toWords(10000), "ten-thousand");
        assertEquals(NumberConverter.toWords(20547), "twenty-thousand-five-hundered-fourty-seven");
        assertEquals(NumberConverter.toWords(385944), "three-hundered-eighty-five-thousand-nine-hundered-fourty-four");
        assertEquals(NumberConverter.toWords(482922), "four-hundered-eighty-two-thousand-nine-hundered-twenty-two");
        assertEquals(NumberConverter.toWords(585506), "five-hundered-eighty-five-thousand-five-hundered-six");
        assertEquals(NumberConverter.toWords(980285), "nine-hundered-eighty-thousand-two-hundered-eighty-five");
        assertEquals(NumberConverter.toWords(999999), "nine-hundered-nine-thousand-nine-hundered-ninety-nine");
    }

    @Disabled
    @Test
    void testUpToThanOneBillionDigits() throws Exception {
        assertEquals(NumberConverter.toWords(1000000), "one-million");
        assertEquals(NumberConverter.toWords(2005457), "two-million-five-thousand-four-hundered-fifty-seven");
        assertEquals(NumberConverter.toWords(3859444),
                "three-million-eight-hundered-fifty-nine-thousand-four-hundered-fourty-four");
        assertEquals(NumberConverter.toWords(48269722),
                "fourty-eight-million-two-hundered-sixty-nine-thousand-seven-hundered-twenty-two");
        assertEquals(NumberConverter.toWords(585650676),
                "five-hundered-eighty-five-million-six-hundered-fifty-thousand-six-hundered-seventy-six");
        assertEquals(NumberConverter.toWords(980289785),
                "nine-hundered-eighty-million-two-hundered-eighty-nine-thousand-seven-hundered-eighty-five");
        assertEquals(NumberConverter.toWords(1000000000), "one-billion");
    }
}
