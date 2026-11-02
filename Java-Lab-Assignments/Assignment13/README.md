# Assignment 13: Strings: Methods and Palindromes

## 1. Experiment Title
String Methods, Reversal, Palindrome Checking, and Substring Generation in Java.

## 2. Aim
To use standard methods of the Java `String` class, reverse a string using `charAt()`, test if a string is a palindrome, and generate all substrings using `substring()`.

## 3. Software / Tools Required
- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory
Strings in Java are immutable sequences of Unicode characters represented by the `String` class.

The following concepts are used in this experiment:

1. **Common String Methods:**
   - `length()`: Returns the total number of characters.
   - `indexOf(char ch)`: Returns the index of the first occurrence of character `ch` (0-based).
   - `toUpperCase()`: Converts all characters in the string to uppercase.
   - `charAt(int index)`: Returns the character at the specified index.
   - `substring(int beginIndex, int endIndex)`: Extracts characters from `beginIndex` (inclusive) to `endIndex` (exclusive).

2. **String Reversal:**
   Iterating from `str.length() - 1` down to 0 and concatenating characters one by one.

3. **Palindrome Verification:**
   A word is a palindrome if it reads the same backwards as forwards (e.g., "racecar"). Verified using two-pointer comparison or string reversal comparison.

4. **Substring Generation:**
   Two nested loops: the outer loop defines the start index `i`, and the inner loop defines the end index `j = i + 1` to `length`.

## 5. Algorithm / Procedure

### Question 1: String Methods
1. Start the program.
2. Initialize String `str = "Programming"`.
3. Print "Length: " followed by `str.length()`.
4. Print "Position of g: " followed by `str.indexOf('g')`.
5. Print "Upper case: " followed by `str.toUpperCase()`.
6. Stop the program.

### Question 2: String Reversal
1. Start the program.
2. Initialize String `word = "Java"` and `reversed = ""`.
3. Run a loop from `word.length() - 1` down to 0:
   - Append `word.charAt(i)` to `reversed`.
4. Print "Reversed: " followed by `reversed`.
5. Stop the program.

### Question 3: Palindrome Check
1. Start the program.
2. Initialize String `word = "racecar"`.
3. Set two pointers `left = 0` and `right = word.length() - 1`.
4. Compare characters until pointers meet:
   - If `word.charAt(left) != word.charAt(right)`, set `isPalindrome = false` and break.
5. If true, print `word + " is a palindrome"`; otherwise, print `word + " is not a palindrome"`.
6. Stop the program.

### Question 4: Substrings of a String
1. Start the program.
2. Initialize String `str = "abc"`.
3. For `i = 0` to `str.length() - 1`:
   - For `j = i + 1` to `str.length()`:
     - Print `str.substring(i, j)`.
4. Stop the program.

## 6. Input
The following values are used in the experiment:

### Question 1:
- String: `"Programming"`

### Question 2:
- String: `"Java"`

### Question 3:
- String: `"racecar"`

### Question 4:
- String: `"abc"`

## 7. Output

### Question 1:
```
Length: 11
Position of g: 3
Upper case: PROGRAMMING
```

### Question 2:
```
Reversed: avaJ
```

### Question 3:
```
racecar is a palindrome
```

### Question 4:
```
a
ab
abc
b
bc
c
```

---
**Result:** All four Java programs were successfully written and executed to demonstrate string operations, character indexing, palindrome verification, and substring extraction.
