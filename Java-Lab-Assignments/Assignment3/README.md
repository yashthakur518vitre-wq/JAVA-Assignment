# Assignment 3: Star and Number Patterns

## 1. Experiment Title
Star and Number Patterns Using Nested Loops in Java.

## 2. Aim
To write Java programs that print star and number patterns in rows and columns using nested loops.

## 3. Software / Tools Required
- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory
Nested loops are loops placed inside another loop. They are extensively used in pattern printing, matrix processing, and multi-dimensional data handling.

The following concepts are used in this experiment:

1. **Outer Loop:**
   Controls the row index or total number of lines to be printed.

2. **Inner Loop:**
   Controls the column index or number of characters/symbols to be printed on the current row.

3. **Console Output:**
   - `System.out.print()`: Prints text on the current line without advancing to the next line.
   - `System.out.println()`: Advances the cursor to the beginning of the next line after the inner loop completes for a row.

## 5. Algorithm / Procedure

### Question 1: Square Star Pattern
1. Start the program.
2. Run an outer loop `i` from 1 to 4 for rows.
3. Run an inner loop `j` from 1 to 4 for columns.
4. In the inner loop, print `*`.
5. After the inner loop, print a new line.
6. Stop the program.

### Question 2: Right Triangle Star Pattern
1. Start the program.
2. Run an outer loop `i` from 1 to 4 for rows.
3. Run an inner loop `j` from 1 to `i`.
4. In the inner loop, print `*`.
5. After the inner loop, print a new line.
6. Stop the program.

### Question 3: Number Triangle Pattern
1. Start the program.
2. Run an outer loop `i` from 1 to 4 for rows.
3. Run an inner loop `j` from 1 to `i`.
4. In the inner loop, print `j` followed by a space.
5. After the inner loop, print a new line.
6. Stop the program.

### Question 4: Upside-Down Triangle Star Pattern
1. Start the program.
2. Run an outer loop `i` from 4 down to 1.
3. Run an inner loop `j` from 1 to `i`.
4. In the inner loop, print `*`.
5. After the inner loop, print a new line.
6. Stop the program.

## 6. Input
The following values are used in the experiment:

### Question 1:
- Rows = 4, Columns = 4

### Question 2:
- Rows = 4

### Question 3:
- Rows = 4

### Question 4:
- Rows = 4

## 7. Output

### Question 1:
```
****
****
****
****
```

### Question 2:
```
*
**
***
****
```

### Question 3:
```
1 
1 2 
1 2 3 
1 2 3 4 
```

### Question 4:
```
****
***
**
*
```

---
**Result:** All four Java programs were successfully written and executed to demonstrate nested loop control flow and row-by-row pattern generation.
