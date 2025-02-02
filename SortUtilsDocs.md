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
```
tellTime(startTime, endTime, unit);
```
> long startTime --> start time
can be calculated using:
```
long startTime = System.nanoTime();
```

> long endTime --> end time
can be calculated using:
```
long endTime = System.nanoTime();
```

> char unit --> unit for time
can be 's' for seconds, 'm' for milliseconds, 'n' for nanoseconds
**default case** also returns time in nano seconds 

## How to Compile?
```
cd ada-lab
javac .\sorting_algos\RandomUtils.java .\sorting_algos\MergeSort.java
java sorting_algos.MergeSort
```