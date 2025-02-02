# Sorting Utils
sorting utils package contains all the necessary functions required while writing sorting algorithms,
so that you can focus on writing the algorithm part and let Utils take care of everything else.

## Random Array
```java
int[] arrayName = SortUtils.getRandomArray(n, bound);
```
- `int n` → Number of elements
- `int bound` → Upper bound for selecting random numbers

**returns** a random unsorted array of integers.

## Print Array
```java
SortUtils.printArray(arrayName);
```
- `arrayName` → Array to be printed

**prints** the array.

## Time Calculation
```java
tellTime(startTime, endTime, unit);
```
- `long startTime` → Start time (Can be calculated using `System.nanoTime();`)
- `long endTime` → End time (Can be calculated using `System.nanoTime();`)
- `char unit` → Unit for time (`'s'` for seconds, `'m'` for milliseconds, `'n'` for nanoseconds)

## How to Compile?
```batch
cd ada-lab
javac .\sorting_algos\SortUtils.java .\sorting_algos\<FileName.java>
java sorting_algos.MergeSort
```