//throw is a keyword which is used to define the predefined Exception Statement and as well as user defined Exception Statement, Instead of run the catch block Exception.
// By using if-else , we use the throw keyword.


//-->predefined Exception Statement using throw keyword.
package practice_edu;
import java.io.IOException;
import java.util.Scanner;

public class ThrowExample {
    public static void main(String[] args)throws ArithmeticException {
        int i=10,d;
		System.out.println("Before division");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int j=sc.nextInt();
		try {
			if(j==0) {
				throw new ArithmeticException("divide by error because denominator is zero");//-->throw is a keyword which is used to define the predefined Exception Statement, INstead of the catch block Exception.
			}
			else {
		       d=i/j;
		       System.out.println("result="+d);
			}
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("After Division");
    }
    
}






//-->user defined Exception Statement using throw keyword.

// class MyAgeCheck extends Exception{
// 	public MyAgeCheck(String s) {
// 		super(s);
// 	}
// }
// class AgeCheck{
// 	void checkAgeVote(int age) {
// 		try {
//             if(age>=18) {
//                 System.out.println("You are eligible for voting");
//             }
//             else {
//                 throw new MyAgeCheck("Your is below 18 not eligible to vote");
//             }
// 		}
//         catch(MyAgeCheck e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

// public class ThrowExample {

// 	public static void main(String[] args) {
// 		AgeCheck ob=new AgeCheck();
// 		ob.checkAgeVote(17);

// 	}

// }