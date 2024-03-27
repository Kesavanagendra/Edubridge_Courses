package practice_edu;

class CheckBankBalance extends Exception{
	public CheckBankBalance(String s) {
		super(s);
	}
}

class Bank1{
	float balance;

	Bank1(){
		balance = 1000;
	}

	void deposit(float damt) {
		balance = balance+damt;
		System.out.println("after deposit your balance="+balance);
	}
	
	void withdraw(float wamt){ 
		try {
            if(balance<wamt){
                //CheckBankBalance cob=new CheckBankBalance("Less Balance you cannot withdraw");
                //throw cob;
                throw new CheckBankBalance("Less Balance you cannot");
            }
            else{
                    balance=balance-wamt;
                    System.out.println("after withdraw your balance="+balance);
            }
		}
        catch(CheckBankBalance e)
        {
	     e.printStackTrace();
		}
	
	}
}

public class MainAppBank {

	public static void main(String[] args)  {
		Bank1 bob=new Bank1();
           bob.deposit(200); 
           bob.withdraw(1300);
           System.out.println("After withdraw");
	}

}