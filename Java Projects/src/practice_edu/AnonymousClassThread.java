package practice_edu;



public class AnonymousClassThread {

	public static void main(String[] args) {
		Thread t=new Thread() {  //Annonymous class
			public void run() {
				System.out.println("run method");
			}
		};
		t.start();
		
		//---or
		
		new Thread() {  //Annonymous class
			public void run() {
				System.out.println("run method");
			}
		}.start();

        //---or----
		
		//use interface
		
		Runnable rob=new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable run method");
				
			}
			
		};
		Thread t1=new Thread(rob);
		t1.start();

	}

}

