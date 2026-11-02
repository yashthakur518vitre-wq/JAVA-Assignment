# Assignment 7: Counting Steps and Complexity

## 1. Experiment Title
Counting Execution Steps and Analyzing Time Complexity in Java.

## 2. Aim
To count the execution steps of single, nested, and halving loops in Java, and annotate them with their respective Big-O time complexities.

## 3. Software / Tools Required
- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory
Time complexity characterizes the amount of execution time an algorithm takes as a function of the input size $n$.

The following concepts are used in this experiment:

1. **Linear Time Complexity $O(n)$:**
   A single loop executing from 1 to $n$ performs $n$ constant-time operations. For $n = 10$, step count is 10.

2. **Quadratic Time Complexity $O(n^2)$:**
   Two nested loops, each executing from 1 to $n$, execute the inner loop body $n \times n = n^2$ times. For $n = 10$, step count is $10 \times 10 = 100$.

3. **Logarithmic Time Complexity $O(\log n)$:**
   A loop where the input size is repeatedly divided by 2 halves the remaining work each iteration. The number of iterations to reduce $n$ to 1 is $\log_2(n)$. For $n = 1024$, $\log_2(1024) = 10$ steps.

## 5. Algorithm / Procedure

### Question 1: Linear Loop Counting (O(n))
1. Start the program.
2. Initialize `steps = 0`.
3. Add comment `// Time Complexity: O(n)`.
4. Run loop `i` from 1 to 10 and increment `steps`.
5. Print "Steps: " followed by `steps`.
6. Stop the program.

### Question 2: Nested Loops Counting (O(n^2))
1. Start the program.
2. Initialize `steps = 0`.
3. Add comment `// Time Complexity: O(n^2)`.
4. Run outer loop `i` from 1 to 10 and inner loop `j` from 1 to 10.
5. In the inner loop, increment `steps`.
6. Print "Steps: " followed by `steps`.
7. Stop the program.

### Question 3: Logarithmic Halving Loop (O(log n))
1. Start the program.
2. Initialize `n = 1024` and `count = 0`.
3. Add comment `// Time Complexity: O(log n)`.
4. While `n > 1`:
   - Divide `n` by 2 (`n = n / 2`).
   - Increment `count`.
5. Print "Halving steps: " followed by `count`.
6. Stop the program.

## 6. Input
The following values are used in the experiment:

### Question 1:
- Loop bounds: 1 to 10

### Question 2:
- Loop bounds: Outer: 1 to 10, Inner: 1 to 10

### Question 3:
- Initial value: n = 1024

## 7. Output

### Question 1:
```
Steps: 10
```

### Question 2:
```
Steps: 100
```

### Question 3:
```
Halving steps: 10
```

---
**Result:** All three Java programs were successfully written and executed to demonstrate step counting and time complexity analysis ($O(n)$, $O(n^2)$, and $O(\log n)$).
