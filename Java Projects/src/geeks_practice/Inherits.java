package geeks_practice;
// import java.util.*;
// import java.util.Scanner;
// class cls1{
//     void add(int p, int q)
//     {
//         System.out.println(p+q);
//     }

// }
// class cls2 extends cls1{
//     void mul(int p, int q)
//     {
//         System.out.println(p*q);
//     }
//     void task(int a, int b)
//     {
//         //System.out.println((a*a)+(b*b));
//         //----------------or-----------------
//         System.out.println(Math.pow(a,2) + Math.pow(b,2));
//     }
// }


// public class Inherits {
//     public static void main(String[] args) {
//         {
//             cls2 s2 = new cls2();
//             s2.add(2,4);
//             s2.mul(2,4);
//             s2.task(2,4);
            
//         }
//     }
// }


//---------other way-------------

import java.util.*;
import java.util.Scanner;
class cls1{
    void show(int p)
    {
        System.out.println(p+" ");
    }
    void print(int q)
    {
        System.out.println(q+" ");
    }

}
class cls2 extends cls1{
    void print(int q)
    {
        System.out.println(" cls2 is "+ q*q);
    }
    
}


public class Inherits {
    public static void main(String[] args) {
        {
            cls2 s2 = new cls2();
            s2.print(4);
        }
    }
}

