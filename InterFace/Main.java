
// coded by Kadir Yaren
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        goAbroad  leavingRules = new goAbroad();
        boolean visa;
        boolean money;

        visa = leavingRules.visaStatus();
        money = leavingRules.money();

        if(visa && money){
            System.out.println("You can pass sir.");
        }
        else{
            System.out.println("You must change your documents for leaving here sir!");
        }

    }
}

class goAbroad implements Abroad{
    public static Scanner scanner = new Scanner(System.in);
    @Override
    public boolean visaStatus() {

        System.out.println("Please Type Visa Status : Y / N");
        String visaStat = scanner.nextLine();
        if(visaStat.equals("Y")){
            return true;
        }
        else{
            return false;
        }

    }

    @Override
    public boolean money() {
        System.out.println("Have you got enough money? Y / N ");
        String moneyStat = scanner.nextLine();
        if(moneyStat.equals("Y")){
            return true;
        }else{
            return false;
        }

    }
}
