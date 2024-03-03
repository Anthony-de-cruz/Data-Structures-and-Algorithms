# Data-Structures-and-Algorithms

A repository of data structures, algorithms, and interesting interview question solutions implemented in various langauges.

# Java

### Algorithms implemented in Java:

- Binary Search
- Bubble Sort
- Fibonacci Sequence

### Data structures implemented in Java:

- Binary Tree
  - Insertion
  - Pre Order Traversal
  - Post Order Traversal
  - Breadth First Search
  - Tree Comparison

### Building / Testing

The Java implementations use the Gradle build tool.

In order to build and test on Unix, run:

```sh
cd java
./gradlew build
```

For Windows, run gradlew.bat with the `build` argument

### Benchmarking

The benchmarking is done via [JMH](https://github.com/openjdk/jmh),
integrated into Gradle using the [jmh-gradle-plugin](https://github.com/melix/jmh-gradle-plugin).

In order to build and run benchmarks on Unix, run:

```sh
cd java
./gradlew jmhJar
java -jar build/libs/java-jmh.jar
```

For Windows, run gradlew.bat with the `jmhJar` argument and then run `build/libs/java-jmh.jar`

# Python

### Algorithms implemented in Python:

#### Searching Algorithms
- Binary Search
#### Sorting Algorithms
- Bogo Sort
- Bubble Sort
- Insertion Sort
- Merge Sort
- Quick Sort
- Selection Sort
- Stalin Sort
#### Interview questions
- 2 Crystal Balls Problem
- Find Power of 2 Wihout Division
- Median of Two Sorted Arrays

### Data structures implemented in Python:

- Binary Tree
  - Insertion
  - Pre Order Traversal
  - Post Order Traversal
  - Breadth First Search
  - Tree Comparison

### Building / Testing

Each script performs it's tests when ran as `__main__`

### Benchmarking

Benchmarking not yet setup.
