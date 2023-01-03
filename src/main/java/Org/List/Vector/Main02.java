package Org.List.Vector;

import java.util.Vector;

public class Main02 {
    public static void main(String[] args) {
        Vector<String>list=new Vector<>();
        list.add("Tom");
        list.add("marry");
        System.out.println("Name:"+list);
        //Using Remove
        String element=list.remove(2);
        System.out.println("Name:"+element);
        System.out.println("New Name:"+list);
        // Using clear()
        list.clear();
        System.out.println("Vector after clear(): " + list);
    }
}

