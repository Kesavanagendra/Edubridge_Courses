package practice_edu;


class Parent1{
     Parent1(){
            System.out.println("parent1");
     }
}
class Child1 extends Parent1{
   Child1(){
            System.out.println("child 1");
     }
}
class Child2 extends Parent1{
     Child2(){
            System.out.println("child 2");
     }
}

class Child3 extends Child2{
             Child3 (){
             System.out.println("child 3");
           }
}
public class HierarchialInhert {
    public static void main(String[] args) {
        Child3 obj = new Child3();

    }
    
}
