package practice_edu;
import java.io.*;

//function overriding : function name , return type and argument list must match

class Parent2Inhert{ 
	 int i;
	 Parent2Inhert(){
		i=9; 
		System.out.println("Parent2 class constructor");
	}
    void display() {    //if the function is final you cannot override
        System.out.println("Parent display() ");
    }
}


 class Child2Inhert extends Parent2Inhert{  // if the class is final ,its stop the inheritance level and No more child class cant be created.
	int i;
	 Child2Inhert(){
		System.out.println("Child2 class constructor "+super.i);
		System.out.println("Child2 class constructor "+i);
	}
    void display() {
        //super.display();  //if it enables it will call the parent display method
        System.out.println("child display()");
    }
	  
	void add() {
		System.out.println("add method");
	}
	
}

public class MainInhert {

	public static void main(String[] args) {
		// Parent2Inhert pob=new Parent2Inhert(); 

		// Child2Inhert cob = new Child2Inhert(); 
        // cob.display(); 
        //   cob.add();
          
          Parent2Inhert pob = new Child2Inhert();// here we create the reference for the Parent2Inhert class, so it can access the all data(i.e,only common data methods) of parent2Inhert,child2Inhert classes.
          pob.display();
		 
          
    }
}

