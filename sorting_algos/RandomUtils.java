package sorting_algos;

import java.util.Random;
import java.util.Arrays;

public class RandomUtils {
    public static int[] getRandomArray(int n, int bound){
        int[] arr = new int[n];
        Random rand = new Random();

        for(int i=0; i<n; i++){
            arr[i] = rand.nextInt(bound);
        }

        return arr;
    }

    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
