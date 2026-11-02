# Assignment 14: Characters: Counting and Positions

## 1. Experiment Title
Character Traversal, Vowel Counting, and Frequency Analysis in Java.

## 2. Aim
To access individual characters of a string using `charAt()`, count occurrences of vowels and specific characters, and print each character with its zero-based index.

## 3. Software / Tools Required
- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory
Strings in Java allow character-level inspection through indexed access.

The following concepts are used in this experiment:

1. **`charAt(int index)` Method:**
   Retrieves the `char` at the given 0-based index. Accessing beyond bounds results in `StringIndexOutOfBoundsException`.

2. **Vowel Checking:**
   A character is a vowel if its lowercase form is `'a'`, `'e'`, `'i'`, `'o'`, or `'u'`.

3. **Character Frequency:**
   A counter variable is incremented whenever `s.charAt(i)` matches the target character (`'g'`).

4. **Position Indexing:**
   Printing `i + ": " + s.charAt(i)` associates each character with its 0-based position.

## 5. Algorithm / Procedure

### Question 1: Count Vowels
1. Start the program.
2. Initialize String `s = "programming"` and `vowels = 0`.
3. Iterate from `i = 0` to `s.length() - 1`:
   - Retrieve `ch = Character.toLowerCase(s.charAt(i))`.
   - If `ch` is `'a'`, `'e'`, `'i'`, `'o'`, or `'u'`, increment `vowels`.
4. Print "Vowels: " followed by `vowels`.
5. Stop the program.

### Question 2: Count Specific Character ('g')
1. Start the program.
2. Initialize String `s = "programming"` and `count = 0`.
3. Iterate from `i = 0` to `s.length() - 1`:
   - If `s.charAt(i) == 'g'`, increment `count`.
4. Print "Count of g: " followed by `count`.
5. Stop the program.

### Question 3: Character with Index Position
1. Start the program.
2. Initialize String `s = "hello"`.
3. Iterate from `i = 0` to `s.length() - 1`:
   - Print `i`, ": ", and `s.charAt(i)`.
4. Stop the program.

## 6. Input
The following values are used in the experiment:

### Question 1:
- String: `"programming"`

### Question 2:
- String: `"programming"`
- Target character: `'g'`

### Question 3:
- String: `"hello"`

## 7. Output

### Question 1:
```
Vowels: 3
```

### Question 2:
```
Count of g: 2
```

### Question 3:
```
0: h
1: e
2: l
3: l
4: o
```

---
**Result:** All three Java programs were successfully written and executed to demonstrate character-level iteration, condition-based character counting, and position indexing.
