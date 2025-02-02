# Sorting Utils
sorting utils package contains all the necessary functions required while writing sorting algorithms,
so that you can focus on writing the algorithm part and let Utils take care of everything else.

## Random Array
```
int [] arrayName = getRandomArray(n, bound);
```
> int n --> number of elements
> int bound --> bound for selecting random numbers from

**returns** a random unsorted array of integers.

## Print Array
```
SortUtils.printArray(arrayName);
```
> arrayName --> array to be printed

prints the array.

## Time Calculation
- `long startTime` → Start time (Can be calculated using `System.nanoTime();`)
- `long endTime` → End time (Can be calculated using `System.nanoTime();`)
- `char unit` → Unit for time (`'s'` for seconds, `'m'` for milliseconds, `'n'` for nanoseconds)

## How to Compile?
```
cd ada-lab
javac .\sorting_algos\RandomUtils.java .\sorting_algos\MergeSort.java
java sorting_algos.MergeSort
```