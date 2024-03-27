package geeks_practice;
import java.util.*;
import java.util.Scanner;
interface in1{
    void display(int k);
}
 class test implements in1{
    public void display(int k) {
        int p=0;
        for(int i=2;i<=k;i++){
            int count=0;
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count == 1){
                p++;
            }
        }
        System.out.println(p);
    }
}
public class Interf {
    public static void main(String[] args) {
        in1 obj = new test();
        obj.display(13);
    }
}




