package practice_edu;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InpStudentData {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int age;
		String name;
		float fees;
		char gen;
		
//		InputStreamReader is=new InputStreamReader(System.in);
//		BufferedReader br=new BufferedReader(is);
//----------------or--------------------
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//readLine()->String
		//read()->ascii value
		
	    System.out.println("Enter age");
		age=Integer.parseInt(br.readLine());
		System.out.println("Enter the name");
		name=br.readLine();
		
		System.out.println("Enter fees");
         fees = Float.parseFloat(br.readLine());
         
         System.out.println("Enter gender");
         gen=(char)br.read();
         
         
         System.out.println("Student Details");
         System.out.println("Name = "+name);
         System.out.println("Age = "+age);
         System.out.println("Fees ="+fees);
         System.out.println("Gender = "+gen);
	}

}
    