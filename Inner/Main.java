// coded by Kadir Yaren
// i know its so confusing code but it created at 02.36 am
// and I have no time to practice more :)

public  class Main{
    class demo{
        public boolean isTrue;
        public demo(boolean isTrue){
            this.isTrue = isTrue;
        }
    }
    class demo2{
        private boolean isFalse;
        public demo2(boolean isFalse){
            this.isFalse = isFalse;
        }
        demo demo1 = new demo(true);


    }


    public static void main(String[] args) {
        // we defined unstatic innerclass like that. If it would be static, we would call like this:
        // Mathematic.demo1  demo = new Mathematic.demo1("2021");
        // lets do it
        Mathematic.demo1  demo = new Mathematic().new demo1("2021");
        Mathematic.demo2 demo_2 = new Mathematic.demo2("something");
        // if we have getter method in demo2 class for something variable, we can acces the variable.


        // Local Inner Classes Here!
        class Local{
            public int five;
            public Local(int five){
                this.five =five;
            }
        }
        // we can define classes in any method but we can use it only in the method which class defined.
        Local lokal = new Local(5);



        // Now time to explain anonim inner classes
        // if we have a abstract class or interface you know - we can not create an object with them.
        // but in this method  we can do it.
        // dont forget! we must define empty methods there

        Abs free = new Abs() {
            @Override
            public String shortDemo() {
                return "HAHA";
            }
        };
    }
}

abstract  class Abs{
    public abstract String shortDemo();
    public void doNothing(){
        System.out.println("Do nothing!");
    }
}
