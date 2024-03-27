package geeks_practice;
import java.util.*;
import java.util.Scanner;
public class Arra {
    public void solve(ArrayList<Integer> a,int q,int p,int r)
    {
        if(q==1){
            a.set(p,r);
           System.out.println(a);
        }
        else if(q==2){
            if(a.contains(p)){
                System.out.println("element found at "+a.indexOf(p));
            }
            else{
                System.out.println(-1);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.addAll(Arrays.asList(new Integer[] {1,4,5,9,3}));
        Arra obj = new Arra();
        Scanner sc =new Scanner(System.in);
        int q = sc.nextInt();
        int p = sc.nextInt();
        int r = sc.nextInt();
        obj.solve(a,q,p,r);
    }
}
