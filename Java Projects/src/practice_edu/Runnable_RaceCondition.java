//Two threads are performed the two operations without sharing variable.


package practice_edu;

 class Table{
    int count=0;
	void printTable(int num){
        for(int i=1;i<=1000;i++) {
            count++;
            // System.out.println(num+"x"+i+"="+num*i);
        }
		System.out.println(count);
	}
}

class RunThread1 extends Table implements Runnable{
	Table tob;
	public RunThread1(Table tob)
    {
		this.tob=tob;
	}
	
	public void run() 
    {
		tob.printTable(2);
		
	}
}
class RunThread2 extends Table implements Runnable{
	Table tob;
	public RunThread2(Table tob){
		this.tob=tob;
	}
	
	public void run(){
		tob.printTable(5);
	}
}

public class Runnable_RaceCondition {

	public static void main(String[] args) {
		Table tob=new Table();
        RunThread1 t1=new RunThread1(tob);
        RunThread2 t2=new RunThread2(tob);

        Thread t01 = new Thread(t1);
        Thread t02 = new Thread(t2);
        t01.start();
        t02.start();
		// System.out.println(tob.count);
	}

} 













