package practice_edu;

import java.math.BigInteger;
import java.util.Scanner;

class Result{

    public static String multiplyString(String a, String b) {
        BigInteger A,B;
        A = new BigInteger(a);
        B = new BigInteger(b);

        BigInteger C = A.multiply(B);


        return C.toString();
    }
    
}

public class Mainstr {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(Result.multiplyString(a,b));
        sc.close();
    }
}
