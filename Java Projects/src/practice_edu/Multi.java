package practice_edu;

import java.util.Scanner;

class Sample{
	String multiply(String s1,String s2){
	int a = Integer.valueOf(s1);
	int b = Integer.valueOf(s2);
	int res = a*b;
    return String.valueOf(res);
	// System.out.println(String.valueOf(res));
	
	}
}

public class Multi{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String s1 = sc.next();
	String s2 = sc.next();
	Sample obj = new Sample();
	String out = obj.multiply(s1,s2);
    System.out.println(out);
	
	}
}
