package Org.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("ravi");
        list.add("raj");
        list.add("Tom");
        list.add("Sem");
        System.out.println("Running:"+list.get(3));
        list.set(1,"Date");
        for(String name:list)
            System.out.println(list);


        list.add("hat");
        System.out.println(list);
    }
}
