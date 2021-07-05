# Roman Numerals Kata
This Kata was helpful on understanding how to identify test cases along with writing code.
How to convert exploratory scenarios into know tests.

## Problem Statement For Kata
Originally Posted At https://kata-log.rocks/roman-numerals-kata

### Your task
Write a method String convert(int) that takes a number and converts it to the according String representation.

Examples
```
1 ➔ I
2 ➔ II
3 ➔ III
4 ➔ IV
5 ➔ V
9 ➔ IX
21 ➔ XXI
50 ➔ L
100 ➔ C
500 ➔ D
1000 ➔ M
```

## Hint
This kata lures a lot of people to implement features in the order of the numbers. 
But do not forget that it’s sometimes easier to start with a general case and add exceptions later.

## Selected Stack
- Java 11
- gradle (with gradle wrapper) as build tool
- junit 5 as test framework

## Understanding Solution
- The Problem was solved using TDD and with the approach of just enough design at each stage
- Go through Each commit One by one to understand how first failing tests were written
- Each commit is one step of Red-Green-Refactor step
- During certain instances few tests and implementations were missed. 
  Going through commits will help you understand how exploratory unit tests can turn valuable 