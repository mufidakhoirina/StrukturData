package Percabangan;
import java.util.Scanner;
public class If_Else {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        a = input.nextInt();
        System.out.println("Nilai Anda = " + a);
        if (a>75){
            System.out.println("Selamat Anda Lulus");
        } else{
            System.out.println("Remedi!!");
        }
    }
}
