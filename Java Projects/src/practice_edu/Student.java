package practice_edu;

class Student{
	private String empname;
	 private int empid;

	public void setName(String empname){
		this.empname = empname;
	}
	public String getName(){
		return empname;
	}
	public void setId(int empid){
		this.empid = empid;
	}
	public int getId(){
		return empid;
	}

	void displayEmpData(){
	     System.out.println("emp name="+empname); 
		System.out.println("emp id="+empid);
	}
}