/*
 * For static methods, the method is called based on the reference class.
 * for non-static methods, the method is called based on the object of the class.
 * 
 * Static method can hide the static method. but if static method trys to hide the Non-static method, it shows compile time error.
 * Non-Static method can override the Non-static method. but if Non-static method trys to hide the static method, it shows compile time error.
 * */

//--->Using Static 
package practice_edu;
import java.util.*;
import java.util.Scanner;

class p1{
     static void d1(){
        System.out.println("parent method");
    }
}

class c1 extends p1{
      static void d1(){
        System.out.println("child method");
    }
}
public class InheritanceUsingStatic_Reference{
        public static void main(String args[]){
                c1 co = new c1();
                co.d1();

                p1 po = new p1();
                po.d1();

                p1 pob = new c1();//-->here pob is reference for the class p1 and object for the class c1.
                pob.d1();//-->here we calling the d1() method, and that d1()method is static method. so that d1()method is called based on the reference. so it will print the d1()method of class p1().
                        //-->if we calling method is non-static, then the method is called based on the object of the class.

                
        }
}





//-->without using static i.e; Non-static

// package practice_edu;
// import java.util.*;
// import java.util.Scanner;


// class p1{
//       void d1(){
//         System.out.println("parent method");
//     }
// }

// class c1 extends p1{
//        void d1(){
//         System.out.println("child method");
//     }
// }
// public class InheritanceUsingStatic_Reference{
//         public static void main(String args[]){
//                 c1 co = new c1();
//                 co.d1();

//                 p1 po = new p1();
//                 po.d1();

//                 p1 pob = new c1();//-->here pob is reference for the class p1 and object for the class c1.
//                 pob.d1();//-->here we calling the d1() method, and that d1()method is Non-static method. so that d1()method is called based on the object. so it will print the d1()method of class c1().
//                         //-->if we calling method is static, then the method is called based on the reference of the class.

                
                
//         }
// }

