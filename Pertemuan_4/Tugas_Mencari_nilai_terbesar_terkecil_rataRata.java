package Array;
import java.util.Scanner;
public class Tugas_Mencari_nilai_terbesar_terkecil_rataRata {
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      
      System.out.println("======Program Menghitung Nilai Max, Min, dan Rata-Rata Array=====");
      int[] array = new int [30];
      int i, max, min, array_;
      double rt;
      
      System.out.print("Input jumlah elemen : ");
      array_= input.nextInt();
      System.out.println("Angka yang diinput :"+ array_+ " angka");
      
//menyimpan angka yang diinput kedalam array
      for (i=0; i<array_; i++){
          array[i] = input.nextInt();
      }
      System.out.println();
//menghitung nilai terbesar 
      max = array[0];
      for (i=0; i<array_; i++){
          if(array[i] > max){
          max = array[i];
          }
      }
        System.out.println("Angka Terbesar adalah "+ max);
//menghitung nilai terkecil
      min = array[0];
      for (i=0; i<array_; i++){
      if(array[i] < min){
      min = array[i];
      }
      }
        System.out.println("Angka Terkecil adalah " + min);
//menghitung nilai rata rata
      rt = 0;
      for (i=0; i<array_; i++){
      rt = rt+array[i];
      }
        System.out.println("Total = "+ rt);
       rt=(rt/array_);
        System.out.println("Nilai rata rata adalah "+ rt);
    }
}