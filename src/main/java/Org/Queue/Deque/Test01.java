package Org.Queue.Deque;

import java.util.ArrayDeque;

public class Test01
{
    public static void main(String[] args) {
        ArrayDeque<String> list= new ArrayDeque<>();
        list.add("Tom");

        // Using add()
        list.add("Marry");

        // Using addFirst()
        list.addFirst("Jerry");

        // Using addLast()
        list.addLast("Herry");
        System.out.println("ArrayDeque: " + list);
    }
}