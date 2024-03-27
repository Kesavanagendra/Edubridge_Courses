/*
 * -------------------------TreeSet----------------------------------
 * not in insertion order
 * sorted the values
 * not allow duplicate values
 * not allow null values
 */

package practice_edu;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(5);
        s.add(1);
        s.add(20);

        System.out.println(s);
    }
}




/*
 * ------------------------------------LinkedHashSet------------------------------
 * follows insertion order
 * doesn't sort
 * not allow duplicate values
 * allows null values
 */

// package practice_edu;
// import java.util.LinkedHashSet;
// import java.util.Set;

// public class SetDemo {
//     public static void main(String[] args) {
//         Set<Integer> s = new LinkedHashSet<>();
//         s.add(10);
//         s.add(20);
//         s.add(30);
//         s.add(5);
//         s.add(1);
//         s.add(20);
//         s.add(null);
//         s.add(null);

//         System.out.println(s);
//     }
// }




/*
 * -------------------------HashSet---------------------------------------
 * not in inserted order
 * doesn't sort
 * not allow duplicate values
 * allow null values 
 */

// package practice_edu;
// import java.util.LinkedHashSet;
// import java.util.Set;

// public class SetDemo {
//     public static void main(String[] args) {
//         Set<Integer> s = new HashSet<>();
//         s.add(10);
//         s.add(20);
//         s.add(30);
//         s.add(5);
//         s.add(1);
//         s.add(20);
//         s.add(null);
//         s.add(null);

//         System.out.println(s);
//     }
// }
