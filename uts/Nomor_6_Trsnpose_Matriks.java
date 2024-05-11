package uts;
import java.util.Scanner;

public class Nomor_6_Trsnpose_Matriks {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    //Input dimensi matriks
        System.out.println("Masukkan Dimensi  Matriks ");
        System.out.print("Masukkan Baris  : ");
        int baris = input.nextInt();
        System.out.print("Masukkan Kolom: ");
        int kolom = input.nextInt();
        
        int [ ][ ]Matriks = new int [ baris ] [ kolom ];
        
        //Memasukkan elemen matriks
        for (int i = 0; i < baris; i++){
            for ( int j = 0; j < kolom; j++){
                System.out.print( "Baris " + "Kolom "  + (i+1) +" "+ (j+1) + " = " ) ;
                Matriks [i] [j] = input.nextInt();
            }
        }
        
        //Transpose Matriks
        int [ ] [ ] MatriksT = new int [kolom] [ baris ];
        for (int i = 0; i < kolom; i++){
            for (int j = 0; j < baris; j++){
                MatriksT [i][j] = Matriks [j] [i];
            }
        }
        
        //Menampilkan kedua matriks
        System.out.println("Matriks sebelum ditranspose : ");
        for (int i = 0; i < baris; i++ ){
            for (int j =0; j < kolom; j++){
                System.out.print(Matriks [i] [j] + " " );
            }
            System.out.println( );
        }
        
        System.out.println("Matriks sesudah ditranpose : ");
        for (int i = 0; i < kolom; i++){
            for (int j = 0; j < baris; j++){
                System.out.print(MatriksT [i] [j] + " ");
            }
            System.out.println( );
        }
        input.close();
   }
}
