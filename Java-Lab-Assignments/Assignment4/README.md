# Assignment 4: Writing Functions

## 1. Experiment Title
Writing Functions with Parameters and Return Values in Java.

## 2. Aim
To design and implement user-defined methods (functions) in Java with parameters and return values to calculate combinations ($nCr$), permutations ($nPr$), and maximum of two numbers.

## 3. Software / Tools Required
- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory
Methods are blocks of reusable code designed to perform specific tasks. They promote modularity, readability, and code reusability.

The following concepts are used in this experiment:

1. **Static Methods:**
   Methods declared with the `static` keyword belong to the class rather than instances of the class and can be invoked directly from `main()`.

2. **Parameters and Return Types:**
   Methods accept input via formal arguments and return a computed result using the `return` statement.

3. **Mathematical Formulas:**
   - Factorial: $n! = 1 \times 2 \times \dots \times n$
   - Combinations: $nCr = \frac{n!}{r!(n - r)!}$
   - Permutations: $nPr = \frac{n!}{(n - r)!}$
   - Maximum: Returns the greater of two given numbers.

## 5. Algorithm / Procedure

### Question 1: Combinations (nCr)
1. Start the program.
2. Define a function `fact(int n)` that computes $n!$ using a loop and returns the product.
3. Define a function `nCr(int n, int r)` that computes `fact(n) / (fact(r) * fact(n - r))` and returns the result.
4. In `main()`, call `nCr(5, 2)` and print the result with the label "5C2 = ".
5. Stop the program.

### Question 2: Permutations (nPr)
1. Start the program.
2. Define a function `fact(int n)` that computes $n!$ using a loop and returns the product.
3. Define a function `nPr(int n, int r)` that computes `fact(n) / fact(n - r)` and returns the result.
4. In `main()`, call `nPr(5, 2)` and print the result with the label "5P2 = ".
5. Stop the program.

### Question 3: Maximum of Two Numbers
1. Start the program.
2. Define a function `maxOf(int a, int b)`.
3. If `a > b`, return `a`; otherwise, return `b`.
4. In `main()`, call `maxOf(14, 9)` and print the result with the label "Larger: ".
5. Stop the program.

## 6. Input
The following values are used in the experiment:

### Question 1:
- n = 5, r = 2

### Question 2:
- n = 5, r = 2

### Question 3:
- a = 14, b = 9

## 7. Output

### Question 1:
```
5C2 = 10
```

### Question 2:
```
5P2 = 20
```

### Question 3:
```
Larger: 14
```

---
**Result:** All three Java programs were successfully written and executed to demonstrate function definition, parameter passing, return values, and mathematical calculations.
