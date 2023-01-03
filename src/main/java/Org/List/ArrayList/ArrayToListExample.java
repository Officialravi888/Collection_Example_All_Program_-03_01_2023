package Org.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayToListExample {
    public static void main(String[] args) {
        //Creating Arrays
        String[]array={"Tom","jerray","jorn","sem"};
        String[] Array = new String[0];
        System.out.println("printArray:"+ Arrays.toString(Array));
        List<String>list=new ArrayList<>();
        for(String lang:Array){
            list.add(lang);

        }
        System.out.println("print"+array);
    }
}
