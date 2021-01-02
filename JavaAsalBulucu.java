// coded  by Kadir Yaren

import java.util.Scanner;

public class JavaAsalBulucu
    // ekrana girilen degere kadar  olan asal sayilari ekrana bastiran java kodu.


    public static void main(String[] args) {
        
        System.out.println("Hangi degere kadar asal sayi hesaplanacak ? : ");
        Scanner scanner = new Scanner(System.in);
        int girdiSayi = scanner.nextInt();
        scanner.nextLine();
        for(int i = 1; i <= girdiSayi; i++){
            int sayac = 0;

            for(int k = 1; k <=i; k++){
                float sonuc = i % k;
                if(sonuc == 0f){
                    sayac++;
                }

            }
            if(sayac == 2){
                if(i != 1){
                    System.out.println(i + " sayisi asaldir.");
                }

            }
        }
    }
}
