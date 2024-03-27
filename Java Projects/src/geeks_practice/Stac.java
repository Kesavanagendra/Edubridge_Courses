package geeks_practice;
// import java.util.*;
// import java.util.Scanner;
// // import javax.lang.model.element.Element;
// public class Stac {
//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.addAll(Arrays.asList(new Integer[] {1,4,9,2,6,5}));
//         int m = (s.size())/2;
//         Collections.reverse(s);
//         s.remove(m);
//         System.out.println(s);
//     }
// }


//----------------for  queues---------------------
import java.util.*;
import java.util.Queue;
public class Stac {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.addAll(Arrays.asList(new Integer[] {1,4,9,2,6,5}));
        if(!q.isEmpty()){
            //System.out.println(q.poll());
            System.out.println(q.peek());
            System.out.println("list is "+q);
        }
        else{
            System.out.println("-1");
        }
        System.out.println(q.size());
        //System.out.println(q.peek());//display the top element
        //System.out.println(q.poll());//remove the top element
        //System.out.println("list is "+q);
    }
}
