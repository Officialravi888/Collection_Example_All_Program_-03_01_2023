package Org.Queue.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main{
    public static void main(String[] args) {
        Deque<String>list=new ArrayDeque();
        list.offer("Herray");
        list.offerLast("Marray");
        list.add("Jhon");
        list.offerFirst("pop");
        list.addLast("Sem");
        list.offerFirst("Som");
        System.out.println("NamePrint:"+list);
        // Access elements of the Deque
        String firstElement = list.peekFirst();
        System.out.println("First Element: " + firstElement);
        String offerLastElement= list.removeLast();
        System.out.println("Name:"+offerLastElement);

        // Remove elements from the Deque
        String removedNumber1 = list.pollFirst();
        System.out.println("Removed First Element: " + removedNumber1);
    }
}
