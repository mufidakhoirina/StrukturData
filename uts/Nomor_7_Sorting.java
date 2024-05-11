package uts;
import java.util.Arrays;
public class Nomor_7_Sorting {
    
        public static void InsertionSort(String [ ] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
        
        public static void BubbleSort(String [ ] arr ) {
         int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap arr[j] and arr[j+1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
        
        public static void SelectionSort(String [ ] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Swap arr[i] with the smallest element
            String temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
        
        public static void main(String[] args) {
        String [ ] arr = {"riska", " nindy", " ilham " , "vicky ", " bagas ", " manda ", " ali "};
        
      SelectionSort ( arr );
            System.out.println(Arrays.toString(arr));
      BubbleSort ( arr );
            System.out.println(Arrays.toString(arr));
       InsertionSort (arr);
            System.out.println(Arrays.toString(arr));
    }
}
