# Assignment 9: Matrices: Rows and Columns

## 1. Experiment Title
Matrix Row Extraction, Column Sums, and Element Filtering in Java.

## 2. Aim
To access specific rows of a matrix, compute column-wise sums, and count elements exceeding a threshold in a two-dimensional array.

## 3. Software / Tools Required
- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory
Traversing matrices across rows versus columns requires controlling which index corresponds to the outer loop.

The following concepts are used in this experiment:

1. **Accessing Boundary Rows:**
   - First row: accessed via `matrix[0][j]`.
   - Last row: accessed via `matrix[matrix.length - 1][j]`.

2. **Column-Wise Traversal:**
   To calculate column sums, the outer loop iterates over columns `j`, while the inner loop iterates over rows `i`, accumulating `matrix[i][j]`.

3. **Matrix Element Filtering:**
   Iterating over all cells $(i, j)$ and incrementing a counter whenever `matrix[i][j] > 5`.

## 5. Algorithm / Procedure

### Question 1: First and Last Rows
1. Start the program.
2. Initialize a $3 \times 3$ matrix with values 1 to 9.
3. Print "First row:" followed by all elements in `matrix[0]`.
4. Print "Last row:" followed by all elements in `matrix[2]`.
5. Stop the program.

### Question 2: Column-Wise Sums
1. Start the program.
2. Initialize a $3 \times 3$ matrix with values 1 to 9.
3. For each column index `j` from 0 to 2:
   - Initialize `colSum = 0`.
   - For each row index `i` from 0 to 2, add `matrix[i][j]` to `colSum`.
   - Print "Column ", `j + 1`, " sum: ", `colSum`.
4. Stop the program.

### Question 3: Count Elements Greater than 5
1. Start the program.
2. Initialize a $3 \times 3$ matrix with values 1 to 9.
3. Initialize `count = 0`.
4. Traverse the matrix using nested loops:
   - If `matrix[i][j] > 5`, increment `count`.
5. Print "Values greater than 5: " followed by `count`.
6. Stop the program.

## 6. Input
The following values are used in the experiment:

### Question 1:
- Matrix:
  ```
  1 2 3
  4 5 6
  7 8 9
  ```

### Question 2:
- Matrix:
  ```
  1 2 3
  4 5 6
  7 8 9
  ```

### Question 3:
- Matrix:
  ```
  1 2 3
  4 5 6
  7 8 9
  ```
- Threshold: > 5

## 7. Output

### Question 1:
```
First row: 1 2 3
Last row: 7 8 9
```

### Question 2:
```
Column 1 sum: 12
Column 2 sum: 15
Column 3 sum: 18
```

### Question 3:
```
Values greater than 5: 4
```

---
**Result:** All three Java programs were successfully written and executed to demonstrate row boundary extraction, column-major traversal, and element filtering in matrices.
