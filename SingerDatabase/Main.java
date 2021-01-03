// coded by Kadir Yaren

import java.util.ArrayList;
import java.util.Scanner;

// simple arraylist usage app
public class Main{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Singer singer = new Singer();
        System.out.println("\nWelcome to Singer Database!");


        boolean loop = true;

        while(loop){

            System.out.print("Please type your process: \n");
            System.out.println("\t1. Show Singers");
            System.out.println("\t2. Add Singer Name");
            System.out.println("\t3. Update Singer Name");
            System.out.println("\t4. Delete Singer Name");
            System.out.println("\t5. Search Singer Name");
            System.out.println("\t6. Quit the app");
            System.out.print(">> ");
            int process = scanner.nextInt();
            System.out.println("\t-------------------------");
            scanner.nextLine();
            switch (process){
                case 1:
                    singer.showSingers();
                    break;
                case 2:
                    System.out.print("Add singer :\n>> ");
                    String singerName = scanner.nextLine();
                    singer.addSinger(singerName);
                    break;
                case 3:
                    System.out.print("Delete singer :\n>> ");
                    String deleteSingerName = scanner.nextLine();
                    System.out.print("\nAdd singer :\n>> ");
                    String addSingerName = scanner.nextLine();
                    singer.updateSinger(deleteSingerName,addSingerName);
                    break;
                case 4:
                    System.out.print("Delete singer :\n>> ");
                    String singerName2 = scanner.nextLine();
                    singer.removeSinger(singerName2);
                    break;
                case 5:
                    System.out.print("Search singer :\n>> ");
                    String singerName3 = scanner.nextLine();
                    singer.findSinger(singerName3);
                    break;
                case 6:
                    loop = false;
                    break;
            }

        }



    }
}
class Singer{
    private static ArrayList<String> singerList = new ArrayList<String>();
    public void showSingers(){
        System.out.println("\t All Singers ");
        for(int i = 0; i<singerList.size(); i++){
            System.out.println(singerList.get(i));
        }
    }
    public void addSinger(String singerName){
        singerList.add(singerName);
    }
    public  void updateSinger(String singerName,String otherSingerName){
        singerList.set(singerList.indexOf(singerName),otherSingerName);
    }
    public void removeSinger(String singerName){
        singerList.remove(singerName);
    }
    public void findSinger(String singerName){
        System.out.println("Singer : "+singerList.get(singerList.indexOf(singerName))  + "\nIndex : " + singerList.indexOf(singerName));
    }

}
