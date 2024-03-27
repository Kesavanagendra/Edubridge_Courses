package geeks_practice;
import java.util.*;
import java.util.Scanner;
public class Geeky {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(); 
        arr.addAll(Arrays.asList(new Integer[] {0,1,2}));// sum of numbers is the next number
        int N=5,k=3;
        if(k!=1){
            while(k<N){
                int j=0;
                int sum=0;
                while(j<arr.size()){
                    sum=sum+arr.get(j);
                    j++;
                }
                arr.add(sum);
                k++;
            }
            System.out.println(arr);
        }
        else{
            for(int i=0;i<N-1;i++){
                arr.add(arr.get(0));
            }
            System.out.println(arr);
        }
    }
}