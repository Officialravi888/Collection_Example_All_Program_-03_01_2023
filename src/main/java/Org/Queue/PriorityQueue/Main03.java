package Org.Queue.PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;
public class Main03 {
    public static void main(String[] args) {
        PriorityQueue<String> list = new PriorityQueue<>();
        list.add("harry");
        list.add("jhon");
        System.out.println("Name Print:"+list);
        //Using the itrator method
//        Iterator<String> iterate = list.iterator();

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println(",");
        }
    }
}
