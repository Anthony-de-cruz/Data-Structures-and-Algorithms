# Data-Structures-and-Algorithms

A repo of data structure and algorithm implementations in various languages.

# Java
### Algorithms implemented in Java:

- Binary Search
- Bubble Sort
- Fibonacci Sequence

### Data structures implemented in Java:

- Binary Tree
  - Insertion
  - Pre Order Traversal
 
### Building / Testing / Benchmarking
The Java implementations use the Gradle build tool. 

In order to build and test on Unix, run:
```sh
cd java
./gradlew build
```
For Windows, run gradlew.bat with the `build` argument


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

- Binary Search
- Bubble Sort
- Find Power of 2 Wihout Divison

### Data structures implemented in Python:

- Binary Tree
  - Insertion
  - Pre Order Traversal
  - Post Order Traversal
  - Breadth First Search
  - Tree Comparison

### Building / Testing / Benchmarking
Benchmarking not yet setup.
