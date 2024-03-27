package geeks_practice;
import java.util.*;
import java.util.Scanner;
import java.util.HashMap;
public class Anagram {
    public static void main(String[] args) {
        String s1="kesava";
        String s2="avasek";
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        HashMap<Character,Integer> m = new HashMap<>();
        HashMap<Character,Integer> n = new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            if(m.containsKey(ch1[i])){
                m.put(ch1[i],m.get(ch1[i])+1);
            }
            else{
                m.put(ch1[i],1);
            }
        }
        System.out.println("s1 is"+m);
        for(int i=0;i<s2.length();i++)
        {
            if(n.containsKey(ch2[i])){
                n.put(ch2[i],n.get(ch2[i])+1);
            }
            else{
                n.put(ch2[i],1);
            }
        }
        System.out.println("s2 is"+n);
        if(m.equals(n)){
            if(s1.length()==s2.length()){
                System.out.println("1");
            }
        }
        else{
            System.out.println("0");
        }
    }
}
