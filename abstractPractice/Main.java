// coded by Kadir Yaren
import java.util.Scanner;

public class Main extends AClass { // abstract classes always called with extends keyword :) not implements
    @Override
    public boolean abstractCalled() {
        return false;
    }

    public static void main(String[] args) {
        AClass demo = new AClass() {
            @Override
            public boolean abstractCalled() {
                System.out.println("AbstractCalled called ");
                return false;
            }
        };
        demo.abstractCalled();
        demo.makeSomething();
    }
}

