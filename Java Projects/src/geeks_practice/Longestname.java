package geeks_practice;
import java.util.*;
import java.util.Scanner;
public class Longestname {
    public static void main(String[] args) {
        String names[]={"geek","geeks","geeksfor","geeksforgeeks"};
        int count=0;
        int max=0;
        for(int i=0;i<names.length;i++){
           if(max<names[i].length()){
            max=names[i].length();
            count=i;
           }
        }
        System.out.println(names[count]);
            
    
        
    }
}

