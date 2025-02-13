# Problem 0: FizzBuzz

## Question

You are given a positive integer n,
Write a program that prints numbers from 1 to n, following these rules:
- For multiples of 3, print "Fizz" For multiples of 5, print "Buzz"
- For multiples of both 3 and 5, print "FizzBuzz"
- For all other numbers, print only the number itself.

## Analysis

To solve FizzBuzz, we simply use a single loop that iterates from 1 to n.
Then for each number, we use modulo operations (%) to check divisibility.
 a % b returns the remainder when a is divided by b, so if (i % 3) equals 0,
 it means i is divisible by 3 since it returns 0 as a remainder.

Time Complexity: O(n)
Space Complexity: O(1)
