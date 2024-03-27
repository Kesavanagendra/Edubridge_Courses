package practice_edu;

// interface Aa1 {
// 	public boolean checkSingleDigit(int x);
// }

// class Digit {
// 	public static boolean isSingleDigit(int x) {
// 	    return x > -10 && x < 10;
// 	}
// }

// public class TestStaticMethodReference {
//     public static void main(String[] args) {
		
// 		//*** Using Lambda Expression ***//
// 		Aa1 a1 = (x) -> { return x > -10 && x < 10;};
// 		System.out.println(a1.checkSingleDigit(10));
		
		
		
		
// 		//*** Using Method Reference ***//
// 		Aa1 a2 = Digit::isSingleDigit; //scope resolution 
// 		System.out.println(a2.checkSingleDigit(9));
// 	}
// }









@FunctionalInterface
interface Addition1{
	int add(int a, int b);

}
class MethodRef{
	public static int addnumbers(int i, int j) {
		return (i+j);
	}
}

// @FunctionalInterface
interface Subtract{
    int sub(int a,int b);
}
class MethodRef1{
    public static int subNum(int i,int j){
        return i-j;
    }
}

public class TestStaticMethodReference {

	public static void main(String[] args) {
		Addition1 aob=(a,b)->(a+b); //Lambda Exp
		System.out.println("sum="+aob.add(4,8));
		
		//Method Ref
		Addition1 aob1=MethodRef::addnumbers;
		System.out.println("sum="+aob1.add(5,8));

        // Lambda Exp
        Subtract sob = (a,b)-> a-b;
        System.out.println(sob.sub(6,3));

        // Method ref Exp
        Subtract sob1 = MethodRef1::subNum;
        System.out.println(sob1.sub(6, 3));
	}

}