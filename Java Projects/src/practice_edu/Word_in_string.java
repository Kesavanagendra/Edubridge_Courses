// Problem Statement
// In this problem you will be given a string S , consisting of lowercase alphabets (a-z), in which each
// character is unique. Another string INF is formed by repeating the string S infinitely many times.
// Example: If S = “abcde” then the string INF is …abcdeabcdeabcde… Here the dots (’.’) indicate
// that there are infinitely many characters before and after the string.
// Now you will be given another string A and asked to find whether there is any sub-string in INF
// which is identical to A.
// Input Format
// • The first line contains the number of test-cases T.
// • The next T lines will contain a space-separated string, made up of two parameters:
// • The first parameter will be infStr, representing S from the above example
// • The second parameter will be toFind, representing A from the above example.
// Output Format
// • The function should print YES if A can be found in S, otherwise it should print NO.
// e.g., If the second line of input contains:

// Explanation
// • The infinite string of 'ghijk' contains 'ghijkghi' as it's sub-string, hence you print YES




package practice_edu;
import java.util.*;
import java.util.Scanner;
public class Word_in_string {

	public int infStr(String s,String s1){
			try{

				boolean val = s.contains(s1);
				if(val){
					return 1;
				}
			return -1;
			}
			catch(Exception e){
				System.out.println("null pointer exception");
			}
			return 0;

	}
	public static void main(String[] args) {
		String s = "abcdeabcdeabcde";
		String s1 = "abc";
		Word_in_string obj = new Word_in_string();
		int res = obj.infStr(s,s1);
		// System.out.println(val);//---we can use this for printing of true or false
		if(res==1){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
}



//-----Another method

// public class Word_in_string{
// 	public static void main(String[] args) {
// 		String s = "abcdeabcdeabcde";
// 		String s1 = "abc";
// 		int i=s.indexOf(s1);
// 		if(s1.equals(s.substring(i,s1.length()))){
// 			System.out.println("yes");
// 		}
// 		else{

// 			System.out.println("no");
// 		}
// 	}
// }



//----Another method 

// public class Word_in_string {

// 	public static void main(String[] args) {
// 		String s = "abcdeabcdeabcde";
// 		String s1 = "abc";
// 		int i=s.indexOf(s1);
// 		if(i>=0){

// 			System.out.println(s.substring(i,s1.length()));
// 		}
// 		else
// 			System.out.println("not found");

// 	}
// }


   



 

    

  
