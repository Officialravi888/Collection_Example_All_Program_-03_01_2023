package Org.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ListToArrayExample {
    public static void main(String[] args) {
        List<String>furitList=new ArrayList<>();
        furitList.add("Mango");
        furitList.add("banana");
        furitList.add("Apply");
        String[]array=furitList.toArray(new String[furitList.size()]);
        System.out.println("print array:"+Arrays.toString(array));
        System.out.println("printing List:"+furitList);
    }
}