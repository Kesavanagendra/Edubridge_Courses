package practice_edu;


import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


class StudentTree{
	
    int sid;
	String sname;
	float sfees;
	public StudentTree(int sid, String sname, float sfees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfees = sfees;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + "]";
	}
	
}

class SortId implements Comparator<StudentTree>{

	@Override
	public int compare(StudentTree s1, StudentTree s2) {
		if(s1.sid>s2.sid) 
			return 1;
		else if(s1.sid<s2.sid)
		
		return -1;
		else 
			return 0;
	}
	
}
public class StudentTreeSortUserDefined{
    public static void main(String[] args){
        
		TreeSet<StudentTree> streeset =new TreeSet<StudentTree>(new SortId());
		
		StudentTree s1=new StudentTree(1, "Akash", 45000);
		StudentTree s2=new StudentTree(10, "Kiran", 55000);
		StudentTree s3=new StudentTree(3, "Mohd", 65000);
		StudentTree s4=new StudentTree(11, "Sasikanth", 95000);

		
		streeset.add(s1);
		streeset.add(s2);
		streeset.add(s3);
		streeset.add(s4);
		
		// System.out.println(streeset);
        Iterator<StudentTree> it = streeset.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}




 

	