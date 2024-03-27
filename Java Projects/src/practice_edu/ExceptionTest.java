/*
 * Checked Exception-->throws or use try,catch finally blocks. Checked Exceptions are checked  during compilation time. 
 * UnChecked Exception--> we didnt use any keywords. UnChecked Exceptions are checked  during Run time.
 */

package practice_edu;
import java.io.IOException;

class ExceptionTest{
    public static void main(String[] args) {

        int i=10;
		System.out.println("Start");
        int a[] = {1,2,3,4,5};
		try {
          int d=i/0; //-->here Exception is ocurred,so it cannot execute the next statements in try block. it will go for the catch block.If it once exit from the try block,then cannot re-enter back into the try block.
          System.out.println("checking");
          int res = a[10];
		}
        catch(ArithmeticException e) {//-->here it will become the subclass exception.

            System.out.println(e);//---> It gives only exception and reason.
			// e.printStackTrace();  //-->it gives the type of exception,reason for exception and exception at which line.
            // System.out.println(e.getMessage());//--->It gives the reason for exception.

		}
        catch(Exception e){  //-->whenever we dont know that which exception occurs, then we can use like this, because it is a super class for all Exceptions.
                                //--->super class exception comes only after the subclass exception.
            e.printStackTrace();
        }
		System.out.println("End ");

    }
}






























// import java.io.FileReader;
// import java.io.IOException;

// public class FileReadertetest 
// {
//  public static void main(String[] args) 
//  {
//   FileReader f=null;
//   try {
   
//    f=new FileReader("/Users/ansar/eclipse-workspace/ExceptionProject/src/file.txt");
  
//   int i;
//   while ((i=f.read()) != -1) 
//   {
//    System.out.print((char)i);
//   }
//   }
//   catch (IOException e) 
//   {
//    e.printStackTrace();
//   }
//   finally {
//    try {
//    f.close();
//    }
//    catch(IOException e){
//     e.printStackTrace();
//    }
//   }
//  }
 

// }