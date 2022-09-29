
/**
 * Java Basic Home Work #2
 *
 * @author Dzmitry Karetsi
 * @todo выдоно
 * @data выполнино
 
 */
import java.util.Arrays;

public class HomeWork3 {
   public static void main(String[] args) {
      //// 1
      int[] arr = { 22, 24, 34, 565, 434, 42, 84, 23, 8, 9, 7 };/// <=> new int[10-20-30...];?
      printArray(arr);
      // 2
      int[] arrry = { 1, 77, 12, 22, -24, 34 };
      getMax(arrry);
      // 3
      int[] arre = new int[] { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
      invertArray(arre);
      // 4
      int[] array = new int[] { 64, 42, 73, -41, 32, 53, -16, 24, -57, 42, 74, -55, 36 };
      insertionSort(array);
      System.out.println();
      System.out.println(Arrays.toString(array));

   }

   /// #1
   static void printArray(int[] array) {

      System.out.print("[");
      for (int i = 0; i < array.length; i++) {
         System.out.print(array[i]);
         if (i < array.length - 1) {
            System.out.print(", ");
         }
      }
      System.out.println("] ; ");

   }

   /// #2
   static void getMax(int[] arrry) {
      int max = arrry[0];
      for (int i = 1; i < arrry.length; i++) {
         if (max < arrry[i]) {
            max = arrry[i];
         }
      }
      System.out.println("max " + max);
   }

   ///// nomer 3
   static void invertArray(int[] arrre) {

      for (int i = 0; i < arrre.length; i++) {

         if (arrre[i] == 1) {
            arrre[i] = 0;
         } else {
            arrre[i] = 1;

         }
         System.out.print(arrre[i]);

      }

   }

   ///// 4
   public static void insertionSort(int[] array) {
      for (int i = 1; i < array.length; i++) {
         int current = array[i];
         int j = i;
         while (j > 0 && array[j - 1] > current) {
            array[j] = array[j - 1];
            j--;
         }
         array[j] = current;

      }
   }

}
