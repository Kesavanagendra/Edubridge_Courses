package geeks_practice;
import java.util.*;
import java.util.Scanner;
public class Revarrgrp{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.addAll(Arrays.asList(new Integer[] {1,2,3,4,5}));
        int k=3;
        int n=a.size();
        for(int i=0;i<n;i=i+k){
            int start = i;
            int end = Math.min(i+k-1,n-1);
            while(start<end){
                Collections.swap(a, start, end);
                start++;
                end--;
            }
        }
        System.out.println(a);
    }
}
