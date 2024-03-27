package geeks_practice;
import java.util.*;
import java.util.Scanner;
public class Uniq {
    public static void main(String[] args) {
        String s="jaja";
        HashMap<String,Integer> m= new HashMap<>();
        for(int i=0;i<s.length();i++){ 
            for(int j=i+1;j<=s.length();j++){ 
                String s2 = s.substring(i,j);
                //System.out.print(s2 +" ");
                m.put(s2, i);
            }
        }
         System.out.println(m.keySet());
    }   
}



//------------Another way-----------


// import java.util.*;
// import java.util.Scanner;
// public class Uniq {
//     public static void main(String[] args) {
//         String s="jaja";
//         Set<String> res = new HashSet<String>();
//         for(int i=0;i<s.length();i++){ 
//             for(int j=i+1;j<=s.length();j++){ 
//                 res.add(s.substring(i,j));
//             }
//         }
//         System.out.println(res);
//     }   
// }
