package practice_edu;

import java.util.Scanner;

public class Largestnum {
    public static void main(String[] args) {
        int x,y,z,a,l;
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        a=sc.nextInt();
        l=(x>y)&&(x>z)&&(x>a)?x:(y>x)&&(y>z)&&(y>a)?y:(z>a)?z:a;
        System.out.println("largest is "+l);
    }
    
}
