# Practice using TDD (Test Driven Development) by converting numbers to strings in Python.
# Run tests until they pass and then comment out the next skip line and continue through-
# -all of the tests insuring all tests are passing as you go.
# Inspired by James Grenning (@jwgrenning) and Jeff Langr (@jlangr)
# Created/Modified by Wade Van Orden


# Uses unittest testing framework
import NumberConverter
import unittest

converter = NumberConverter.NumberConverter()


class NumberConverterTest(unittest.TestCase):

    # @unittest.skip("0-9 Digits")
    def testSingleDigits(self):
        self.assertEqual(converter.toWords(0), 'zero')
        self.assertEqual(converter.toWords(1), 'one')
        self.assertEqual(converter.toWords(2), 'two')
        self.assertEqual(converter.toWords(3), 'three')
        self.assertEqual(converter.toWords(4), 'four')
        self.assertEqual(converter.toWords(5), 'five')
        self.assertEqual(converter.toWords(6), 'sizx')
        self.assertEqual(converter.toWords(7), 'seven')
        self.assertEqual(converter.toWords(8), 'eight')
        self.assertEqual(converter.toWords(9), 'nine')

    @unittest.skip("10-19 Digits")
    def testTeenDigits(self):
        self.assertEqual(converter.toWords(10), 'ten')
        self.assertEqual(converter.toWords(11), 'eleven')
        self.assertEqual(converter.toWords(12), 'twelve')
        self.assertEqual(converter.toWords(13), 'thirteen')
        self.assertEqual(converter.toWords(14), 'fourteen')
        self.assertEqual(converter.toWords(15), 'fifteen')
        self.assertEqual(converter.toWords(16), 'sixteen')
        self.assertEqual(converter.toWords(17), 'seventeen')
        self.assertEqual(converter.toWords(18), 'eighteen')
        self.assertEqual(converter.toWords(19), 'nineteen')

    @unittest.skip("20-29 Digits")
    def testTwentiesDigits(self):
        self.assertEqual(converter.toWords(20), 'twenty')
        self.assertEqual(converter.toWords(21), 'twenty-one')
        self.assertEqual(converter.toWords(22), 'twenty-two')
        self.assertEqual(converter.toWords(23), 'twenty-three')
        self.assertEqual(converter.toWords(24), 'twenty-four')
        self.assertEqual(converter.toWords(25), 'twenty-five')
        self.assertEqual(converter.toWords(26), 'twenty-six')
        self.assertEqual(converter.toWords(27), 'twenty-seven')
        self.assertEqual(converter.toWords(28), 'twenty-eight')
        self.assertEqual(converter.toWords(29), 'twenty-nine')

    @unittest.skip("30-39 Digits")
    def testThirtiesDigits(self):
        self.assertEqual(converter.toWords(30), 'thirty')
        self.assertEqual(converter.toWords(33), 'thirty-three')
        self.assertEqual(converter.toWords(35), 'thirty-five')
        self.assertEqual(converter.toWords(38), 'thirty-eight')

    @unittest.skip("40-100 Digits")
    def testUpToOneHunderedDigits(self):
        self.assertEqual(converter.toWords(40), 'fourty')
        self.assertEqual(converter.toWords(50), 'fifty')
        self.assertEqual(converter.toWords(60), 'sixty')
        self.assertEqual(converter.toWords(70), 'seventy')
        self.assertEqual(converter.toWords(80), 'eighty')
        self.assertEqual(converter.toWords(90), 'ninety')
        self.assertEqual(converter.toWords(100), 'one-hundred')

    @unittest.skip("101-999 Digits")
    def testLessThanOneThousandDigits(self):
        self.assertEqual(converter.toWords(101), 'one-hundered-one')
        self.assertEqual(converter.toWords(204), 'two-hundered-four')
        self.assertEqual(converter.toWords(386), 'three-hundered-eighty-six')
        self.assertEqual(converter.toWords(482), 'four-hundered-eighty-two')
        self.assertEqual(converter.toWords(580), 'five-hundered-eighty')
        self.assertEqual(converter.toWords(702), 'seven-hundered-two')
        self.assertEqual(converter.toWords(999), 'nine-hundered-ninety-nine')

    @unittest.skip("1000-9999 Digits")
    def testLessThanTenThousandDigits(self):
        self.assertEqual(converter.toWords(1014), 'one-thousand-fourteen')
        self.assertEqual(converter.toWords(2047), 'two-thousand-fourty-seven')
        self.assertEqual(converter.toWords(3864), 'three-thousand-sixty-four')
        self.assertEqual(converter.toWords(4822), 'four-thousand-twenty-two')
        self.assertEqual(converter.toWords(
            5806), 'five-thousand-eight-hundered-six')
        self.assertEqual(converter.toWords(7024), 'seven-thousand-twenty-four')
        self.assertEqual(converter.toWords(
            9999), 'nine-thousand-nine-hundered-ninety-nine')

    @unittest.skip("10000-999999 Digits")
    def testLessThanOneMillionDigits(self):
        self.assertEqual(converter.toWords(10000),
                         'ten-thousand')
        self.assertEqual(converter.toWords(20547),
                         'twenty-thousand-five-hundered-fourty-seven')
        self.assertEqual(converter.toWords(
            385944), 'three-hundered-eighty-five-thousand-nine-hundered-fourty-four')
        self.assertEqual(converter.toWords(
            482922), 'four-hundered-eighty-two-thousand-nine-hundered-twenty-two')
        self.assertEqual(converter.toWords(
            585506), 'five-hundered-eighty-five-thousand-five-hundered-six')
        self.assertEqual(converter.toWords(980285),
                         'nine-hundered-eighty-thousand-two-hundered-eighty-five')
        self.assertEqual(converter.toWords(
            999999), 'nine-hundered-nine-thousand-nine-hundered-ninety-nine')

    @unittest.skip("1000000-1000000000 Digits")
    def testUpToThanOneBillionDigits(self):
        self.assertEqual(converter.toWords(1000000),
                         'one-million')
        self.assertEqual(converter.toWords(2005457),
                         'two-million-five-thousand-four-hundered-fifty-seven')
        self.assertEqual(converter.toWords(
            3859444), 'three-million-eight-hundered-fifty-nine-thousand-four-hundered-fourty-four')
        self.assertEqual(converter.toWords(
            48269722), 'fourty-eight-million-two-hundered-sixty-nine-thousand-seven-hundered-twenty-two')
        self.assertEqual(converter.toWords(
            585650676), 'five-hundered-eighty-five-million-six-hundered-fifty-thousand-six-hundered-seventy-six')
        self.assertEqual(converter.toWords(980289785),
                         'nine-hundered-eighty-million-two-hundered-eighty-nine-thousand-seven-hundered-eighty-five')
        self.assertEqual(converter.toWords(
            1000000000), 'one-billion')
