# Sorting Utils
sorting utils package contains all the necessary functions required while writing sorting algorithms,
so that you can focus on writing the algorithm part and let Utils take care of everything else.
`import utils.*SortUtils*;` to import the library into file.
Available modules include:
- `SortUtils` : This module contains all the necessary functions required while writing sorting algorithms.

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
tellTime(startTime, endTime);
```
- `long startTime` → Start time (Can be calculated using `System.nanoTime();`)
- `long endTime` → End time (Can be calculated using `System.nanoTime();`)
<br><hr><hr>
**you can also specifiy what unit you want by passing it as a char parameter**
- `char unit` → Unit for time (`'s'` for seconds, `'m'` for milliseconds, `'n'` for nanoseconds, **default** case also returns nanoseconds)


## How to Compile?
```batch
cd ada-lab
javac -d . utils/SortUtils.java sorting_algos/<FILE_NAME>.java
java sorting_algos.<FILE_NAME>
```
**Note:** Replace `<FILE_NAME>` with the name of your Java file.