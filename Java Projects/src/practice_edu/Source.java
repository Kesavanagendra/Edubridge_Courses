package practice_edu;

import java.util.Scanner;
import java.util.stream.Stream;

interface Auth{

    Boolean validate1(String username, String password);
}

public class Source {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         Auth obj =(username,password)->{
            try{
                if(username!=null && password!=null){
                    boolean res =  Stream.of(username,password).allMatch(y-> y.equals("ABC") || y.equals("DEF"));
                    return res;
                    //----(or)-----
                    // return Stream.of(username,password).allMatch(value -> value.equals("ABC") || value.equals("DEF"));
                };
            }
            catch(Exception e){
                e.printStackTrace();
            }
            return null;
        };
            
         String username = sc.next();
         String password=sc.next();

         Boolean res1 = obj.validate1(username, password); // (or) System.out.println(obj.validate1(username, password));
         System.out.println(res1);

    }
}







// import java.util.stream.Stream;

// public class Source {

//     public static boolean validate(String username, String password) {
//         // String validUsername = "ABC";
//         // String validPassword = "DEF";

//         // Use Stream API to check if the provided username and password match the valid ones
//         // return Stream.of(username, password)
//         //         .anyMatch(value -> value.equals(validUsername) || value.equals(validPassword));
        
//         return Stream.of(username, password)
//                 .allMatch(value -> value.equals("ABC") || value.equals("DEF"));
//     }

//     public static void main(String[] args) {
//         // Test cases
//         System.out.println(validate("ABC", "DEF"));  // true (Both username and password are valid)
//         System.out.println(validate("ABC", "GHI"));  // true (Only username is valid)
//         System.out.println(validate("XYZ", "DEF"));  // true (Only password is valid)
//         System.out.println(validate("XYZ", "GHI"));  // false (Both username and password are invalid)
//     }
// }
