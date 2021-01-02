package com.company;
// coded by Kadir Yaren

public class Atm {
    public void paraYatir(Hesap hesap,double yatirilacakMiktar){
        Hesap hesap1 = hesap;
        double hesaptakiPara = hesap1.getBalance();
        double totalBalance = hesaptakiPara + yatirilacakMiktar;
        hesap1.setBalance(totalBalance);
        System.out.println("Guncel Hesap Bakiyesi: " + hesap1.getBalance());
    }
    public void paraCek(Hesap hesap2,double miktar){
        Hesap hesap1= hesap2;
        double hesaptakiPara = hesap1.getBalance();
        double totalBalance;
        if(miktar < hesaptakiPara){
            if(miktar > 1500d){
                System.out.println("Bir gunde max 1500tl cekebilirsiniz!");
            }
            else{
                totalBalance = hesaptakiPara - miktar ;
                hesap1.setBalance(totalBalance);
                System.out.println(hesap1.getBalance());
            }

        }
        else{
            System.out.println("not enough money!");
        }
    }
    public void bakiyeGor(Hesap hesap){
        Hesap hesap1 = hesap;
        System.out.println(hesap1.getBalance());
    }

}
