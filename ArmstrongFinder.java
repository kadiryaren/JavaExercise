
import java.util.Scanner;

public class ArmstrongFinder {
    // String sayiString = String.valueOf(sayi);   integer dan stringe gecirir.
    // Integer.parseInt("sayi");     bu ifade int to string yapar.
    // (int)Math.pow(a,b)  a sayisinin b ussu nu hesaplar ve int dondurur.
    // String.lenght()   string ifadenin karakter uzunlugunu dondurur.


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen hesaplanmasini istediginiz sayiyi giriniz:");
        int sayi = scanner.nextInt();

        String sayiString = String.valueOf(sayi);
        int lenght = sayiString.length();

        System.out.println("Girilen Sayi: %d"+ sayi);

        int i;
        int total= 0;

        for(i = 0; i < lenght; i++){
            int deger = Integer.parseInt(String.valueOf(sayiString.charAt(i)));
            total = total + (int)Math.pow(deger,lenght);
            System.out.println("Deger " + deger);
        }

        if(total == sayi){
            System.out.println(sayi + " Sayisi Armstrong sayisidir.");
        }
        else{
            System.out.println(sayi + " sayisi Armstrong degildir.");
        }




    }
}
