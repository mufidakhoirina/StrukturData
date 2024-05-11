package uts;
import java.util.Scanner;
public class Nomor_4_Menghapus_Elemen_Double {
    public static int hapusDuplikat (int a [ ], int b ) {
        if (b ==0 || b ==1){
            return b;
        }
        
        //membuat array untuk menyimpan elemen double
        int [ ] temp = new int [b];
        int j =0;
        
        for (int i = 0; i < b - 1; i++ ){
            if (a[i] != a [i + 1]){
                temp[j++] = a[i];
            }
        }
        
        //mengubah array asli
        for (int i = 0; i < j; i++){
            a[i] = temp[i];
        }
        return j;
    }
        public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
                        int a, g;
            System.out.println("Masukkan Jumlah Elemen : ");
            a = s.nextInt();
            int k [ ] = new int [a];
            System.out.print("Masukkan Elemen : ");
             for ( g = 0; g < a;  g++){
                 k[g]= s.nextInt();
             }
               int b = k.length;
               b = hapusDuplikat(k,b);
               
               // Mencetak array
               System.out.println("Array setelah dihapus: ");
               for (int i = 0; i < b;  i++){
                   System.out.print( k [i] +" ");
               }              
    }
}
