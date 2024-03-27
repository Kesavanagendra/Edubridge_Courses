package geeks_practice;
import java.util.*;
import java.util.Scanner;
public class Date {
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>();
        days.addAll(Arrays.asList(new String[] {"Sunday" , "Monday", "Tuesday", "Wednesday", "Thursday"," Friday","Saturday"}));
        Calendar c = Calendar.getInstance();
        c.set(2022, 12, 15);
        int p=c.get(Calendar.DAY_OF_WEEK);
        String s2 = days.get(p-1);
        System.out.println(s2);
       
    }
}
