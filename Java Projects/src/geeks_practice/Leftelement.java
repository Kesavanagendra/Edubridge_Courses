package geeks_practice;
import java.util.*;
import java.util.Scanner;
public class Leftelement {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        //a.addAll(Arrays.asList(new Integer[] {7,8,3,4,2,9,5}));
        a.addAll(Arrays.asList(new Integer[] {19,18,16,12,14,1,5,6,9}));
        Collections.sort(a);
        System.out.println(a);
        int m =(0+a.size())/2;
        // System.out.println(m);
        if(a.size()%2==0){
            System.out.println(a.get(m-1));
        }
        else
            System.out.println(a.get(m));
        
    }
}
