/*
 * whenever return the value, you no need to write return Keyword.
 * if there is a single statement in the method, there is no need of {} braces to mention.

 */



package practice_edu;

// @FunctionalInterface
// interface MyInterface{
// 	void display(); //no arg and no return type
// }
// public class MainAppLambda {
//     public static void main(String[] args) {

// 		/*MyInterface iob=new MyInterface() {

// 			@Override
// 			public void display() {
// 				System.out.println("Display method");
				
// 			}
			
// 		};
		
// 		iob.display();*/
		

// 		MyInterface iob=()->{
// 			System.out.println("Display method using Lambda Exp");
			
// 		};
// 		iob.display();
		
// 		//--- for Runnable Thread
// 		Runnable rob=()->{
// 			System.out.println("run method is called");
// 		};
// 		Thread tob=new Thread(rob);
// 		tob.start();

// 	}

// }






@FunctionalInterface
interface HelloInterface{
	void display(String s);
}

interface Addition{
	int add(int a, int b); //function with arg and with return
}

interface Subtraction{
    void sub(int a,int b);
}

interface Str{
    void concat(String s1, String s2);
}

public class MainAppLambda {

	public static void main(String[] args) {

//      HelloInterface hob=(String s)->{
//			System.out.println("Hello Good Morning "+s);
//		};


//----------------or----------------------
		
	HelloInterface hob=(s)->System.out.println("Hello Good Morning "+s);

	hob.display("Kesava");

    // Addition aob =(a,b)->{
    //     return a+b;
    // };
    
    //----or------
    Addition aob = (a,b)-> a+b;//----whenever return the value, you no need to write return Keyword.
                                //---if there is a single statement in the method, there is no need of {} braces to mention.

    Subtraction sob = (a,b)->{
        System.out.println(" subtract is "+(a-b));
    };


    Str stob = (s1,s2)->{
        System.out.println(s1+" "+s2);
    };
    

    aob.add(6,6);
    sob.sub(12,6);
    stob.concat("Kesava", "nagendra");
    
	}

}
