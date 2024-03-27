package practice_edu;

//Different Blocks in java
//static, annonymous, main, constructor

public class DifferentBlocksMain {
	int i;
	static String cname;
	//----static block----it will be execute only once 
	static{
		System.out.println("static block is called before main method");
		System.out.println("used to initialize static variable of a class");
	    cname="Edubridge";
	}
	//---Anonymous block, it will executes no.of times we created the object.	
	{
		System.out.println("Annonymous Block1, execute before constructor, on object creation");
	}
	
	DifferentBlocksMain(){
		//intitializing the instatince variable of class
		System.out.println("contructor "+i);
		System.out.println("Company name "+cname);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main");
		DifferentBlocksMain ob=new DifferentBlocksMain(){ // we can write here the Anonymous class, blocks.
		 {
			System.out.println("Annonymous Block1, execute before constructor, on object creation");
		 }
		};
			

	}

}
