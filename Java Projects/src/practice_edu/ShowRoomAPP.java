package practice_edu;
import java.util.Scanner;

class ShowRoom{
    String name;
    long mobno;
    double cost;
    double dis;
    double amount;

        void input()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter customer name");
            name = sc.nextLine();
            System.out.println("Enter customer mobno");
            mobno = sc.nextInt();	    
            System.out.println("Enter cost");
            cost = sc.nextDouble();
        }

        void calculate(){
            double discount=0;
            if(cost <0){
                System.out.println("invlid");
                System.exit(0);
            }
            if (cost <= 10000) {
                discount = cost * 0.05; 
            }
            else if (cost > 10000 && cost <= 20000) {
                discount = cost * 0.1; 
            } 
            else if (cost >= 20000 && cost <= 35000) {
                discount = cost * 0.15; 
            } 
            else if (cost >= 35000) {
                discount = cost * 0.2;  
            }
            amount = cost - discount;
        }

        void display(){
            System.out.println("name = "+name);
            System.out.println("mobno = "+mobno);
            System.out.println("amount="+amount);
        }
}
public class ShowRoomAPP {
	public static void main(String[] args) {
		ShowRoom s= new ShowRoom();
		s.input();
		s.calculate();
		s.display();
    }
}
