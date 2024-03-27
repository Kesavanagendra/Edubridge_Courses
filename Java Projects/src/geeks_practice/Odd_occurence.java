package geeks_practice;
import java.util.*;
public class Odd_occurence {
    public static void main(String[] args) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int[] a={1,2,3,1,3,2,3};
        for(int i=0;i<a.length;i++){
            if(h.containsKey(a[i])){
                h.put(a[i],h.get(a[i])+1);
            }
            else    
                h.put(a[i],1);
        }
       System.out.println(h);
       System.out.println(h.values());
       for(int i=0;i<h.size();i++){
           if((h.get(a[i]))%2 != 0){
            System.out.print(h.get(a[i]));
           }
       }
    }
}
