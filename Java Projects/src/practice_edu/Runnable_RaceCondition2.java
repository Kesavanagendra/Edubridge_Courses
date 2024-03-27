//----When two threads are perfomed the operations by sharing the same variable , program written using General way.

package practice_edu;

class Table1{
    int count=0;
	synchronized void increment(){
        for(int i=1;i<=1000;i++) {
           count++;
        }
		System.out.println(count);
	}
}

class RunThread1 extends Table1 implements Runnable{
	Table1 tob;
	public RunThread1(Table1 tob)
    {
		this.tob=tob;
	}
	
	public void run() 
    {
		tob.increment();
		
	}
}
class RunThread2 extends Table1 implements Runnable{
	Table1 tob;
	public RunThread2(Table1 tob){
		this.tob=tob;
	}
	
	public void run(){
		tob.increment();
	}
}

public class Runnable_RaceCondition2 {

	public static void main(String[] args) {
		Table1 tob=new Table1();
        RunThread1 t1 = new RunThread1(tob);
        RunThread2 t2 = new RunThread2(tob);

        Thread t01 = new Thread(t1);
        Thread t02 = new Thread(t2);
        t01.start();
        t02.start();

	}

} 





//----When two threads are perfomed the operations by sharing the same variable,program written using Anonymous class

// package practice_edu;

// class Table1{
//     int count=0;
// 	synchronized void increment(){
//         for(int i=1;i<=1000;i++) {
//            count++;
//         }
// 	}
// }


// public class Runnable_RaceCondition2 {

// 	public static void main(String[] args) {
// 		Table1 tob=new Table1();
//         Thread t1=new Thread()
//         {
//             public void run() 
//             {
//                 tob.increment();
                
//             }
//         };
//         Thread t2=new Thread(){
//             public void run(){
//                 tob.increment();
//             }
//         };

//         t1.start();
//         t2.start();

//         try {
//             t1.join();
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }

//          try {
//             t2.join();
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }

//         System.out.println(tob.count);
// 	}

// } 

