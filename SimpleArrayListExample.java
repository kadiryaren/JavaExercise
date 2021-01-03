// coded by Kadir Yaren

// ArrayList<String> variableName = new ArrayList<String>();   define
// variableName.add(element); ==> add element in arraylist
// variableName.get(index)    ==> get index of array for print or other things
// variableName.set(index,element);    ==> that changes element in index
// variableName.remove(index or element);   ==> if you put index or element, this function remove it.
// variableName.indexOf(element);   ==> where is the my  element? index based.

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        String[] a = {"kadir","is","a","great","developer!"};

        for(String f : a){
            System.out.println(f);
            // f var always travelling in a array and return each index of a array!
        }
        ArrayList<String> var = new ArrayList<String>();
        var.add("kadir");
        var.add("is");
        var.add("a");
        var.add("great");
        var.add("developer");


        // if i want to change 5th index of arraylist, what will happen ?

        // var.set(5,"abcd");  we cant do that
        // index out of bounds exceotion :))
        for(int i =0; i < var.size(); i++){
            System.out.println(var.get(i));

        }



    }
}
