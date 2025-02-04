package sorting_algos;
import utils.*;;

public class test{
    public static void main(String[] args) {
        int[] arr = SortUtils.getRandomArray(10, 50);
        
        SortUtils.printArray(arr);  //un-sorted array

        long start = System.nanoTime();
        mergeSort(arr);
        long end= System.nanoTime();
        
        SortUtils.printArray(arr);  //sorted array

        SortUtils.tellTime(start, end, 'm');
    }

    private static void mergeSort(int[] arr){
        int length = arr.length;

        if(length<=1){
            return;
        }

        int middle = length/2;
        int[] larr = new int[middle];
        int[] rarr = new int[length-middle];

        int i =0, j =0;
        for(; i<length; i++){
            if(i<middle){
                larr[i] = arr[i];
            } else {
                rarr[j] = arr[i];
                j++;
            }
        }
        mergeSort(larr); mergeSort(rarr);
        merge(arr, larr, rarr);
    }

    private static void merge(int[] arr, int[] larr, int[] rarr){
            int size = arr.length;
            int lsize = size/2;
            int rsize = size - lsize;

            int i=0, j=0, k=0;

            while(j<lsize && k<rsize){
                if(larr[j] < rarr[k]){
                    arr[i] = larr[j];
                    j++; i++;
                } else {
                    arr[i] = rarr[k];
                    k++; i++;
                }
            }
            while(j<lsize){
                arr[i] = larr[j];
                j++; i++;
            }
            while(k<rsize){
                arr[i] = rarr[k];
                k++; i++;
            }
    }
}
