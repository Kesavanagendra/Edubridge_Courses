package practice_edu;
import java.util.*;
import java.util.Scanner;
public class Shapes {
        public static void main(String args[]){
        // int side,area;
        // Scanner sc = new Scanner(System.in);
        // side = sc.nextInt();
        // area=side*side;
        // System.out.print(area);

        int r,l,w,b,h;
        int side_a = 10;
        int side_b =10;
        int side_c = 10;
        Scanner sc = new Scanner(System.in);
        r=sc.nextInt();
        l=sc.nextInt();
        w=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();
        double Area_of_circle = 3.14*r*r;
        int Area_of_Rectangle = l*w;
        double Area_of_triangle = 0.5*b*h;
        double perimeter_of_circle = 2*3.14*r;
        int perimeter_of_Rectangle = 2*(l+w);
        double perimeter_of_triangle = side_a+side_b+side_c;
        System.out.println("Area_of_circle "+ Area_of_circle);
        System.out.println("Area_of_Rectangle "+Area_of_Rectangle);
        System.out.println("Area_of_triangle "+Area_of_triangle);
        System.out.println("pc "+perimeter_of_circle);
        System.out.println("pr "+perimeter_of_Rectangle);
        System.out.println("pt "+perimeter_of_triangle);

        }
}

