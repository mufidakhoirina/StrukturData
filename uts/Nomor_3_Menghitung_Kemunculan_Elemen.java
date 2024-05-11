package uts;
import java.util.Scanner;

public class Nomor_3_Menghitung_Kemunculan_Elemen {
    public static void main(String[] args) {

        int a, i;
        // Mengambil input jumlah elemen dari user
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen : ");
        a = s.nextInt(); // Membaca inputan integer

        int c[] = new int[a];
        System.out.print("Masukkan Elemen : ");
        for (i = 0; i < a; i++) {
            c[i] = s.nextInt(); // Menyimpan elemen kedalam array
        }

        // Menghitung kemunculan setiap elemen menggunakan for loop
        int[] hitung= new int[a]; // Array untuk menyimpan jumlah kemunculan setiap elemen
        for (i = 0; i < a; i++) {
            int elemenA = c[i];
            if (hitung[elemenA] == 0) {
                // Jika ini adalah kemunculan pertama elemen, inisialisasi jumlah kemunculan dengan 1
                hitung[elemenA] = 1;
            } else {
                // Jika elemen tersebut telah muncul sebelumnya, tambahkan jumlah kemunculan
                hitung[elemenA]++;
            }
        }

        // Menampilkan hasil kemunculan setiap elemen
        for (i = 0; i < a; i++) {
            int elemenA = c[i];
            if (hitung[elemenA] > 0) {
                System.out.println(elemenA + " muncul sebanyak " + hitung[elemenA] + " kali");
                hitung[elemenA] = 0; // Mengatur kembali jumlah kemunculan menjadi 0 untuk menghindari duplikasi dalam output
            }
        }
    }
}
