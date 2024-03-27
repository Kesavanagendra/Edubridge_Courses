package geeks_practice;
import java.util.*;
import java.util.Scanner;
import java.math.*;
public class Switchcase {
    public Double calc(int choice, ArrayList<Integer>arr){
        double x =0.0;
        double y =0.0;
        switch(choice)
        {
            case 1:x=Math.PI*arr.get(0)*arr.get(0);
                   break;
            case 2:y=arr.get(0)*arr.get(1);
                   break;
        }
        if(choice == 1)
        {
            return x;
        }
        else{
            return y;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(10);
        Scanner sc =new Scanner(System.in);
        Switchcase obj =new Switchcase();
        int choice = sc.nextInt();
        Double res= obj.calc(choice, arr);
        System.out.println(res);
    }
}
