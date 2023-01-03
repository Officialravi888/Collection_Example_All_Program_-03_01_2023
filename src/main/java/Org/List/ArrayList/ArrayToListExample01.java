package Org.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayToListExample01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 7, 4, 89, 3, 6);
        // list.add(2);
        List<Integer>List1= new LinkedList<>(list);
        List1.add(6);
        System.out.println(List1);
    }
}
