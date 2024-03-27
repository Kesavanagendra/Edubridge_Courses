
package practice_edu;
import java.util.*;
class InAmsterdam{
    int c=0;
    public int countAm(String str){
        String s1[] = str.split(" ");
        for(int i=0;i<s1.length;i++){
            if(s1[i].equalsIgnoreCase("am")){
                c++;
            }
        }
        return c;
    }
}

public class SplitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        String str = "I Am in Amsterdam am I?";
        InAmsterdam obj = new InAmsterdam();
        int res = obj.countAm(str);
        
        System.out.println(res);
        
    }
}