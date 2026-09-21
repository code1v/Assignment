# Software Development Assignment

This repository contains solutions for two programming problems given as part of the Software Development assessment.

## Questions

1. Integer to English Words
2. Longest Increasing Subsequence

---

## Question 1: Integer to English Words

### Problem Statement

Convert a given integer into its English words representation.

### Examples

Input:
123

Output:
One Hundred Twenty Three

Input:
12345

Output:
Twelve Thousand Three Hundred Forty Five

### Requirements

- Handle positive integers.
- Handle negative integers.
- Handle zero.
- Avoid extra spaces in the output.

### Approach

The number is divided into different ranges such as:

- Ones
- Tens
- Hundreds
- Thousands
- Millions
- Billions

A recursive approach is used to convert each part of the number into words and combine the results.

### Complexity

- Time Complexity: O(1) for a Java int
- Space Complexity: O(1)

---

## Question 2: Longest Increasing Subsequence

### Problem Statement

Given an integer array, find the length of the longest strictly increasing subsequence.

A subsequence maintains the original order of elements, but the elements do not have to be adjacent.

### Example

Input:
0 1 0 3 2 3

One possible longest increasing subsequence is:

0 1 2 3

Output:
4

### Approach

The solution uses binary search to find the correct position for each element.

An auxiliary array is maintained where each position represents the smallest possible ending value for an increasing subsequence of that length.

For every element:

1. Binary search is used to find its correct position.
2. The value at that position is replaced.
3. If the element extends the current sequence, the count is increased.

This approach gives an O(n log n) time complexity.

### Complexity

- Time Complexity: O(n log n)
- Space Complexity: O(n)

---

## Project Structure

Software-Development-Assignment/
│
├── IntegerToWords.java
├── LongestIncreasingSubsequence.java
└── README.md

---

## How to Run

### Requirements

- Java JDK 8 or above

### Compile

javac IntegerToWords.java

javac LongestIncreasingSubsequence.java

### Run Question 1

java IntegerToWords

### Run Question 2

java LongestIncreasingSubsequence

---

## Sample Execution

### Integer to English Words

Enter a number: 12345

The number in words is: Twelve Thousand Three Hundred Forty Five

### Longest Increasing Subsequence

Enter size of array: 6

Enter array elements:
0 1 0 3 2 3

Length of Longest Increasing Subsequence: 4

---

