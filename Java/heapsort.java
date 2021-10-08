import java.util.*;
 
public class main {
   public static void buildheap(int []array) {
      for(int i = (array.length - 1) / 2; i >= 0; i--){
           heapify(array , i, array.length - 1);
      }
   }
 
   public static void heapify(int[] array, int i, int size) {
      int left = 2 * i + 1;
      int right = 2 * i + 2;
      int max;
      
      if(left <= size && array[left] > array[i]){
         max = left;
      } else {
         max = i;
      }
 
      if(right <= size && array[right] > array[max]) {
         max = right;
      }
      
      if(max != i) {
         exchange(array, i, max);
         heapify(array, max, size);
      }
   }
 
   public static void exchange(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
   }
 
   public static int[] heapsort(int[] array) {
      buildheap(array);
      
      int heapsize = array.length - 1;
      for(int i = heapsize; i > 0; i--) {
         exchange(array, 0, i);
         heapsize = heapsize - 1;
         heapify(array, 0, heapsize);
      }
      return array;
   }
 
   public static void main(String[] args) {
      int[] array = { 1, -227, 169, -19, 3, 999, 5 };
      System.out.println("Before sorting my array contains: ");
      System.out.println(Arrays.toString(array));
      array = heapsort(array);
      System.out.println("After performing heap sort my array becomes: ");
      System.out.println(Arrays.toString(array));
   }
}
