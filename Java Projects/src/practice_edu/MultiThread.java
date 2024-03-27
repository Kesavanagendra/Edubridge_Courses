package practice_edu;
class A extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            //  System.out.println("Hi"+ Thread.currentThread());//-->Here ,Thread.currentTHread() is used to print the current thread name.
            System.out.println("Hi");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            // System.out.println("Hello"+Thread.currentThread());//-->Here ,Thread.currentTHread() is used to print the current thread name.
            System.out.println("Hello");
        }
    }
}
public class MultiThread {
    public static void main(String[] args) {
        A ao = new A();
        B bo = new B();
        ao.setPriority(10);//-->priority is useful when both threads are coming to a scheduler at same time during the process.which will we give priority ,that will be give first.
        ao.start();
        bo.start();

        // ao.setName("one");//-->here we set the name to thread.
        // bo.setName("two");//-->here we set the name to thread.
    }
    
}








