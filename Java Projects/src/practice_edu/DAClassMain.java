package practice_edu;

//Singleton pattern
class DataBaseConnection{  // class should give the object
	
	private static DataBaseConnection dob; //null
	private DataBaseConnection()
	{

	}
	
	//get the Object from class
	public static DataBaseConnection getObject() {
		if(dob==null) 
			dob=new DataBaseConnection(); //creates an object
		return dob;
						
	}
	
	void displayRecord() {
		System.out.println("displayRecords");
	}
}

public class DAClassMain {
	public static void main(String[] args) {
		//DataBaseConnection ob=new DataBaseConnection();// error
		DataBaseConnection dob1=DataBaseConnection.getObject();
		System.out.println(dob1);
		dob1.displayRecord();
		DataBaseConnection dob2=DataBaseConnection.getObject();
		System.out.println(dob2);
		DataBaseConnection dob3=DataBaseConnection.getObject();
		System.out.println(dob3);
	}
 
}






//-----Prototype


// class DataBaseConnection{  // class should give the object
	
// 	private static DataBaseConnection dob; //null
// 	private DataBaseConnection()
// 	{

// 	}
	
// 	//get the Object from class
// 	public static DataBaseConnection getObject() {
// 		return new DataBaseConnection();
		
						
// 	}
	
// 	void displayRecord() {
// 		System.out.println("displayRecords");
// 	}
// }

// public class DAClassMain {
// 	public static void main(String[] args) {
// 		//DataBaseConnection ob=new DataBaseConnection();// error
// 		DataBaseConnection dob1=DataBaseConnection.getObject();
// 		System.out.println(dob1);
// 		dob1.displayRecord();
// 		DataBaseConnection dob2=DataBaseConnection.getObject();
// 		System.out.println(dob2);
// 		DataBaseConnection dob3=DataBaseConnection.getObject();
// 		System.out.println(dob3);
// 	}
 
// }