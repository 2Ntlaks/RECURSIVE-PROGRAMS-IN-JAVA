# 🔄 Recursive Programs in Java

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

A collection of simple recursive programs written in Java, designed specifically for **beginners** who want to understand recursion concepts. Each program is written in a clear, easy-to-understand format that can be easily converted to any other programming language.

## 📚 What is Recursion?

**Recursion** is a programming technique where a function calls itself to solve a smaller version of the same problem. Every recursive function needs:

1. **Base Case** - A condition that stops the recursion
2. **Recursive Case** - The function calling itself with modified parameters

## 🎯 Why Learn Recursion?

- **Problem Solving** - Breaks complex problems into smaller, manageable pieces
- **Mathematical Concepts** - Perfect for factorial, Fibonacci, and mathematical sequences  
- **Data Structures** - Essential for trees, graphs, and linked lists
- **Algorithm Design** - Foundation for divide-and-conquer algorithms
- **Interview Preparation** - Common topic in coding interviews

## 📁 Programs Included

| Program | Description | Concept Demonstrated |
|---------|-------------|---------------------|
| **AscendingOrder** | Print numbers 1 to N in ascending order | Basic recursion with print-after-call |
| **DescendingOrder** | Print numbers N to 1 in descending order | Basic recursion with print-before-call |
| **Factorial** | Calculate N! (N factorial) | Mathematical recursion |
| **Exponent** | Calculate base^power | Recursive multiplication |
| **FibonacciSeries** | Calculate Nth Fibonacci number | Multiple recursive calls |
| **SumOfNaturalNumbers** | Calculate sum of first N natural numbers | Accumulative recursion |

## 🚀 Quick Start

### Prerequisites
- Java 8 or higher
- Basic understanding of Java syntax
- IDE or text editor (Eclipse, IntelliJ IDEA, VS Code, etc.)

### Running the Programs

1. **Clone the repository**
   ```bash
   git clone https://github.com/2Ntlaks/RECURSIVE-PROGRAMS-IN-JAVA.git
   cd RECURSIVE-PROGRAMS-IN-JAVA
   ```

2. **Navigate to any program folder**
   ```bash
   cd AscendingOrder/src/main/java/com/mycompany/ascendingorder/
   ```

3. **Compile and run**
   ```bash
   javac AscendingOrder.java
   java AscendingOrder
   ```

4. **Or use Maven** (if you have Maven installed)
   ```bash
   cd AscendingOrder
   mvn compile exec:java
   ```

## 📖 Program Examples

### 1. Ascending Order (1, 2, 3, ..., N)
```java
private static void ascendingOrder(int number) {
    if(number > 0) {                    // Base case: stop when number <= 0
        ascendingOrder(number - 1);     // Recursive call first
        System.out.printf("%d ", number); // Print after recursive call
    }
}
```
**Input:** `5` → **Output:** `1 2 3 4 5`

### 2. Descending Order (N, N-1, N-2, ..., 1)
```java
private static void discendingOrder(int number) {
    if (number > 0) {                     // Base case: stop when number <= 0
        System.out.printf("%d ", number); // Print before recursive call
        discendingOrder(number - 1);      // Recursive call after
    }
}
```
**Input:** `5` → **Output:** `5 4 3 2 1`

### 3. Factorial (N! = N × (N-1) × ... × 1)
```java
private static int fact(int number) {
    if (number == 0)                // Base case: 0! = 1
        return 1;
    else
        return number * fact(number - 1); // Recursive case
}
```
**Input:** `5` → **Output:** `120` (5! = 5×4×3×2×1)

### 4. Fibonacci Sequence (0, 1, 1, 2, 3, 5, 8, ...)
```java
private static int fib(int number) {
    if (number == 0 || number == 1)  // Base cases: fib(0)=0, fib(1)=1
        return number;
    else
        return fib(number - 2) + fib(number - 1); // Sum of previous two
}
```
**Input:** `6` → **Output:** `8` (0,1,1,2,3,5,**8**)

## 🎓 Learning Path for Beginners

### Step 1: Start Here 🌟
- **AscendingOrder** - Understand basic recursion flow
- **DescendingOrder** - See how call order affects output

