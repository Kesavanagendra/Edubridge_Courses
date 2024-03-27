package geeks_practice;
import java.util.*;
import java.util.Scanner;
public class Subarr {
    public static void main(String[] args) {
        int a[]={1,2,3,7,5};
        int s=12;int j;
        ArrayList<Integer> arr =new ArrayList<>();
        for(int i=0;i<5;i++){
            int sum=0;
            for(j=i;j<5;j++){
                sum=sum+a[j];
                if(sum==s){
                    arr.add(i+1);
                    arr.add(j+1);
                    break;
                }
            }
        }
        arr.add(-1);
        System.out.println(arr.get(0) +" "+arr.get(1));
    }
}
