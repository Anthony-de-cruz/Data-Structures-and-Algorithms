# Data-Structures-and-Algorithms

A repo of data structure and algorithm implementations in various languages

## Project Structure

```shell
.
├── java
│   └── src
│       ├── jmh
│       │   └── java
│       │       └── algorithms
│       │           ├── BinarySearchBenchmark.java
│       │           └── FibonacciBenchmark.java
│       ├── main
│       │   └── java
│       │       ├── algorithms
│       │       │   ├── BinarySearch.java
│       │       │   ├── BubbleSort.java
│       │       │   └── Fibonacci.java
│       │       ├── AlgorithmTester.java
│       │       └── Main.java
│       └── test
│           └── java
│               └── algorithms
│                   ├── BinarySearchTest.java
│                   ├── BubbleSortTest.java
│                   └── FibonacciTest.java
├── python
│   └── src
│       ├── algorithms
│       │   ├── binary_search.py
│       │   ├── bubble_sort.py
│       │   ├── power_of_2.py
│       │   ├── quick_sort.py
│       │   └── two_crystal_balls.py
│       ├── data_structures
│       │   └── binary_tree.py
│       └── main.py
└── README.md
```

## Benchmarking

Benchmarking of implementations is currently setup for:

- Java

Todo:

- Python

### Java

The benchmarking is done via [JMH](https://github.com/openjdk/jmh),
integrated into Gradle using [jmh-gradle-plugin](https://github.com/melix/jmh-gradle-plugin)
