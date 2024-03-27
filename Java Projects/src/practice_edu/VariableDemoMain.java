package practice_edu;

public class VariableDemoMain {
int instancevar=0;
static int staticvari=0;  //only once on class load and it will hold the prevoius value and its updated.
// static {
// 	staticvari=0;
// }
VariableDemoMain(){
	 instancevar++;
     staticvari++;
     System.out.println(" in constructor instancevar="+instancevar); 
	System.out.println(" in constructor staticvari="+staticvari); 
     
}

void updateData() {
	instancevar++; 
	staticvari++;  
	System.out.println("instancevar="+instancevar); 
	System.out.println("staticvari="+staticvari); 
}
	
	public static void main(String[] args) {
		VariableDemoMain ob1=new VariableDemoMain();
		 ob1.updateData();
		VariableDemoMain ob2=new VariableDemoMain();
       
        ob2.updateData();
	}

}