package Org.Queue.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test02 {
    public static void main(String[] args) {
        Deque<String>list=new ArrayDeque<>();
        list.add("Jhon");
        list.add("Sem");
        list.add("Tom");
        System.out.println("List:"+list);
        //Get the first element
        String firstElement= list.getFirst();
        System.out.println("Name:"+firstElement);

    }
}
