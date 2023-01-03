package Org.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("jerry");
        list.add("tom");
        //Iterating the List element using for-each loop
        for(String name:list);
        System.out.println(list);
    }
}