### Step 2: Mathematical Recursion
- **Factorial** - Learn return values in recursion
- **SumOfNaturalNumbers** - Practice accumulation

### Step 3: More Complex Examples
- **Exponent** - Multiple parameter recursion
- **FibonacciSeries** - Multiple recursive calls

## 💡 Understanding Recursion Flow

### Ascending Order Example (Input: 3)

```
ascendingOrder(3)
├── ascendingOrder(2)
│   ├── ascendingOrder(1)
│   │   ├── ascendingOrder(0) → stops (base case)
│   │   └── prints "1"
│   └── prints "2"
└── prints "3"

Output: 1 2 3
```

### Factorial Example (Input: 4)

```
fact(4)
├── 4 * fact(3)
│   ├── 4 * 3 * fact(2)
│   │   ├── 4 * 3 * 2 * fact(1)
│   │   │   ├── 4 * 3 * 2 * 1 * fact(0)
│   │   │   │   └── 4 * 3 * 2 * 1 * 1 = 24
│   │   │   └── returns 1
│   │   └── returns 2
│   └── returns 6
└── returns 24

Output: 24
```

## 🔧 Common Beginner Mistakes

### ❌ Missing Base Case
```java
// This will cause infinite recursion!
private static void badRecursion(int n) {
    System.out.println(n);
    badRecursion(n - 1); // Never stops!
}
```

### ✅ Correct Base Case
```java
private static void goodRecursion(int n) {
    if (n <= 0) return;  // Base case stops recursion
    System.out.println(n);
    goodRecursion(n - 1);
}
```

### ❌ Wrong Parameter Modification
```java
// This won't progress toward base case
private static int badFact(int n) {
    if (n == 0) return 1;
    return n * badFact(n); // Should be badFact(n-1)
}
```

## 📊 Time & Space Complexity

| Program | Time Complexity | Space Complexity | Notes |
|---------|----------------|------------------|--------|
| Ascending/Descending | O(n) | O(n) | Linear recursion |
| Factorial | O(n) | O(n) | Linear recursion |
| Exponent | O(n) | O(n) | n = power value |
| Sum of Numbers | O(n) | O(n) | Linear recursion |
| Fibonacci | O(2^n) | O(n) | ⚠️ Exponential time! |

> **Note:** Fibonacci has exponential time complexity because it recalculates the same values multiple times. This is intentionally kept simple for learning - optimization techniques like memoization are advanced topics.

## 🎯 Practice Exercises

After understanding these programs, try implementing:

1. **Count Digits** - Count digits in a number recursively
2. **Reverse Number** - Reverse a number using recursion  
3. **Check Palindrome** - Check if a string is palindrome
4. **Array Sum** - Calculate sum of array elements
5. **Binary Search** - Search in sorted array

## 📝 Sample Input/Output

### AscendingOrder
```
Enter n number to be display in ascending order: 4
1 2 3 4
```

### Factorial
```
Enter n number you want factorial of: 5
Factorial of 5 is: 120
```

### FibonacciSeries
```
Enter n number of fibonacci series: 7
Fibonacci series of 7: 13
```

## 🤝 Contributing

Found a bug or want to add more beginner-friendly recursive programs? Contributions are welcome!

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/NewRecursiveProgram`)
3. Commit your changes (`git commit -am 'Add new recursive program'`)
4. Push to the branch (`git push origin feature/NewRecursiveProgram`)
5. Open a Pull Request

## 📜 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Ntlakanipho Mgaguli** - *Initial work* - [@2Ntlaks](https://github.com/2Ntlaks)

## 🌟 Show Your Support

If this repository helped you understand recursion, please ⭐ star it to help other beginners find it!

---

### 📚 Additional Resources for Learning Recursion

- [Recursion Visualization Tool](https://recursion.vercel.app/) - Visualize how recursion works
- [Khan Academy - Intro to Recursion](https://www.khanacademy.org/computing/computer-science/algorithms/recursive-algorithms/a/recursion)
- [GeeksforGeeks Recursion](https://www.geeksforgeeks.org/recursion/) - More examples and practice problems

**Happy Learning! 🚀**

> *"To understand recursion, you must first understand recursion."* - Classic programming joke 😄