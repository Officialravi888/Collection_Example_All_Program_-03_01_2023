package Org.List.ArrayList;

import java.util.List;
import java.util.LinkedList;

public class ListToLinkedList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Test");
        System.out.println(list);
        list.add("Tom");
        System.out.println(list);
        list.add(String.valueOf(2));
        System.out.println(list);
    }
}
