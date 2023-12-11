# Read Me - Square and Multiply Algorithm

## Overview
This Java program demonstrates the Square and Multiply algorithm, a method for efficiently computing modular exponentiation. The algorithm is particularly useful in cryptography, where large numbers need to be raised to a power modulo another number.

## Usage
To use this program, follow these steps:

1. Open the `Main` class.
2. Set the values for `base`, `exponent`, and `modulus` in the `main` method.
3. Run the program.

The program will calculate the result of `base^exponent mod modulus` using the Square and Multiply algorithm and display the intermediate steps, including the binary representation of the exponent and the number of multiplications performed.

## Methods

### `toBinary(int exponent)`
Converts an integer exponent to its binary representation.

### `squareAndMultiply(int base, String binaryExponent, int modulus)`
Implements the Square and Multiply algorithm iteratively. Calculates `base^exponent mod modulus` efficiently.

### `squareAndMultiplyRecursive(int base, String binaryExponent, int modulus)`
Implements the Square and Multiply algorithm recursively. Calculates `base^exponent mod modulus` efficiently using recursion.

### `print(String binaryExponent, int result)`
Prints the final result of the modular exponentiation, along with the binary representation of the exponent.

## Example
In the provided example in the `main` method, the program calculates `2^18 mod 39` using the Square and Multiply algorithm.

## Note
- Ensure that the input values for `base`, `exponent`, and `modulus` are appropriate for your use case.
- The `squareAndMultiplyRecursive` method provides an alternative recursive implementation of the algorithm.

Feel free to modify the program for your specific requirements or integrate it into your projects.