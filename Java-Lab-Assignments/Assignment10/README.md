# Assignment 10: Switch and ArrayList

## 1. Experiment Title
Switch Case Statement and Dynamic Lists Using ArrayList in Java.

## 2. Aim
To use Java's `switch` statement for multi-branch decision-making, and to create, manipulate, and inspect dynamic arrays using Java's `ArrayList` collection.

## 3. Software / Tools Required
- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory
Java provides control statements and rich collection frameworks for dynamic data storage.

The following concepts are used in this experiment:

1. **`switch` Statement:**
   Tests a variable against multiple `case` values. The `break` statement prevents fall-through, and `default` handles unhandled cases.

2. **`ArrayList` Class (`java.util.ArrayList`):**
   A resizable array implementation of the `List` interface. Unlike standard arrays, `ArrayList` grows and shrinks automatically.

3. **Key `ArrayList` Methods:**
   - `add(E element)`: Appends an element to the end of the list.
   - `get(int index)`: Retrieves the element at the specified 0-based index.
   - `size()`: Returns the total number of elements currently stored.
   - `set(int index, E element)`: Replaces the element at the specified index with a new value.
   - `remove(int index)`: Removes the element at the specified index and shifts subsequent elements to the left.

## 5. Algorithm / Procedure

### Question 1: Switch Statement for Days of the Week
1. Start the program.
2. Initialize integer `day = 3`.
3. Use a `switch` statement on `day`:
   - Case 1: Print "Monday".
   - Case 2: Print "Tuesday".
   - Case 3: Print "Wednesday".
   - Default: Print "Invalid day".
4. Stop the program.

### Question 2: ArrayList Creation, Size, and Element Access
1. Start the program.
2. Import `java.util.ArrayList`.
3. Create an `ArrayList<Integer>` named `list`.
4. Add elements 10, 20, 30, and 40 using `add()`.
5. Print the entire list.
6. Print "Size: " followed by `list.size()`.
7. Print "Item at index 2: " followed by `list.get(2)`.
8. Stop the program.

### Question 3: ArrayList Modification (set and remove)
1. Start the program.
2. Create and populate `ArrayList<Integer> list` with 10, 20, 30, and 40.
3. Update index 1 to 25 using `list.set(1, 25)`.
4. Delete element at index 3 using `list.remove(3)`.
5. Print the modified list.
6. Print "Size: " followed by `list.size()`.
7. Stop the program.

## 6. Input
The following values are used in the experiment:

### Question 1:
- day = 3

### Question 2:
- Elements added: 10, 20, 30, 40

### Question 3:
- Initial list: [10, 20, 30, 40]
- Operations: set index 1 to 25, remove index 3

## 7. Output

### Question 1:
```
Wednesday
```

### Question 2:
```
[10, 20, 30, 40]
Size: 4
Item at index 2: 30
```

### Question 3:
```
[10, 25, 30]
Size: 3
```

---
**Result:** All three Java programs were successfully written and executed to demonstrate multi-way branching with switch statements and dynamic collection management with ArrayList.
