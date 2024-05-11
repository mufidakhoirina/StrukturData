package uts;
import java.util.Scanner;
import java.util.Arrays;

public class Nomor_1_Reversed_Array {
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
       //memasukkan jumlah elemen array
        System.out.print("Maskkan Jumlah Elemen Array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        //Menyimpan Nilai elemen yang diinput kedalam variabel array
        System.out.print("Masukkan elemen array: ");
                for (int i = 0; i < size; i++) {
                    array[i] = scanner.nextInt();
                    } 
       
        System.out.println("Array sebelum dibalik : " + Arrays.toString(array));
        //memanggil fungsi untuk membalik array
        int[] reversedArray = reverse(array);
        System.out.println("Array sesudah dibalik : " + Arrays.toString(reversedArray));

    }
   static int[] reverse(int[] array){
       int [] newArray = new int [array.length];
       
       for (int i = 0; i<array.length; i++){
       newArray[array.length - 1 - i] = array[i];
       }
       return newArray;
   } 
}
