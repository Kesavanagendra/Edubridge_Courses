package practice_edu;

class Product1{
	int pid;
	String pname;
	public Product1(int pid, String pname) {
		this.pid=pid;
		this.pname=pname;
	}
	public Product1(Product1 p2) {
		this.pid=p2.pid;
		this.pname=p2.pname;
	}
	void display() {
		System.out.println("Product id="+pid);
		System.out.println("Product name="+pname);
	}
}
public class ProductUsingConstructor {
	public static void main(String[] args) {
		Product1 p1=new Product1(10,"TV");
		Product1 p2=new Product1(11,"Laptop");
		p1.display();
		p2.display();
		
		Product1 p3=new Product1(p2);
		p3.display();

	}

}


