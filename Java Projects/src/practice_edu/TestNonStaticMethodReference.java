package practice_edu;

@FunctionalInterface
interface Addition1{
	int add(int a, int b);

}
class InstMethodRef{
	public int addnumbers(int i, int j) {
		return (i+j);
	}
}
public class TestNonStaticMethodReference {
    public static void main(String[] args) {
        Addition1 aob=(a,b)->(a+b); //Lambda Exp
		System.out.println("sum="+aob.add(4,8));
		
		//Method Ref
        MethodRef aob2 = new MethodRef();
        int res=aob2.addnumbers(6, 6);
		System.out.println("sum="+res);
    }
}
