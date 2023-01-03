package Org.List.Vector;

import java.util.Iterator;
import java.util.Vector;

public class Main01 {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        list.add("Tom");
        //Using get()
        String element=list.get(4);
        System.out.println(":"+list);
        //Using iterator
        Iterator<String>iterate= list.iterator();
        System.out.println("Vector:");
        while(iterate.hasNext()){
            System.out.println(iterate.next());
            System.out.println(",");
        }
    }
}
