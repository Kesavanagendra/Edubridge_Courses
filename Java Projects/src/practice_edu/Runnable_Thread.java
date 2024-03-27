package practice_edu;

class A1 implements Runnable{
	   @Override
	    public void run(){
	          System.out.println("Run method");
	   }
	    
	}

	public class Runnable_Thread{
	       public static void main(String args[]){

	             A1 ob=new A1 (); //Thread-0,5,main
	             Thread t1=new Thread(ob);
	              t1.start();//cannot start the thread more than once, throw the IllegalThreadStateException
	               
	       }
	}