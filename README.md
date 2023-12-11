# Square-and-Multiply Algorithm Readme

## Overview

This Java program demonstrates the implementation of the Square-and-Multiply algorithm to efficiently calculate exponentiation modulo a given modulus. The program takes a base, an exponent, and a modulus as inputs and generates a binary representation of the exponent using the "Q" and "QM" encoding. The Square-and-Multiply algorithm is then applied both iteratively and recursively to compute the result.

## Program Execution

### Input

- `base`: The base value for exponentiation.
- `exponent`: The exponent to which the base is raised.
- `modulus`: The modulus used for modulo operation.

### Output

The program outputs the following information:
- `Potency Value`: The result of exponentiation modulo the given modulus.
- `Binary String`: The binary representation of the exponent using "Q" and "QM".

## Binary String Encoding

The binary representation of the exponent is created using a custom encoding scheme where:
- 'Q' represents a binary digit '0'.
- 'QM' represents a binary digit '1'.

For example:
- The exponent `5` is represented as `QM` in binary.
- The exponent `15` is represented as `QMQM` in binary.

## Program Components

### `toBinary` Method

This method converts the decimal exponent into its binary representation using the custom encoding scheme. It iteratively divides the exponent by 2, appending 'Q' or 'QM' based on the remainder.

### `squareAndMultiply` Method

This method implements the Square-and-Multiply algorithm iteratively. It reads the binary exponent representation and performs square and multiply operations accordingly.

### `squareAndMultiplyRecursive` Method

This method implements the Square-and-Multiply algorithm recursively. It follows the same logic as the iterative version but utilizes recursion.

### `print` Method

This method prints the results, including the potency value and the binary string representation of the exponent.

## Example Usage

```java
public class Main {
    public static void main(String[] args) {
        int base = 3;
        int exponent = 15;
        int modulus = 10;

        String binaryExponent = toBinary(exponent);
        int potencyValue = squareAndMultiplyRecursive(base, binaryExponent, modulus);

        print(binaryExponent, potencyValue);
    }

    // ... (Rest of the program remains unchanged)
}
```

This example calculates \(3^{15} \mod 10\) using the Square-and-Multiply algorithm and prints the results.

Feel free to modify the `base`, `exponent`, and `modulus` values in the `main` method for testing with different inputs.
