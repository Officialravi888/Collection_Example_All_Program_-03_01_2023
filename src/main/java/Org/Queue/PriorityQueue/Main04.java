package Org.Queue.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main04 {
    public static void main(String[] args) {
        // Creating a priority queue
        PriorityQueue<String>list=new PriorityQueue<>(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });
        list.add("Tom");
        list.add("sem");
        System.out.println("print:"+list);
    }
}

class CustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer number1, Integer number2) {
        int value =  number1.compareTo(number2);
        // elements are sorted in reverse order
        if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }


}
