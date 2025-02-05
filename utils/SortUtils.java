package utils;

import java.util.Random;
import java.util.Arrays;

public class SortUtils {
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

    public static void tellTime(long startTime, long endTime, char unit){
        long timeTaken = endTime - startTime;
        unit = Character.toLowerCase(unit);
        
        switch(unit){
            case 'n':
                System.out.println("Time Taken: " + timeTaken + " nano seconds");
                break;
            
            case 'm':
                System.out.println("Time Taken: " + timeTaken/ 1_000_000.0 + " milli seconds");
                break;

            case 's':
                System.out.println("Time Taken: " + timeTaken/1_000_000_000.0 + " seconds");
                break;
            default:
                System.out.println("Time Taken: " + timeTaken + " nano seconds");
        }
    }

    public static void tellTime(long startTime, long endTime){
        tellTime(startTime, endTime, ' ');
    }
}
