package sorting_algos;

import utils.SortUtils;

public class test {
    public static void main(String[] args) {
        int[] arr = SortUtils.getRandomArray(20, 100);

        SortUtils.printArray(arr); //printing unsorted array

        mergeSort(arr);

        SortUtils.printArray(arr); //printing sorted array
    }

    private static void mergeSort(int[] arr){
        int length = arr.length;
        if (length <= 1) return;

        int middle = arr.length/2;
        int[] larr = new int[middle];
        int[] rarr = new int[length-middle];

        int i = 0; int j=0;
        for(; i<length; i++){
            if(i<middle){
                larr[i] = arr[i];
            } else {
                rarr[j] = arr[i];
                j++;
            }
        }
        mergeSort(larr); mergeSort(rarr);
        merge(larr, rarr, arr);
    }

    private static void merge(int[] larr, int[] rarr, int[] arr){
        int i = 0, l = 0, r = 0;
        int lSize = arr.length/2;
        int rSize = arr.length-lSize;

        while(l < lSize && r < rSize){
            if(larr[l] < rarr[r]){
                arr[i] = larr[l];
                i++; l++;
            } else {
                arr[i] = rarr[r];
                i++; r++;
            }        
        }
        while(l<lSize){
            arr[i] = larr[l];
            i++; l++;
        }   
        while(r<rSize){
            arr[i] = rarr[r];
            i++; r++;
        } 
}
}
