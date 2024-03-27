// we can use the Constructor or (setters and getters) to set the input and get the output.


package practice_edu;

class Student1{
	private int sid;
	private String sname;
	
	public Student1(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	
	public Student1() {
        super();
    }

    public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	
	@Override
	public String toString() { //-->It is the predefined method to return the object data.
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}


	
}

public class MainAppSetterGetter {

	public static void main(String[] args) {
		Student1 ob=new Student1(34,"Manvi");
		System.out.println(ob);
		Student1 ob1=new Student1();
		ob1.setSid(12);
		ob1.setSname("kiran");
		System.out.println(ob1);
	}

}