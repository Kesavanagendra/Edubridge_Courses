package practice_edu;

import java.util.Scanner;

class Prime{
	int num; //instance varaible
	
	void inputNum() { 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		num = sc.nextInt();
	}


	
	void checkPrime() {
	    int c=0;
	   for(int i=1;i<=num;i++){
	        if(num%i==0){
	            System.out.println(i);
	            c++;
	        }
	    }
        if(c==2){
                System.out.println(num+" is prime number ");
        }
        else{
                System.out.println(num+" is not a prime number");
        }
    }

	public void generatePrimeOneToHundred() {
		int c;
		int k=0;
		System.out.println("Prime numbers from 1 to 100 are ");
		for(int num=1;num<=100;num++) {  
			c=0;
			for(int i=1;i<=num;i++) { 
				if(num%i==0) {
					c++;
					
				}
				
			}
			
			if(c==2 ) {
				System.out.println(num + " ");
				//----to print the required no.of prime numbers from first or last
				/*k++;
				if(k==3){
					// break;
					System.exit(0);
				}*/
			}
		}
		
	}
}


public class PrimeMain {

	public static void main(String[] args) {
		Prime primeObj=new Prime();
		// primeObj.inputNum();
		// primeObj.checkPrime();
		primeObj.generatePrimeOneToHundred();

	}

	
}

