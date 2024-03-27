package geeks_practice;
import java.util.*;
public class Sets {
    public static void main(String[] args) {
        Set<Integer> s = new LinkedHashSet<>();
        //s.addAll((Arrays.asList(new Integer[] {1,5,2,4,3})));
        s.add(1);
        s.add(5);
        s.add(2);
        s.add(4);
        s.add(3);
        // ArrayList<Integer> a = new ArrayList<>(s);
        // Collections.sort(a);
        // System.out.println(a);
        s.remove(5);
        if(s.contains(2)){
            System.out.println("1");
        }
        else{
            System.out.println("-1");
        }
        System.out.println(s.size());
        System.out.println(s);
        //java.util.Iterator<Integer> it = s.iterator();
        // while(it.hasNext()){
        //     System.out.print(it.next() +" ");
        // }
    }
}
