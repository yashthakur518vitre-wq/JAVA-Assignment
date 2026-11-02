# Assignment 12: Insertion Sort

## 1. Experiment Title
Insertion Sort Implementation and Shift Counting in Java.

## 2. Aim
To implement Insertion Sort on integer arrays and count the total number of element shift operations performed during sorting.

## 3. Software / Tools Required
- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory
Insertion Sort builds the final sorted array one item at a time, similar to the way people sort playing cards in their hands.

The following concepts are used in this experiment:

1. **Algorithm Principle:**
   - The array is virtually divided into a sorted and an unsorted part.
   - Values from the unsorted part are picked and placed into the correct position in the sorted part.
   - Elements greater than the current key are shifted one position to the right.

2. **Shifts vs Swaps:**
   Unlike Bubble Sort which performs complete swaps (requiring 3 assignments per swap), Insertion Sort shifts elements to the right until the proper insertion point is found.

3. **Complexity:**
   - Best Case: $O(n)$ when already sorted (0 shifts).
   - Worst Case: $O(n^2)$ when reverse sorted (shifts = $n(n - 1)/2$).
   - For a reverse-sorted array of 6 elements: $1 + 2 + 3 + 4 + 5 = 15$ shifts.

## 5. Algorithm / Procedure

### Question 1: Insertion Sort (Small Array)
1. Start the program.
2. Initialize array `arr = {7, 3, 5, 1}`.
3. For `i = 1` to `arr.length - 1`:
   - Store `key = arr[i]` and `j = i - 1`.
   - While `j >= 0` and `arr[j] > key`:
     - Shift `arr[j + 1] = arr[j]`.
     - Decrement `j`.
   - Place `arr[j + 1] = key`.
4. Print "Sorted: " followed by the array.
5. Stop the program.

### Question 2: Insertion Sort (General Array)
1. Start the program.
2. Initialize array `arr = {14, 3, 9, 21, 6}`.
3. Apply the Insertion Sort procedure.
4. Print "Sorted: " followed by the array.
5. Stop the program.

### Question 3: Insertion Sort with Shift Counter
1. Start the program.
2. Initialize array `arr = {6, 5, 4, 3, 2, 1}` and `shifts = 0`.
3. For each outer loop `i = 1` to `arr.length - 1`:
   - Store `key = arr[i]` and `j = i - 1`.
   - While `j >= 0` and `arr[j] > key`:
     - Shift `arr[j + 1] = arr[j]`.
     - Increment `shifts`.
     - Decrement `j`.
   - Place `arr[j + 1] = key`.
4. Print "Shifts: " followed by `shifts`.
5. Stop the program.

## 6. Input
The following values are used in the experiment:

### Question 1:
- Array: `{7, 3, 5, 1}`

### Question 2:
- Array: `{14, 3, 9, 21, 6}`

### Question 3:
- Array: `{6, 5, 4, 3, 2, 1}`

## 7. Output

### Question 1:
```
Sorted: [1, 3, 5, 7]
```

### Question 2:
```
Sorted: [3, 6, 9, 14, 21]
```

### Question 3:
```
Shifts: 15
```

---
**Result:** All three Java programs were successfully written and executed to demonstrate the Insertion Sort algorithm and quantify shift operations.
