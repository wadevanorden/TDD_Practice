/** Practice using TDD (Test Driven Development) by converting numbers to strings in JavaScript.
 * Run tests until they pass and then remove the .skip after the next test and continue through-
 * -all of the tests insuring all tests are passing as you go.
 * Inspired by James Grenning (@jwgrenning) and Jeff Langr (@jlangr)
 * Modified by Wade Van Orden
 */

/**
 * To test, use npm install, and npm test
 */

const toWords = require("./NumberConverter");

test("SingleDigits", () => {
  expect(toWords(1)).toBe("one");
  expect(toWords(2)).toBe("two");
  expect(toWords(3)).toBe("three");
  expect(toWords(4)).toBe("four");
  expect(toWords(5)).toBe("five");
  expect(toWords(6)).toBe("six");
  expect(toWords(7)).toBe("seven");
  expect(toWords(8)).toBe("eight");
  expect(toWords(9)).toBe("nine");
});

test.skip("TeenDigits", () => {
  expect(toWords(11)).toBe("eleven");
  expect(toWords(12)).toBe("twelve");
  expect(toWords(13)).toBe("thirteen");
  expect(toWords(14)).toBe("fourteen");
  expect(toWords(15)).toBe("fifteen");
  expect(toWords(16)).toBe("sixteen");
  expect(toWords(17)).toBe("seventeen");
  expect(toWords(18)).toBe("eighteen");
  expect(toWords(19)).toBe("ninteen");
});

test.skip("TwentiesDigits", () => {
  expect(toWords(21)).toBe("twenty-one");
  expect(toWords(22)).toBe("twenty-two");
  expect(toWords(23)).toBe("twenty-three");
  expect(toWords(24)).toBe("twenty-four");
  expect(toWords(25)).toBe("twenty-five");
  expect(toWords(26)).toBe("twenty-six");
  expect(toWords(27)).toBe("twenty-seven");
  expect(toWords(28)).toBe("twenty-eight");
  expect(toWords(29)).toBe("twenty-nine");
});

test.skip("ThirtiesDigits", () => {
  expect(toWords(30)).toBe("thirty");
  expect(toWords(33)).toBe("thirty-three");
  expect(toWords(35)).toBe("thirty-five");
  expect(toWords(38)).toBe("thirty-eight");
});

test.skip("UpToOneHunderedDigits", () => {
  expect(toWords(40)).toBe("fourty");
  expect(toWords(50)).toBe("fifty");
  expect(toWords(60)).toBe("sixty");
  expect(toWords(70)).toBe("seventy");
  expect(toWords(80)).toBe("eighty");
  expect(toWords(90)).toBe("ninety");
  expect(toWords(100)).toBe("one-hundered");
});

test.skip("LessThanOneThousandDigits", () => {
  expect(toWords(101)).toBe("one-hundered-one");
  expect(toWords(204)).toBe("two-hundered-four");
  expect(toWords(386)).toBe("three-hundered-eighty-six");
  expect(toWords(482)).toBe("four-hundered-eighty-two");
  expect(toWords(580)).toBe("five-hundered-eighty");
  expect(toWords(702)).toBe("seven-hundered-two");
  expect(toWords(999)).toBe("nine-hundered-ninety-nine");
});

test.skip("LessThanTenThousandDigits", () => {
  expect(toWords(1014)).toBe("one-thousand-fourteen");
  expect(toWords(2047)).toBe("two-thousand-fourty-seven");
  expect(toWords(3864)).toBe("three-thousand-sixty-four");
  expect(toWords(4822)).toBe("four-thousand-twenty-two");
  expect(toWords(5806)).toBe("five-thousand-eight-hundered-six");
  expect(toWords(7024)).toBe("seven-thousand-twenty-four");
  expect(toWords(9999)).toBe("nine-thousand-nine-hundered-ninety-nine");
});

test.skip("LessThanOneMillionDigits", () => {
  expect(toWords(10000)).toBe("ten-thousand");
  expect(toWords(20547)).toBe("twenty-thousand-five-hundered-fourty-seven");
  expect(toWords(385944)).toBe(
    "three-hundered-eighty-five-thousand-nine-hundered-fourty-four"
  );
  expect(toWords(482922)).toBe(
    "four-hundered-eighty-two-thousand-nine-hundered-twenty-two"
  );
  expect(toWords(585506)).toBe(
    "five-hundered-eighty-five-thousand-five-hundered-six"
  );
  expect(toWords(980285)).toBe(
    "nine-hundered-eighty-thousand-two-hundered-eighty-five"
  );
  expect(toWords(999999)).toBe(
    "nine-hundered-nine-thousand-nine-hundered-ninety-nine"
  );
});

test.skip("UpToOneBillionDigits", () => {
  expect(toWords(1000000)).toBe("one-million");
  expect(toWords(2005457)).toBe(
    "two-million-five-thousand-four-hundered-fifty-seven"
  );
  expect(toWords(3859444)).toBe(
    "three-million-eight-hundered-fifty-nine-thousand-four-hundered-fourty-four"
  );
  expect(toWords(48269722)).toBe(
    "fourty-eight-million-two-hundered-sixty-nine-thousand-seven-hundered-twenty-two"
  );
  expect(toWords(585650676)).toBe(
    "five-hundered-eighty-five-million-six-hundered-fifty-thousand-six-hundered-seventy-six"
  );
  expect(toWords(980289785)).toBe(
    "nine-hundered-eighty-million-two-hundered-eighty-nine-thousand-seven-hundered-eighty-five"
  );
  expect(toWords(1000000000)).toBe("one-billion");
});
