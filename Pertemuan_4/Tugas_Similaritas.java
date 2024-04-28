package Array.String;

public class Tugas_Similaritas {
    public static double Similaritas(String s1, String s2){
    String longer = s2; String shorter = s1;
    if (s1.length() < s2.length()){ //longer selalu memiliki panjang yang lebih dari shorter
        longer = s2; shorter = s1;
    }
    
    int longerLength = longer.length();
    if (longerLength == 0){
        return 1.0;
    }
    return (longerLength - editJarak(longer, shorter))/ (double)longerLength;
}

    public static int editJarak(String s1, String s2) {
   s1 = s1.toLowerCase();
   s2 = s2.toLowerCase(); //mengubah string menjadi huruf kecil
   
   int [] jumlah = new int [s2.length() + 1];
   for (int i=0; i<=s1.length(); i++){
       int lastValue = i;
       for (int j=0; j<=s2.length(); j++){
           if (i==0)
               jumlah[j] = j;
           else {
           if (j>0){
           int newValue = jumlah [ j - 1 ];
           if (s1.charAt(i - 1)!= s2.charAt( j - 1))
               newValue = Math.min(Math.min(newValue,lastValue),
                       jumlah[j])+1;
                       jumlah[j-1]=lastValue;
                       lastValue = newValue;
           }
         }
       }
       if (i>0)
           jumlah [s2.length()] = lastValue;
   }
   return jumlah[s2.length()];
   }
    
    public static void printSimilarity (String s, String t){
        System.out.println(String.format(
 "%.3f adalah similaritas dari \"%s\" dan \"%s\"",Similaritas(s, t),s, t)) ;
    }
    public static void main(String[] args) {
        printSimilarity(""," ");
        printSimilarity("ANA","ANa");
    }
    }
