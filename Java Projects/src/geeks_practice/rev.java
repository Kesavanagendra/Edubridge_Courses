package geeks_practice;
import java.util.Arrays;
import java.util.Collections;
public class rev {
    public static void main(String[] args) {
        String s ="Geeks";
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
         }
        
    }
    
}

// another method-------------------


// public class rev {
//     public static void main(String[] args) {
//         String s ="Geeks";
//         char ch[] =s.toCharArray();
//         for(int i=s.length()-1;i>=0;i--){
//              System.out.print(ch[i]);
//         }
//     }
// }

// Another method-------------------------

// public class rev {
//     public static void main(String[] args) {
//         String s ="Geeks";
//         StringBuffer sb =new StringBuffer(" ");
//         char ch[] =s.toCharArray();
        

//         for(int i=s.length()-1;i>=0;i--){
//            sb.append(ch[i]);
            

//         }
//         System.out.print(sb.toString());
//     }
// }