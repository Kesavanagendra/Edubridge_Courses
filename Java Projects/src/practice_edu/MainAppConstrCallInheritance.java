package practice_edu;

class Parent2{
	public Parent2(){ // constructor
		System.out.println("Parernt2 constructor");
	}
}

class Child2 extends Parent2{
	public Child2(){
        // super();  //----It willbe created automatically or we can write
		System.out.println("Child2 class constructor");
	}
}
class Child3 extends Child2{
	public Child3(){
	
		System.out.println("Child3 class constructor");
	}
}
public class MainAppConstrCallInheritance { 

	public static void main(String[] args) {
		Parent2 pob=new Parent2();
		// Child3 cob=new Child3();  

	}
}
