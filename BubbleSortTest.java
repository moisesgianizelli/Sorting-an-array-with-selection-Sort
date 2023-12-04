import java.security.SecureRandom;
import java.util.Arrays;

/**
 * Sorting an array with selection Sort
 *
 * @author Moises Munaldi
 * @date Dez/04/2023
 * @version 1.0
 */
public class BubbleSortTest {

 /**
  * Sort elements of array with bubble sort
  * @param data an array of unsorted integers
  */
 private static void bubbleSort(int[] data) {
     for (int i = 0; i < data.length - 1; i++) {
         for (int j = 0; j < data.length - 1 - i; j++) {
             if (data[j] > data[j + 1]) {
                 swap(data, j, j + 1);
             }
         }
     }
 }
  /**
   * Swap values in two elements
   * @param data an array of integers to be sorted
   * @param first the first element in the array to be swapped
   * @param second the second element in the array to be swapped
   */
   private static void swap(int[] data, int first, int second)
   {
       int temp = data[first];
       data[first] = data[second];
       data[second] = temp;
   } 

   public static void main(String[] args) {
      SecureRandom generator = new SecureRandom();

      // create unordered array of 10 random ints
      int[] data = generator.ints(10, 10, 91).toArray(); 

      System.out.printf("Unsorted array: %s%n", Arrays.toString(data));
      bubbleSort(data); // sort array
      System.out.printf("Sorted array: %s%n", Arrays.toString(data));
   }
}
