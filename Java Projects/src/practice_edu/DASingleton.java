package practice_edu;


//WHen you create a private constructor it will restrict user not to create the object

class SingletonClass{

    private static SingletonClass sob=new SingletonClass(); //object is private and static 
	
	
	private SingletonClass(){// restrict user not to create an object

    }

    public static SingletonClass getInstance() {
		return sob; //each time you are returning the same object
    }
	
	public void display() {
		System.out.println("Display method");
	}
	
	
	
}

public class DASingleton {

	public static void main(String[] args) {
		//get the object
		//SingletonClass ob=new SingletonClass();  //error, 
		//SingletonClass ob1=new SingletonClass();//when you create object , it will call const
          
		SingletonClass	sob=SingletonClass.getInstance();
		sob.display();
		   
      }
}
//IOC or dependency injection

//Singleton--> class should give a single object
//How to restrict user from creating multiple objects in main method??-->Use singleton pattern