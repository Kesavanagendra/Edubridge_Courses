package practice_edu;
import java.lang.Math;
public class Armstrong {
    public static void main(String[] args) {
           int n =153,sum=0;
         int temp=n;boolean b;
         while(n!=0){
           int rev = n%10;
            sum= sum+rev*rev*rev;
            n=n/10;
         }
         System.out.println(sum);
         b=(sum==temp);
         System.out.println(b);
    }
    
}
