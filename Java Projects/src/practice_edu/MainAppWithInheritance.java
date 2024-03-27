package practice_edu;

//default access specifier, scope is within package
//private data cannot be accessed from out side the class


class Parent1{
 int i, j;  
   Parent1(){
        i=12;
        j=34;
    }
    void parentDisplay(){
        System.out.println("parentDisplay "+(i+j));
    }
}

class Child1 extends Parent1{
  int s;
    void ChildMethod(){
  	         s=i+j;
              System.out.println("sum="+s);
    }
 
}
public class MainAppWithInheritance{
    public static void main(String args[]){
        Child1  cob=new Child1();
        cob.ChildMethod();

    }
}