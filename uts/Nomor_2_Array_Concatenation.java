package uts;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Nomor_2_Array_Concatenation {
    public static void main (String[] args) {
        int [] Array1 = {1,2,3,4,5 };
        int [] Array2  = {6,7,8,9, 10} ;
        
        int[] i = IntStream.concat(Arrays.stream(Array1), Arrays.stream(Array2)).toArray();
       
        System.out.println(Arrays.toString(i));
    }
}