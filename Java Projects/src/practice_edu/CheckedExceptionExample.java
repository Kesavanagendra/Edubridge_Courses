/*
 * Checked Exception-->throws or use try,catch finally blocks. Checked Exceptions are checked  during compilation time. 
 * UnChecked Exception--> we didnt use any keywords. UnChecked Exceptions are checked  during Run time.
 */


 //-->Checked EXception
 
package practice_edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptionExample {
    public static void main(String[] args) {
         //ALL IOExceptions are checked Exceptions

		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);

        System.out.println("Enter name");
		String name="";
		try {
			name = br.readLine();
		} 
        catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("name="+name);
    }
}


//--->Another example for Checked Exception

// package practice_edu;
// import java.io.IOException;

// class CheckedExceptionExample{
//     public static void main(String[] args) {

//         int i=10;
// 		System.out.println("Start");
//         int a[] = {1,2,3,4,5};
// 		try {
//           int d=i/0; //-->here Exception is ocurred,so it cannot execute the next statements in try block. it will go for the catch block.If it once exit from the try block,then cannot re-enter back into the try block.
//           System.out.println("checking");
//           int res = a[10];
// 		}
//         catch(ArithmeticException e) {//-->here it will become the subclass exception.

//             // System.out.println(e);//---> It gives only exception and reason.
// 			e.printStackTrace();  //-->it gives the type of exception,reason for exception and exception at which line.
//             // System.out.println(e.getMessage());//--->It gives the reason for exception.

// 		}
//         catch(Exception e){  //-->whenever we dont know that which exception occurs, then we can use like this, because it is a super class for all Exceptions.
//                                 //--->super class exception comes only after the subclass exception.
//             e.printStackTrace();
//         }
// 		System.out.println("End ");

//     }
// }