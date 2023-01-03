package Org.List.Stack;

import java.util.Stack;

public class Main01 {
    public static void main(String[] args) {
        Stack<String> list = new Stack<>();
        list.add("Tom");
        list.add("jerry");
        System.out.println("Name:"+list);

        //Remove element list
        String element=list.pop();
        System.out.println("Print name:"+list);

    }
}


