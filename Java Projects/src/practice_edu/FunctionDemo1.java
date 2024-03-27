/*Functions :
-Functions are similar to predicates, 
     here functions return an object as a result.

-Function returns only one value.
-In Java 8.0 there is an interface by the name Function<T,R>  available in the java.util.function package.
-Since this function is a functional interface , it can refer to  lambda expression.
-This functional interface contains a method , apply(), which takes one argument and returns an object as result.
-T represents the type of input and R represents the type  of the result of the function.
 */



package practice_edu;

import java.util.function.*;
class FunctionDemo1{
     public static void main(String args[]){
            //create a function reference to lambda expression
           //to find the length of a string



          /*  here function takes String as an input argument and Integer as an output arg of type object both.
The function interface contains a method apply(), the applies  this function to the argument as:
len.apply(str). */

           Function<String,Integer>len=(str)->str.length();

           String str="Edubridge  Education";
           System.out.println("Length="+len.apply(str));
     }
}