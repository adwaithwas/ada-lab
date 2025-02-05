package sorting_algos;

import utils.*;

public class SelectionSort {
   public static void main(String[] args) {
     //creating unsorted array
     int[] array = SortUtils.getRandomArray(10, 100);

     //printing unsorted array
     SortUtils.printArray(array);
    
    long start = System.nanoTime();
    selectionSort(array);
    long end = System.nanoTime();
     
     //printing sorted array
     SortUtils.printArray(array);

    //printing time taken
    SortUtils.tellTime(start, end);
   }

   private static void selectionSort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            int min = i;
            for(int j = i+1; j< array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
   }
}
