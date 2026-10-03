# Java OOP Practice
This repository contains Java programming exercises focused on fundamental object-oriented programming (OOP) concepts.

[Back to portfolio](https://github.com/lourdhadweh4-del) · [Coursework index](https://github.com/lourdhadweh4-del/lourdhadweh4-del/blob/main/COURSEWORK.md)

## Repository guide

These are learning exercises. Each source folder is compiled separately because some exercises reuse class names.

| Source folder | Java files | Programs with a `main` method |
| --- | ---: | --- |
| [src](src) | 6 | [Book_Main](src/Book_Main.java), [Cat_Main](src/Cat_Main.java), [Dog_Main](src/Dog_Main.java), [Point_Main](src/Point_Main.java), [Student_Main](src/Student_Main.java) |
| [src1](src1) | 13 | [Animal_Main](src1/Animal_Main.java), [Constants](src1/Constants.java), [Initializer](src1/Initializer.java), [generateID_Main](src1/generateID_Main.java) |

## Compile and run

Install a JDK with `javac` and `java` available. The source folders below were compiled successfully with **JDK 24.0.2**. Run commands from the repository root.

### src

```bash
mkdir -p build/src
javac -d build/src src/*.java
java -cp build/src Book_Main
```

### src1

```bash
mkdir -p build/src1
javac -d build/src1 src1/*.java
java -cp build/src1 Animal_Main
```

Choose another entry point from the table to run a different exercise. Some programs prompt for console input; others demonstrate object construction without printing output.

## Scope

These repositories document programming practice and coursework. Successful compilation is a basic check; it does not mean every exercise has complete input validation or production-level behavior.
