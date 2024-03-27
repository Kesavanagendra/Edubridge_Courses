package practice_edu;
 
// whenever we dont want to create the object for our class(by user or others), then we can use abstract keyword
abstract class MyClass{
	private int a, b;
	MyClass(int i, int j){
		a=i;
		b=j;
	}
    void m1() {
    	System.out.println("m1 a="+a+" and b="+b);
    }
   void m2() {
	   System.out.println("m2");
    }
}

class Test extends MyClass{

	Test(int i, int j) {
		super(i, j); //calls super class
		// TODO Auto-generated constructor stub
	}
	
}
public class AbstractWithConstructor {
    public static void main(String[] args) {
        
		//if you dont want object to be created for the class
		//MyClass ob=new MyClass();
		 Test tob=new Test(9,7);
		 tob.m1();
		 tob.m2();
		 
	}

}




//-----------Another problem with Abstract constructor
 
/*abstract class MyClass{
	private int a, b;
	MyClass(){
		System.out.println("Myclass");
	}
	MyClass(int i, int j){
		a=i;
		b=j;
	}
    void m1() {
    	System.out.println("m1 a="+a+" and b="+b);
    }
   void m2() {
	   System.out.println("m2");
    }
}

class Test extends MyClass{

	Test(int i, int j) {
		super(i, j); //calls super class
		// TODO Auto-generated constructor stub
	}
	Test(){
		System.out.println("no arg constr");
	}
	
}
public class AbstractWithConstructor {

	public static void main(String[] args) {
		//if you dont want object to be created for the class
		 Test tob=new Test(9,7);
		 tob.m1();
		 tob.m2();
		 Test ob=new Test();
		 
	}

}
 */
    
