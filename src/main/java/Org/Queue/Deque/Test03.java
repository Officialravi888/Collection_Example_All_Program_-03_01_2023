package Org.Queue.Deque;

import java.util.ArrayDeque;

public class Test03 {
    public static void main(String[] args) {
        ArrayDeque<String>list=new ArrayDeque<>();
        list.add("tom");
        //using offer
        list.offer("marry");
        System.out.println(":"+list);
    }
}