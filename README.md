# Dwight-CS-Class

A collection of Java exercises and small projects from a computer science course, organized by topic.

## Contents

- `Challenges/` - short console exercises such as FizzBuzz, BMI, primes, converters, and games.
- `OOP/` and `inheritance/` - classes, inheritance, and object-oriented practice.
- `Project1/` - a console bank account manager with CSV persistence.
- `WarCardGame/` - a two-player War card game.
- `CSV/` - reading and writing CSV data.
- `DataBase/` - a small bank/database example.
- `Formative_Summative/` - assessed exercises including Word Scramble.
- `OOPJune2/`, `GymClubs/`, `Party/`, `Main/` - additional exercises and demos.

## Requirements

- A Java JDK (17 or newer recommended; the sources use text blocks and switch expressions).
- IntelliJ IDEA is optional, but the repository includes a `JavaProjects.iml` module file.

## Build & Run

There is no Maven or Gradle build. Open the folder in IntelliJ IDEA and run the `main` method of the exercise you want, or compile one exercise directly:

```bash
javac -d out src/Challenges/FizzBuzz.java
java -cp out Challenges.FizzBuzz
```

## Notes

These are course exercises rather than a single application. Several folders contain their own `Main` class, and file-based examples use paths relative to the working directory.
