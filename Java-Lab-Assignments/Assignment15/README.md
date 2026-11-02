# Assignment 15: StringBuilder Methods

## 1. Experiment Title
Mutable String Manipulation Using StringBuilder in Java.

## 2. Aim
To use `StringBuilder` methods (`append`, `insert`, `deleteCharAt`) to construct and modify mutable sequences of characters.

## 3. Software / Tools Required
- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory
In Java, `String` objects are immutable. Performing repeated concatenations with `+` creates multiple intermediary objects in memory. `StringBuilder` provides a mutable alternative for efficient string construction and modification.

The following concepts are used in this experiment:

1. **`StringBuilder` Class:**
   Located in `java.lang`, it allows modifying character sequences without creating new objects.

2. **Key Methods:**
   - `append(data)`: Appends representations of various data types to the end of the sequence.
   - `insert(int offset, String str)`: Inserts the string into this character sequence at the specified index.
   - `deleteCharAt(int index)`: Removes the character at the specified position.
   - `length()`: Returns the number of characters currently held.

## 5. Algorithm / Procedure

### Question 1: StringBuilder Append and Length
1. Start the program.
2. Create a `StringBuilder` initialized with `"Hello"`.
3. Append `" World"` using `append()`.
4. Print the `StringBuilder`.
5. Print "Length: " followed by `sb.length()`.
6. Stop the program.

### Question 2: Number Sequence with Trailing Comma Removal
1. Start the program.
2. Create an empty `StringBuilder sb`.
3. Loop `i` from 1 to 5:
   - Append `i` followed by `","`.
4. Remove the trailing comma using `sb.deleteCharAt(sb.length() - 1)`.
5. Print the `StringBuilder`.
6. Stop the program.

### Question 3: StringBuilder Insert
1. Start the program.
2. Create a `StringBuilder` initialized with `"Java"`.
3. Insert `"Hello "` at index 0 using `sb.insert(0, "Hello ")`.
4. Print the `StringBuilder`.
5. Stop the program.

## 6. Input
The following values are used in the experiment:

### Question 1:
- Initial text: `"Hello"`
- Text to append: `" World"`

### Question 2:
- Sequence: Numbers 1 to 5 separated by comma

### Question 3:
- Initial text: `"Java"`
- Insertion: `"Hello "` at index 0

## 7. Output

### Question 1:
```
Hello World
Length: 11
```

### Question 2:
```
1,2,3,4,5
```

### Question 3:
```
Hello Java
```

---
**Result:** All three Java programs were successfully written and executed to demonstrate efficient mutable text manipulation using StringBuilder methods.
