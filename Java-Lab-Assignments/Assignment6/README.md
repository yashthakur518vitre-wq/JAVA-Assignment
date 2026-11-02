# Assignment 6: Arrays: Reverse and Duplicates

## 1. Experiment Title
Array Reversal, Minimum Element Finding, and Duplicate Detection in Java.

## 2. Aim
To write Java programs that traverse an array in reverse order, determine the smallest element along with its index, and detect repeated values using nested loops.

## 3. Software / Tools Required
- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory
Processing arrays in reverse and performing pairwise comparisons are essential array manipulation techniques.

The following concepts are used in this experiment:

1. **Reverse Traversal:**
   Starting loop counter at `arr.length - 1` and decrementing `i` until `0` visits elements in reverse order.

2. **Tracking Minimum Element and Index:**
   Initialize `smallest = arr[0]` and `index = 0`. Compare each subsequent element; if a smaller element is encountered, update both value and index.

3. **Pairwise Comparison (Nested Loops):**
   To find duplicate elements, the outer loop selects an element at index `i`, while the inner loop compares it with all elements at indices `j > i`.

## 5. Algorithm / Procedure

### Question 1: Reverse Array Traversal
1. Start the program.
2. Initialize an int array `arr = {10, 20, 30, 40, 50}`.
3. Run a `for` loop starting at `arr.length - 1` down to 0.
4. Print each element on a new line.
5. Stop the program.

### Question 2: Smallest Value and Index
1. Start the program.
2. Initialize an int array `arr = {2, 5, 1, 8, 3, 4}`.
3. Set `smallest = arr[0]` and `index = 0`.
4. Iterate from index 1 to `arr.length - 1`:
   - If `arr[i] < smallest`, update `smallest = arr[i]` and `index = i`.
5. Print "Smallest: " followed by `smallest`, " at index ", and `index`.
6. Stop the program.

### Question 3: Duplicate Element Detection
1. Start the program.
2. Initialize an int array `arr = {4, 9, 2, 9, 7}`.
3. Set a boolean flag `found = false` and variable `repeated = 0`.
4. Run outer loop `i` from 0 to `arr.length - 1` and inner loop `j` from `i + 1` to `arr.length - 1`:
   - If `arr[i] == arr[j]`, assign `repeated = arr[i]`, set `found = true`, and break.
5. If `found`, print "Repeated value: " followed by `repeated`; otherwise, print "No repeated value".
6. Stop the program.

## 6. Input
The following values are used in the experiment:

### Question 1:
- Array: `{10, 20, 30, 40, 50}`

### Question 2:
- Array: `{2, 5, 1, 8, 3, 4}`

### Question 3:
- Array: `{4, 9, 2, 9, 7}`

## 7. Output

### Question 1:
```
50
40
30
20
10
```

### Question 2:
```
Smallest: 1 at index 2
```

### Question 3:
```
Repeated value: 9
```

---
**Result:** All three Java programs were successfully written and executed to demonstrate reverse array iteration, index tracking for minimum elements, and duplicate search using nested loops.
