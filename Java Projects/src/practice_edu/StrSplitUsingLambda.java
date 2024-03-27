// https://www.javaguides.net/p/java-8-stream-api-tutorial.html


package practice_edu;

import java.util.Arrays;
import java.util.Scanner;

// @FunctionalInterface
// interface StringInterFace{

//     String insertSpace(String s1, String s2);
// }
// public class StrSplitUsingLambda {

// 	public static void main(String[] args) {

//      // StringInterFace obj =(s1,s2)->s1.concat(s2).replaceAll("", " ").trim();
// 		// StringInterFace obj =(s1,s2)->s1.concat(s2).replaceAll("", ",").replaceAll("^,|,$", "");
// 		// System.out.println(obj.insertSpace("Kesava", "Nagendra"));

// 	}

// }

//------------------------------------------------------------



// import java.util.stream.Collectors;

// public class StrSplitUsingLambda {

//     static String insertSpace(String s) {
//         try{
//             if(s!=null){
//                 return s.chars()
//                 .mapToObj(c -> (char) c + " ")
//                 .collect(Collectors.joining())
//                 .trim();
//             }
//         }
//         catch(Exception e){
//             System.out.println("String is null"+e);
//         }
//         return null;
        
//     }
//     public static void main(String[] args) {
//         // String str = "capgemini";
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         String formattedString = insertSpace(str);
//         System.out.println(formattedString);
//     }
// }




//----------------------------------------------------------------------------
//Using Interface

// import java.util.stream.Collectors;

// interface StringInterFace{
//       String insertSpace(String s1);
// }

// public class StrSplitUsingLambda {

//     public static void main(String[] args) {
//         String str = "capgemini";

//         StringInterFace sob = (s1)->{
//             return s1.chars().mapToObj(c->(char) c+" ").collect(Collectors.joining()).trim();
//         };
//         String formattedString =sob. insertSpace(str);
//         System.out.println(formattedString);
//     }
// }




//-----------------------------------------------------------------------------

//---------------Another model for same program----------------------

// -----------UsingInterface

// import java.util.stream.*;
// import java.util.*;

// @FunctionalInterface
// interface StringInterface {
//     Stream<String> insertSpace(String s);
// }

// public class StrSplitUsingLambda {
//     public static void main(String[] args) {

// 		Scanner sc = new Scanner(System.in);
//         String str =sc.next();

//         StringInterface obj = (s) -> {
// 			    // Stream res= Stream.of(s).map(s1 -> s1.replaceAll("", " ")).map(s1->s1.strip());

// 			    //---or----

//              Stream<String> res= Stream.of(s).map(s1 -> s1.replaceAll("", " ")).map(s1->s1.strip());

//              return res;
//         };

// 		Stream<String> res1 = obj.insertSpace(str);//---or Stream res1 = obj.insertSpace(str);
// 		res1.forEach(System.out::println);
         
//     }
// }




//-------------------------------------------------------------------------------

//-----Using Interface with try catch block

// import java.util.stream.*;
// import java.util.*;

// @FunctionalInterface
// interface StringInterface {
//     Stream<String> insertSpace(String s);
// }

// public class StrSplitUsingLambda {
//     public static void main(String[] args) {

// 		Scanner sc = new Scanner(System.in);
//         String str =sc.next();

//         StringInterface obj = (s) -> {

//             try{
//                 if( s!=null){
//                     Stream<String> res= Stream.of(s).map(s1 -> s1.replaceAll("", " ")).map(s1->s1.strip());
//                     return res;
//                 }
//             }
//             catch(Exception e){
//                 System.out.println("String cannot be empty"+e);
//                 // e.printStackTrace();
//             }
//             return null; 
//         };
// 		Stream<String> res1 = obj.insertSpace(str);//---or Stream res1 = obj.insertSpace(str);
// 		res1.forEach(System.out::println);
//     }
// }




//------------------------------------------------------------------------------------------------------

// import java.util.Arrays;
// import java.util.stream.Collectors;
// import java.util.stream.Stream;

// public class StrSplitUsingLambda {
//     public static void main(String[] args) {
//         String input = "capgemini";
//         String output = insertSpacet(input);
//         System.out.println(output);
//     }

//     public static String insertSpacet(String input) {
//         try {
//             return Arrays.stream(input.split(""))//---here we can use Stream.of() also...
//                     .collect(Collectors.joining(" "));
//         } catch (NullPointerException | IllegalArgumentException e) {
//             // Handle exceptions here
//             System.err.println("An exception occurred: " + e.getMessage());
//             return null;
//         }
//     }
// }



import java.util.*;
import java.util.stream.*;

@FunctionalInterface
interface StringInterface {
     String insertSpace(String s);
}

public class StrSplitUsingLambda {
    public static void main(String[] args) {
        String str = "kesava";

        StringInterface obj = (input)->{
            try {
                return Arrays.stream(input.split(""))//---here we can use Stream.of() also...
                        .collect(Collectors.joining(" "));
            }
            catch (NullPointerException | IllegalArgumentException e) {
                // Handle exceptions here
                System.err.println("An exception occurred: " + e.getMessage());
                return null;
            }
        };

        String output = obj.insertSpace(str);
        System.out.println(output);
    }
}



