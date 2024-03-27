package geeks_practice;
import java.util.*;
import java.util.Scanner;
public class Min_dist_of_2elem {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.addAll(Arrays.asList(new Integer[] {1,2,3,2}));
        int temp=a.size()-1;
            if(a.contains(2)){
                int i=0;
                while(i<a.size()){
                    if(a.get(i)==2){
                        int res= a.indexOf(2);
                        temp = Math.min(temp,res);
                        System.out.print(temp+" ");
                        break;
                    }
                    i++;
                }
            }
            else{
                    System.out.println("-1");
            }
    }
    
}
