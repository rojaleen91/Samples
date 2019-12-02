package Collections;
import java.util.*;
public class arraylistFirEachLoop {
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        //Traversing list through for-each loop
        for(String obj:al)
            System.out.println(obj);
    }
}
