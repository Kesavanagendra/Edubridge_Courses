package practice_edu;
import java.util.Scanner;


class Employee{
	 int empid;
	 String empname;
	 int empage;
     int empsalary;

	void inputEmpData(){
	    Scanner scanner  = new Scanner(System.in);
	    System.out.println("Enter name");
	    empname = scanner.nextLine();
	   
	    System.out.println("Enter id");
	    empid = scanner.nextInt();

        System.out.println("Enter age");
	    empage = scanner.nextInt();

        System.out.println("Enter salary");
	    empsalary = scanner.nextInt();

	}
	void displayEmpData(){
	     System.out.println("emp name="+empname); 
		System.out.println("emp id="+empid); 
        System.out.println("emp age="+empage); 
		System.out.println("emp salary="+empsalary);
	}
	 
	}

public class MainAppEmployee {

	public static void main(String[] args) {
	 
		//create an object
		Employee sc = new Employee();
		sc.inputEmpData();
		sc.displayEmpData();


		// System.out.println("emp name="+sc.empname); 
		// System.out.println("emp id="+sc.empid); 
        // System.out.println("emp age="+sc.empage); 
		// System.out.println("emp salary="+sc.empsalary);
		
	}

}