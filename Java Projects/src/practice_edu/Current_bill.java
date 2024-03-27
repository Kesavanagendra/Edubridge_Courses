package practice_edu;
import java.util.Scanner;
public class Current_bill {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    int a;
    a = sc.nextInt();
    if(a<0){
        System.out.println("Invalid units");
        System.exit(0);
        // sc.close();
    }
    if(a>=0 && a<=100){
        int res = a*2;
        System.out.println(res);
    }
    else if(a>=101 && a<=300){
        int res = 100*2 + (a-100)*3;
        System.out.println(res);
    }
    else if(a>300){
        int res = (100*2) + (200*3) + (a-300)*4;
        System.out.println(res);
    }
    else{
        System.out.println(" Invalid units");
    }
    }
    
}

