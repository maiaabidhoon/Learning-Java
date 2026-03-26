---

# 📘 Java Basics – Scanner & Operators (Beginner Guide)

---

## 1. Scanner Class in Java

### What is Scanner?

The `Scanner` class in Java is used to **take input from the user** (keyboard input).

It is part of the package:

```java
import java.util.Scanner;
```

---

### Why do we use Scanner?

Normally, Java programs run with fixed values.
But in real-world applications, we need **user input** like:

* Name
* Age
* Numbers
* Passwords

Scanner helps us make programs **interactive**.

---

### How Scanner Works

1. Import Scanner class
2. Create Scanner object
3. Use methods to take input

---

### Syntax

```java
Scanner sc = new Scanner(System.in);
```

* `sc` → object name (you can change it)
* `System.in` → input comes from keyboard

---

### Example Program

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello " + name + ", Age: " + age);
    }
}
```

---

### Important Scanner Methods

| Method          | Description       | Example        |
| --------------- | ----------------- | -------------- |
| `next()`        | Reads single word | "Aabid"        |
| `nextLine()`    | Reads full line   | "Aabid Husain" |
| `nextInt()`     | Reads integer     | 10             |
| `nextDouble()`  | Reads decimal     | 10.5           |
| `nextBoolean()` | Reads true/false  | true           |

---

### Common Mistake

```java
int age = sc.nextInt();
String name = sc.nextLine(); // problem
```

`nextLine()` may skip input due to newline issue.

Solution:

```java
sc.nextLine(); // clear buffer
String name = sc.nextLine();
```

---

## 2. Operators in Java

### What are Operators?

Operators are symbols used to **perform operations on variables and values**.

Example:

```java
int sum = a + b;
```

Here `+` is an operator.

---

# Types of Operators in Java

---

## 2.1 Arithmetic Operators

### Used for mathematical calculations

| Operator | Meaning        | Example      |
| -------- | -------------- | ------------ |
| `+`      | Addition       | `5 + 3 = 8`  |
| `-`      | Subtraction    | `5 - 3 = 2`  |
| `*`      | Multiplication | `5 * 3 = 15` |
| `/`      | Division       | `5 / 2 = 2`  |
| `%`      | Modulus        | `5 % 2 = 1`  |

---

### Important Concept

Integer division removes decimal:

```java
System.out.println(5 / 2); // Output: 2
```

Use double for decimal:

```java
System.out.println(5.0 / 2); // Output: 2.5
```

---

### Example

```java
int a = 10, b = 3;

System.out.println(a + b); // 13
System.out.println(a - b); // 7
System.out.println(a * b); // 30
System.out.println(a / b); // 3
System.out.println(a % b); // 1
```

---

## 2.2 Logical Operators

### Used with conditions (true/false)

| Operator | Meaning |   |    |
| -------- | ------- | - | -- |
| `&&`     | AND     |   |    |
| `        |         | ` | OR |
| `!`      | NOT     |   |    |

---

### Truth Table

| A | B | A && B | A || B |
|---|---|--------|--------|
| T | T | T | T |
| T | F | F | T |
| F | T | F | T |
| F | F | F | F |

---

### Example

```java
int age = 20;

if (age > 18 && age < 30) {
    System.out.println("Young Adult");
}
```

---

### Real-Life Example

```java
boolean hasID = true;
boolean ageValid = true;

if (hasID && ageValid) {
    System.out.println("Entry Allowed");
}
```

---

## 2.3 Comparison (Relational) Operators

### Used to compare values

| Operator | Meaning          |
| -------- | ---------------- |
| `==`     | Equal            |
| `!=`     | Not equal        |
| `>`      | Greater          |
| `<`      | Less             |
| `>=`     | Greater or equal |
| `<=`     | Less or equal    |

---

### Important

`=` is assignment
`==` is comparison

---

### Example

```java
int a = 5, b = 10;

System.out.println(a == b); // false
System.out.println(a < b);  // true
System.out.println(a != b); // true
```

---

## 2.4 Assignment Operators

### Used to assign and update values

| Operator | Meaning             |
| -------- | ------------------- |
| `=`      | Assign              |
| `+=`     | Add and assign      |
| `-=`     | Subtract and assign |
| `*=`     | Multiply and assign |
| `/=`     | Divide and assign   |

---

### Shortcut Concept

```java
a += 5; // same as a = a + 5
```

---

### Example

```java
int a = 10;

a += 5;  // 15
a -= 3;  // 12
a *= 2;  // 24
a /= 4;  // 6
```

---

## 2.5 Bitwise Operators

### Work on binary (bits: 0 & 1)

---

### Binary Example

```text
5 = 0101
3 = 0011
```

---

### Operators

| Operator | Meaning     |    |
| -------- | ----------- | -- |
| `&`      | AND         |    |
| `        | `           | OR |
| `^`      | XOR         |    |
| `~`      | NOT         |    |
| `<<`     | Left shift  |    |
| `>>`     | Right shift |    |

---

### Example

```java
int a = 5; // 0101
int b = 3; // 0011

System.out.println(a & b); // 0001 → 1
System.out.println(a | b); // 0111 → 7
System.out.println(a ^ b); // 0110 → 6
```

---

### Shift Example

```java
int a = 5; // 0101

System.out.println(a << 1); // 1010 → 10
System.out.println(a >> 1); // 0010 → 2
```

---

## Final Summary

| Topic      | Use                 |
| ---------- | ------------------- |
| Scanner    | Take user input     |
| Arithmetic | Math operations     |
| Logical    | Combine conditions  |
| Comparison | Compare values      |
| Assignment | Store/update values |
| Bitwise    | Binary operations   |

---