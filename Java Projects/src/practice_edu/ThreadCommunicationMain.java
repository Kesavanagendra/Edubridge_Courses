package practice_edu;


class Banks{
	float bal;
	public Banks(float bal) {
		this.bal=bal;
	}
	
    synchronized void deposit(float damt){
		System.out.println("You are in deposit "+Thread.currentThread());
		bal=bal+damt;
		System.out.println("amount is deposited");
		notify();
	}

	
    synchronized void withdraw(float wamt) throws InterruptedException {
		if(wamt>bal){
			System.out.println("Insufficient bal, waiting for deposit "+Thread.currentThread());
			wait();
			System.out.println("After wait method "+bal);
		}
			
	}
}


public class ThreadCommunicationMain {

	public static void main(String[] args) {
		Banks b=new Banks(1000);
		Thread t1=new Thread() {
			public void run(){
				try{
					b.withdraw(3000);
				} 
                catch (InterruptedException e)
                {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t1.start();
		
		Thread t2=new Thread(){
			public void run() 
            {
				b.deposit(3000);
			}
		};
		t2.start();
	}
}
