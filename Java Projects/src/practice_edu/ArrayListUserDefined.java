package practice_edu;

import java.util.ArrayList;
import java.util.Iterator;

class EmployeeArr{
   int eid;
   String ename;
   float esalary;
public EmployeeArr(int eid, String ename, float esalary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esalary = esalary;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
 }
}
public class ArrayListUserDefined {
    public static void main(String[] args) {
        
		ArrayList<EmployeeArr>emplst =new ArrayList<EmployeeArr>();
		EmployeeArr e1=new EmployeeArr(1, "Ramesh", 30000);
		EmployeeArr e2=new EmployeeArr(2, "Kavitha",40000);
		EmployeeArr e3=new EmployeeArr(7, "Kiran", 20000);
		EmployeeArr e4=new EmployeeArr(5, "Poovi", 50000);
		
		emplst.add(e1);
		emplst.add(e2);
		emplst.add(e3);
		emplst.add(e4);
		
		System.out.println(emplst);
		System.out.println("___________________________________");
		Iterator<EmployeeArr>eit=emplst.iterator();
		
		System.out.println("EID\tENAME\tESALARY");
		System.out.println("---------------------------------------");
          while(eit.hasNext()) { //boolean
         EmployeeArr eob=eit.next();
             // System.out.println(eit.next());
        	System.out.println(eob.eid+"\t"+eob.ename+"\t"+eob.esalary);
          }
	}

}




    









    