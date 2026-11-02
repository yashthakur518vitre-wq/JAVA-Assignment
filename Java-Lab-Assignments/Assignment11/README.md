# Assignment 11: Bubble Sort and Selection Sort

## 1. Experiment Title
Bubble Sort, Selection Sort, and Swap Counting in Java.

## 2. Aim
To implement and analyze comparison-based sorting algorithms (Bubble Sort and Selection Sort) on integer arrays and count the number of swap operations performed.

## 3. Software / Tools Required
- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory
Sorting is the process of arranging data in ascending or descending order.

The following concepts are used in this experiment:

1. **Bubble Sort:**
   Repeatedly steps through the array, compares adjacent elements, and swaps them if they are in the wrong order. With each pass, the largest unsorted element "bubbles" to its correct position at the end.
   - Time Complexity: $O(n^2)$ worst and average case, $O(n)$ best case.
   - Space Complexity: $O(1)$.

2. **Selection Sort:**
   Divides the array into sorted and unsorted subarrays. In each iteration, it finds the minimum element from the unsorted subarray and swaps it with the first unsorted element.
   - Time Complexity: $O(n^2)$ across all cases.
   - Number of swaps: at most $n - 1$.

3. **Swap Counting:**
   Tracking the exact number of times two elements exchange places provides an empirical measure of sorting effort.

## 5. Algorithm / Procedure

### Question 1: Bubble Sort Implementation
1. Start the program.
2. Initialize array `arr = {5, 1, 4, 2, 8}`.
3. For `i = 0` to `arr.length - 2`:
   - For `j = 0` to `arr.length - 2 - i`:
     - If `arr[j] > arr[j + 1]`, swap `arr[j]` and `arr[j + 1]`.
4. Print "Sorted: " followed by the sorted array.
5. Stop the program.

### Question 2: Selection Sort Implementation
1. Start the program.
2. Initialize array `arr = {64, 25, 12, 22, 11}`.
3. For `i = 0` to `arr.length - 2`:
   - Set `minIdx = i`.
   - For `j = i + 1` to `arr.length - 1`:
     - If `arr[j] < arr[minIdx]`, update `minIdx = j`.
   - Swap `arr[minIdx]` with `arr[i]`.
4. Print "Sorted: " followed by the sorted array.
5. Stop the program.

### Question 3: Bubble Sort with Swap Counter
1. Start the program.
2. Initialize array `arr = {5, 1, 4, 2, 8}` and `swaps = 0`.
3. In the Bubble Sort nested loops, whenever `arr[j] > arr[j + 1]`:
   - Perform the swap.
   - Increment `swaps`.
4. Print "Swaps: " followed by `swaps`.
5. Stop the program.

## 6. Input
The following values are used in the experiment:

### Question 1:
- Array: `{5, 1, 4, 2, 8}`

### Question 2:
- Array: `{64, 25, 12, 22, 11}`

### Question 3:
- Array: `{5, 1, 4, 2, 8}`

## 7. Output

### Question 1:
```
Sorted: [1, 2, 4, 5, 8]
```

### Question 2:
```
Sorted: [11, 12, 22, 25, 64]
```

### Question 3:
```
Swaps: 4
```

---
**Result:** All three Java programs were successfully written and executed to demonstrate Bubble Sort, Selection Sort, and swap metric tracking.
