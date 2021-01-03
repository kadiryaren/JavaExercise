
public class Cards {
    private char value;
    private boolean tahmin = false;
     public Cards(char value){
         this.value = value;
     }
     public char getValue(){
         return this.value;
     }
     public boolean getTahmin(){
         return this.tahmin;
     }
     public void setTahmin(boolean tahmin){
         this.tahmin = tahmin;
     }
}
