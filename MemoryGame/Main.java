// coded by Kadir Yaren

// welcome to memory game!

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Main{
    //define Cards array
    public  static  Cards[][] cards = new Cards[4][4];


    public static void main(String[] args) {



    // define all characters for game
    cards[0][0] = new Cards('A');
    cards[0][1] = new Cards('B');
    cards[0][2] = new Cards('C');
    cards[0][3] = new Cards('D');
    cards[1][0] = new Cards('E');
    cards[1][1] = new Cards('F');
    cards[1][2] = new Cards('G');
    cards[1][3] = new Cards('H');
    cards[2][0] = new Cards('A');
    cards[2][1] = new Cards('B');
    cards[2][2] = new Cards('C');
    cards[2][3] = new Cards('D');
    cards[3][0] = new Cards('E');
    cards[3][1] = new Cards('F');
    cards[3][2] = new Cards('G');
    cards[3][3] = new Cards('H');

    while(!oyunBittiMi()){
        showCards();
        tahminEt();
        System.out.println("Congratulations!");
    }


    }
    public static void showCards(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(cards[i][j].getTahmin()){
                    System.out.print("|"+cards[i][j].getValue() + "|");
                }
                else{
                    System.out.print("| |");
                }

            }
            System.out.println("");
        }
    }

    public static boolean oyunBittiMi(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(!cards[i][j].getTahmin()){
                    return false;
                }

            }

        }
        return true;

    }

    public static void tahminEt(){
        System.out.print("Deger 1 icin x,y degerlerini giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        cards[x][y].setTahmin(true);
        showCards();

        System.out.print("Deger 2 icin x,y degerlerini giriniz: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        cards[x1][y1].setTahmin(true);
        showCards();

        // wait 1 sec
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        if(cards[x][y].getValue() == cards[x1][y1].getValue() ){
            System.out.println("Correct!");
        }
        else{
            cards[x][y].setTahmin(false);
            cards[x1][y1].setTahmin(false);
            System.out.println("Wrong!");

        }



    }
}
