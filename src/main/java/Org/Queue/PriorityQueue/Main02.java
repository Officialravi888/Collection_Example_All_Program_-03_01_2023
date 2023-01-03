package Org.Queue.PriorityQueue;
import java.util.PriorityQueue;

public class Main02 {
    public static void main(String[] args) {
        PriorityQueue<Integer>list=new PriorityQueue<>();
        list.add(2);
        list.add(5);
        System.out.println(list);
        // Using the remove() method
        boolean result= list.remove(2);
        System.out.println("print"+list);
        // Using the pool method
        int list1=list.poll();
        System.out.println(":"+list1);
    }
}
