package practice_edu;

interface MyInter{
	int i=10;  //variables need to be intialized  //  public final static int i=10;
	void met1(); // public abstract void m1();
	 void met2();  //  public abstract void m2();
}

	//interface will not have constructors
	//object creation is not possible
	class Employees implements MyInter{
	    public void met1(){
	    	  System.out.println("m1");
	     }
	    public void met2(){
	           System.out.println("m2");
	     }
	}

public class MainInterface {
    public static void main(String[] args) {
        // MyInter mob = new Employee();
        // mob.met1();
        // mob.met2();

        
        Employees ob=new Employees();
        ob.met1();
        ob.met2();
    }
    
}





/* 
Inheritance in Inteface
>one interface can extends any number of interfaces
>one class can implements any number interfaces
>class can extends one class can implements any number of interfaces

interface intf1{
    int i=1;
    void m1();
}
interface intf2 {
    int j=1;
    void m2();
}

interface intf3 extends intf1, intf2{
     void m3();
}

 class MyClass implements inf3{
     public  void m1(){}
       public  void m2(){}
       public  void m3(){}
 }

  class Student implements inf1,inf2{
}
class Product extends Student implemets inf3{
}
*/