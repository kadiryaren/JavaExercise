package com.company;
// coded by Kadir Yaren

public class Hesap {
    private String hesapAdi ;
    private int sifre ;
    private double balance ;

    public Hesap(){
        hesapAdi = "Kadir";
        sifre = 12345;
        balance = 1000;
    }
    public Hesap(String hesapAdi,int sifre,double balance){
        this.hesapAdi = hesapAdi;
        this.sifre =  sifre;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getHesapAdi() {
        return hesapAdi;
    }

    public int getSifre() {
        return sifre;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
