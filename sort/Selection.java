package sort;

import java.util.Arrays;

/**
 * Write a description of class Quick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Selection
{
  
  /**
   * Returns the sorted array
   */
  public static int[] sort(int[] arr) {
    // Your algorithm goes here!
    int i = 0;
    int j;
    int min;
    int temp;
    int minIndex;
    int N = arr.length;
    for (i = 0; i < N-1; i++) {
        j=i;
        min = arr[j];
        minIndex = j;
        temp = arr[j];
        for (j=i; j < N-1; j++) {
            if (min > arr[j+1]) {
                min = arr[j+1];
                minIndex = j + 1;
            }
        }
        arr[i] = min;
        arr[minIndex] = temp;
    }
    return arr;
  }
  
  public static void main(String[] args) {
    int[] arr = {53,85,93,25,39,27,42,5,24,45,33,51,5,80,4,7,91,
      31,66,71,32,19,79,58,61,82,89,63,7,4,50,10,48,24,75,19,22,
      73,54,51,25,33,20,52,79,97,70,54,63,49};    
    
    // Test the sort
    testSort(sort(arr));
  }
  
  public static void testSort(int[] arr) {
    for (int i=0; i<arr.length-1; i++) {
      if (arr[i] > arr[i+1]) {
        System.out.println("FAIL at index "+i);
        System.out.println(Arrays.toString(arr));
        return;
      }
    }
    System.out.println("SUCCESS!");
  }

}
