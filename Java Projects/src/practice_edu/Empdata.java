package practice_edu;
import java.util.Scanner;
public class Empdata {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		   int age;
		    float salary;
		    double grossSalary;
		    char gen;

		    System.out.println("Enter age");
			   age = sc.nextInt();

			   //name = sc.next();  // it takes the single word
			 sc.nextLine();
		   System.out.println("Enter your name");
		  
		   name=sc.nextLine(); // it takes the more than one word with spaces
		   System.out.println("Enter salary");
		   salary = sc.nextFloat();
		   System.out.println("Enter gross salary");
		   grossSalary = sc.nextDouble();
		   System.out.println("Enter gender M/F");
		   gen=sc.next().charAt(0);

		   System.out.println("Employee Details");
		   System.out.println("Name ="+name);
		   System.out.println("Age="+age);
		   System.out.println("Salary = "+salary);
		   System.out.println("Gross Salary = "+grossSalary );
		   System.out.println("Gender ="+gen);
		     
	}

}
    