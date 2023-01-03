package Org.List.Stack;

import java.util.Stack;

public class Main03 {
    public static void main(String[] args) {
        Stack<String>list=new Stack<>();
        list.add("harry");
        System.out.println("Name:"+list);

        // Search an element
        int position = list.search("Horse");
        System.out.println("Position of Horse: " + position);
    }
}