# Assignment 8: Matrices: Transpose and Row Sums

## 1. Experiment Title
Matrix Operations: Creation, Transposition, and Row Sums in Java.

## 2. Aim
To create two-dimensional arrays (matrices) in Java, populate and display them, compute the matrix transpose, and calculate the sum of each row.

## 3. Software / Tools Required
- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory
A matrix in Java is represented as a 2-dimensional array (`int[][]`), which is essentially an array of arrays.

The following concepts are used in this experiment:

1. **Matrix Representation:**
   An $m \times n$ matrix contains $m$ rows and $n$ columns. Element at row $i$ and column $j$ is accessed as `matrix[i][j]`.

2. **Matrix Transpose:**
   The transpose of a matrix $A$ is formed by swapping rows and columns:
   $$A^T[j][i] = A[i][j]$$

3. **Row Sum Calculation:**
   For each row $i$, iterate over all column indices $j$ and accumulate the sum of `matrix[i][j]`.

## 5. Algorithm / Procedure

### Question 1: Create and Fill 3x4 Matrix
1. Start the program.
2. Create a 2D integer array `m` of size $3 \times 4$.
3. Use nested loops to fill `m[i][j]` with sequential values 1 to 12.
4. Use nested loops to print each row separated by spaces.
5. Stop the program.

### Question 2: Matrix Transpose
1. Start the program.
2. Initialize a $3 \times 3$ matrix with values 1 to 9.
3. Create a new $3 \times 3$ matrix `transpose`.
4. Using nested loops, assign `transpose[j][i] = matrix[i][j]`.
5. Print the transposed matrix row by row.
6. Stop the program.

### Question 3: Row-Wise Sums
1. Start the program.
2. Initialize a $3 \times 3$ matrix with values 1 to 9.
3. For each row `i`:
   - Initialize `rowSum = 0`.
   - Iterate through each column `j` and add `matrix[i][j]` to `rowSum`.
   - Print "Row ", `i + 1`, " sum: ", `rowSum`.
4. Stop the program.

## 6. Input
The following values are used in the experiment:

### Question 1:
- Matrix Dimensions: 3 rows × 4 columns
- Values: 1 to 12

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

## 7. Output

### Question 1:
```
1 2 3 4 
5 6 7 8 
9 10 11 12 
```

### Question 2:
```
1 4 7 
2 5 8 
3 6 9 
```

### Question 3:
```
Row 1 sum: 6
Row 2 sum: 15
Row 3 sum: 24
```

---
**Result:** All three Java programs were successfully written and executed to demonstrate 2D array allocation, row/column index swapping for transposition, and row-wise summation.
