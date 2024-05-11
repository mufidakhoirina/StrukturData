package uts;
import java.util.Scanner;

public class Nomor_5_Matriks_Identitas {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        //Masukkan jumlah baris dan kolom matriks
        System.out.print("Masukkan jumlah baris matriks : ");
        int baris = s.nextInt();
        
        System.out.print("Masukkan jumkah kolom matriks : ");
        int kolom = s.nextInt();
        
        int [ ][ ] matriks = new int  [ baris ] [ kolom ];
        
        System.out.print("Masukkan elemen matriks : ");
        for (int i = 0; i < baris; i++){
            for (int j = 0; j < kolom; j++){
                System.out.print("Baris "+ "Kolom " + (i+1) + " "+ (j +1) + "= ");
                matriks [ i ] [ j ] = s.nextInt();
            }
        }
        //Menampilkan matriks sebelum dicek
        System.out.println("Matriks sebelum dicek :  ");
        for (int i = 0; i < baris; i++){
            for (int j = 0; j < kolom; j++){
                System.out.print(matriks [ i ] [ j ]);
            }
            System.out.println();
        }
        
        //Mengecek apakah matriks tersebut matriks identitas atau bukan
        if (cekIdentitas(matriks)){
            System.out.println("Matriks diatas adalah Matriks Identitas");
        } else {
            System.out.println("Matriks diatas bukan Matriks Identitas");
        }
    }
    public static boolean cekIdentitas (int [ ] [ ] matriks){
        int baris = matriks.length;
        int kolom = matriks [0].length;
        
        // mengecek apakah matriks persegi atau bukan
        if ( baris != kolom ){
            System.out.println("Matriks Bukan Matriks Persegi");
            return false;
            }else if ( baris == kolom){
            System.out.println("Matriks adalah matriks persegi");
            return true;
            }
        //Mengecek diagonal dari matriks
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom;  j++) {
                if (i == j && matriks[i][j] != 1) {
                    return false;
                } else if (i != j && matriks[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
        }
    }