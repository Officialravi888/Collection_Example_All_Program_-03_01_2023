package Org.List.LinkedList;

import java.util.LinkedList;

public class Main02 {
    public static void main(String[] args) {
        LinkedList<String>list=new LinkedList<>();
        list.add("Tom");
        list.add("jerry");
        System.out.println("LinkedList: " + list);
        String str = list.get(1);
        System.out.println("Element at index 1:" + str);
    }

}
