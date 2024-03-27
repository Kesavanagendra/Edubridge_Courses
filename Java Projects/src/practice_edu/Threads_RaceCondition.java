package practice_edu;

class Table{
	public char[] count;

    void printTable(int num){
        for(int i=1;i<=10;i++) {
            System.out.println(num+"x"+i+"="+num*i);
        }
	}

	public void increment() {
	}
}

class Thread1 extends Thread{
	Table tob;
	public Thread1(Table tob)
    {
		this.tob=tob;
	}
	
	public void run() 
    {
		tob.printTable(2);
	}
}
class Thread2 extends Thread{
	Table tob;
	public Thread2(Table tob){
		this.tob=tob;
	}
	
	public void run(){
		tob.printTable(5);
	}
}

public class Threads_RaceCondition {

	public static void main(String[] args) {
		Table tob=new Table();
        Thread1 t1=new Thread1(tob);
        Thread2 t2=new Thread2(tob);
        t1.start();
        t2.start();
	}

} 





