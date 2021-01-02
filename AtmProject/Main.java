package com.company;
// coded by Kadir Yaren

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.print(" Welcome to XBank\n");
        System.out.print(" Username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.print("\n Password: ");
        int passwd = scanner.nextInt();
        Hesap hesap = new Hesap();
        Atm atm = new Atm();

    while(true){

        if(hesap.getHesapAdi().equals(username)  && hesap.getSifre() == passwd){
            System.out.println("Acces approved");
            System.out.println("1. Draw money\n2.Load money\n3.See Balance\n");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Please type amount: ");
                    double amount = scanner.nextInt();
                    atm.paraCek(hesap,amount);
                    break;
                case 2:
                    System.out.println("Please type how much money do you want to load? : ");
                    double loadAmount = scanner.nextInt();
                    atm.paraYatir(hesap,loadAmount);
                    break;
                case 3:
                    atm.bakiyeGor(hesap);
                    break;
                default:
                    System.out.println("Wrong Choice!");


            }

        }
        else{
            System.out.println("Username or password is wrong!");
        }
    }



    }

}
