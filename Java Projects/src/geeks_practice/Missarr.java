package geeks_practice;
import java.util.*;
import java.util.Scanner;
public class Missarr {
    public static void main(String[] args) {
        ArrayList<Integer> a =new ArrayList<>();
        a.addAll(Arrays.asList(new Integer[] {1,2,3,5}));
        int sum=1;
        for(int i=0;i<4;i++){
            if(a.contains(sum)){
                sum++;
            }
            else{
                System.out.println(sum);
            }
        }
    }
}
        


