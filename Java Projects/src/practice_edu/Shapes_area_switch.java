package practice_edu;

import java.util.Scanner;


public class Shapes_area_switch {
  public static void main(String[] args) {
    int ch,side;
              Scanner sc = new Scanner(System.in);
              System.out.println("1.area of square");
              System.out.println("2.area of rectangle");
              System.out.println("3.area of Triangle");
              System.out.println("4.area of circle");
              System.out.println("enter your choice");
              ch = sc.nextInt();
              switch(ch){
                case 1:
                System.out.println("enter side of square");
                side = sc.nextInt();
                int res = side*side;
                System.out.println("Area_of_square "+ res);
                break;
                case 2:
                System.out.println("enter length and width of rectangle");
                int l=sc.nextInt();
                int w=sc.nextInt();
                 res = l*w;
                System.out.println("Area_of_rectangle "+ res);
                break;
                case 3:
                System.out.println("enter base and height of triangle");
               int  b=sc.nextInt();
                int h=sc.nextInt();
                double result = 0.5*b*h;
                System.out.println("Area_of_Triangle "+ result);
                break;
                case 4:
                System.out.println("enter radius of circle");
               int  r=sc.nextInt();
               double res_circle = 2*3.14*r;
                System.out.println("Area_of_circle "+ res_circle);
                break;
                default:
                System.out.println("invalid");

              }
  }
}  
