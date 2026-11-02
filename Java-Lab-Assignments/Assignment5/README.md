# Assignment 5: Arrays: Traversal and Counting

## 1. Experiment Title
Array Traversal, Sum, Maximum, and Element Counting in Java.

## 2. Aim
To create one-dimensional integer arrays in Java, traverse them using `for` loops, compute the sum and largest element, and count elements satisfying specific conditions.

## 3. Software / Tools Required
- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory
An array is a linear data structure that stores a fixed-size sequential collection of elements of the same type.

The following concepts are used in this experiment:

1. **Array Declaration & Initialization:**
   `int[] arr = {3, 4, 5};` creates and initializes an array in contiguous memory locations.

2. **Zero-Based Indexing:**
   Array indices start at `0` and end at `arr.length - 1`.

3. **Array Property `length`:**
   `arr.length` returns the total number of elements in the array.

4. **Accumulation & Linear Search:**
   - **Summation:** Incrementing an accumulator variable across loop iterations.
   - **Finding Maximum:** Maintaining a running maximum initialized to `arr[0]` and updating it whenever a larger element is found.
   - **Conditional Counting:** Incrementing a counter when an element satisfies a condition (`arr[i] > 10`).

## 5. Algorithm / Procedure

### Question 1: Array Traversal with Index
1. Start the program.
2. Initialize an int array `arr = {3, 4, 5}`.
3. Run a `for` loop from `i = 0` to `arr.length - 1`.
4. Print "Index ", `i`, ": ", and `arr[i]`.
5. Stop the program.

### Question 2: Array Sum and Largest Element
1. Start the program.
2. Initialize an int array `arr = {12, 45, 7, 33, 21}`.
3. Initialize `sum = 0` and `largest = arr[0]`.
4. Traverse the array with a loop:
   - Add `arr[i]` to `sum`.
   - If `arr[i] > largest`, set `largest = arr[i]`.
5. Print "Sum: " followed by `sum`.
6. Print "Largest: " followed by `largest`.
7. Stop the program.

### Question 3: Count Elements Greater than 10
1. Start the program.
2. Initialize an int array `arr = {5, 12, 2, 14, 7}`.
3. Initialize `count = 0`.
4. Traverse the array with a loop:
   - If `arr[i] > 10`, increment `count`.
5. Print "Count greater than 10: " followed by `count`.
6. Stop the program.

## 6. Input
The following values are used in the experiment:

### Question 1:
- Array: `{3, 4, 5}`

### Question 2:
- Array: `{12, 45, 7, 33, 21}`

### Question 3:
- Array: `{5, 12, 2, 14, 7}`
- Condition: Values greater than 10

## 7. Output

### Question 1:
```
Index 0: 3
Index 1: 4
Index 2: 5
```

### Question 2:
```
Sum: 118
Largest: 45
```

### Question 3:
```
Count greater than 10: 2
```

---
**Result:** All three Java programs were successfully written and executed to demonstrate array creation, traversal, aggregation, and conditional filtering.
