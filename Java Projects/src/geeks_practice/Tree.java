package geeks_practice;
import java.util.*;
public class Tree {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> t = new TreeMap<>();
        t.put(01,11);
        t.put(02,12);
        t.put(03,13);
        if(t.containsValue(12)){
            System.out.println(t.get(02));
        }
        System.out.println(t.size());
        t.remove(3);
        System.out.println(t.keySet());// ascending order for keys
        System.out.println(t.descendingKeySet());
       
       
        
    }
}
