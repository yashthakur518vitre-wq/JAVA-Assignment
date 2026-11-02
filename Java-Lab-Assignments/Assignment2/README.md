# Assignment 2: Decisions and Loops with Numbers

## 1. Experiment Title
Decisions and Loops with Numbers in Java.

## 2. Aim
To write Java programs that use decision-making statements (`if-else`, `else-if` ladder) and loops (`for` loop) to make decisions and perform iterative operations with numbers.

## 3. Software / Tools Required
- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory
Decision-making and looping structures control the flow of execution in Java programs.

The following concepts are used in this experiment:

1. **`if-else` Statement:**
   Tests a condition. If the condition evaluates to true, the `if` block executes; otherwise, the `else` block executes.

2. **`else-if` Ladder:**
   Used to test multiple conditions in sequence. When a condition is met, its corresponding code block executes and the rest of the ladder is skipped.

3. **Logical Operators:**
   - `&&` (Logical AND): Returns true if both conditions are true.
   - `||` (Logical OR): Returns true if at least one condition is true.

4. **Leap Year Logic:**
   A year is a leap year if it is divisible by 4 but not by 100, or if it is divisible by 400: `(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)`.

5. **`for` Loop:**
   Repeats a block of statements a specific number of times. It consists of initialization, condition checking, and update (increment/decrement).

6. **Factorial:**
   The factorial of a non-negative integer $n$ is the product of all positive integers less than or equal to $n$: $n! = 1 \times 2 \times 3 \times \dots \times n$.

## 5. Algorithm / Procedure

### Question 1: Even or Odd Check
1. Start the program.
2. Initialize an integer variable `n` with 27.
3. Check if `n % 2 == 0`.
4. If true, print that `n` is even.
5. If false, print that `n` is odd.
6. Stop the program.

### Question 2: Grade Assignment
1. Start the program.
2. Initialize an integer variable `marks` with 83.
3. If `marks >= 90`, print "Grade: A".
4. Else if `marks >= 75`, print "Grade: B".
5. Else, print "Grade: C".
6. Stop the program.

### Question 3: Leap Year Check
1. Start the program.
2. Initialize an integer variable `year` with 2024.
3. Check if `(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)`.
4. If true, print "Leap year".
5. Else, print "Not a leap year".
6. Stop the program.

### Question 4: Factorial Calculation
1. Start the program.
2. Initialize an integer variable `n` with 5 and `fact` with 1.
3. Run a `for` loop from `i = 1` to `n`.
4. In each iteration, multiply `fact` by `i`.
5. Display "Factorial of 5 is " followed by `fact`.
6. Stop the program.

## 6. Input
The following values are used in the experiment:

### Question 1:
- n = 27

### Question 2:
- marks = 83

### Question 3:
- year = 2024

### Question 4:
- n = 5

## 7. Output

### Question 1:
```
27 is odd
```

### Question 2:
```
Grade: B
```

### Question 3:
```
Leap year
```

### Question 4:
```
Factorial of 5 is 120
```

---
**Result:** All four Java programs were successfully written and executed to demonstrate conditional statements, else-if ladders, logical conditions, and loop execution.
