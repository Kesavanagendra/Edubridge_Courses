/*Elevator program  */

package practice_edu;
import java.util.Scanner;

class Elevator{
    int min_floor; int max_floor; int Initial_floor; int current_floor;
    public Elevator(){
         min_floor=1;
         max_floor=10;
         Initial_floor=1;
    }
    void selectFloor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the floor that you'd like to got to : ");
        current_floor=sc.nextInt();
        
        if(current_floor < min_floor || current_floor > max_floor){
            System.out.println("Note!-Carefully enter the floor in between 1 to 10");
            selectFloor();
        }
        else if(current_floor==Initial_floor ){
                System.out.println("you are on the same floor that is "+current_floor );
        }
        else if(current_floor >= 1 || current_floor <= 10){
            String s2 = current_floor > Initial_floor ? "Going up.." : "Going down..";
            System.out.print(s2);
            
            while(current_floor!=Initial_floor){
                
                if(current_floor>Initial_floor){
                    // Initial_floor=current_floor;
                    int res= ++Initial_floor;
                    System.out.print(res+"..");
                }
                else if(current_floor < Initial_floor){
                    // Initial_floor = current_floor;
                    int res = --Initial_floor;
                    System.out.print(res + "..");
                }
            }
            System.out.print("Ding!");
            Initial_floor=current_floor;
        }
     }
    void fireAlarm(){
        // System.out.println("you must exit the building now!");
        if(current_floor>1){
            while(current_floor!=1){

                current_floor--;
            }
            System.out.println("you must exit the building now!. you are on the floor"+current_floor);
        }
        else{
            System.out.println("you must exit the building now. you already on floor 1");
        }
    }
}
public class ElevatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Elevator obj= new Elevator();
        String ch;
        while(true){
            do{ 
                
                System.out.println("options: (s)elect a floor, (f)ire alarm, (q)uit");
                System.out.println("Enter s,f, or q");
                ch=sc.next();

                switch(ch){
                    case "s":
                    obj.selectFloor();
                    break;
                    case "f":
                    obj.fireAlarm();
                    break;
                    case "q":
                    System.out.println("quit");
                    System.exit(0);
                    default:
                    System.out.println("Invalid selection");
                    break;
                }
            }
            while(ch.equals("q"));
               System.out.println();
        }
    }
}




//--->same program by handling the Exception.




// package practice_edu;

// import java.util.Scanner;

// class Myerror extends Exception{
//     public Myerror(String s){
//         super(s);
//     }
// }

// class Elevator{
//     int min_floor; int max_floor; int Initial_floor; int current_floor;
//     public Elevator(){
//          min_floor=1;
//          max_floor=10;
//          Initial_floor=1;
//     }
//     void selectFloor(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the floor that you'd like to got to : ");
//         current_floor=sc.nextInt();
//         try{
//             if(current_floor < min_floor || current_floor > max_floor){
//                 throw new Myerror("carefully enter floor number");
//             }
//             else
//             {
//                     if(current_floor==Initial_floor )
//                     {
//                         System.out.println("you are on the same floor that is "+current_floor );
//                     }
//                     else if(current_floor >= 1 || current_floor <= 10)
//                     {
//                         String s2 = current_floor > Initial_floor ? "Going up.." : "Going down..";
//                         System.out.print(s2);

//                         while(current_floor!=Initial_floor){

                    
//                             if(current_floor>Initial_floor){
//                                 // Initial_floor=current_floor;
//                                 int res= ++Initial_floor;
//                                 System.out.print(res+"..");
//                             }
//                             else if(current_floor < Initial_floor){
//                                 // Initial_floor = current_floor;
//                                 int res = --Initial_floor;
//                                 System.out.print(res + "..");
//                             }
//                         }
//                         System.out.print("Ding!");
//                         Initial_floor=current_floor;
//                     }
                
//             }
//         }
//         catch(Exception e){
//             e.printStackTrace();
//         }
//      }
//     void fireAlarm(){
//         System.out.println("you must exit the building now!");
//            if(current_floor>1){
//                 while(current_floor!=1){

//                     current_floor--;
//                 }
//                 System.out.println("you must exit the building now!. you are on the floor"+current_floor);
//             }
//             else{
//                 System.out.println("you must exit the building now. you already on floor 1");
//             }
//     }
// }
// public class ElevatorMain {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Elevator obj= new Elevator();
//         String ch;
//         while(true){
//             do{ 
                
//                 System.out.println("options: (s)elect a floor, (f)ire alarm, (q)uit");
//                 System.out.println("Enter s,f, or q");
//                 ch=sc.next();

//                 switch(ch){
//                     case "s":
//                     obj.selectFloor();
//                     break;
//                     case "f":
//                     obj.fireAlarm();
//                     break;
//                     case "q":
//                     System.out.println("quit");
//                     System.exit(0);
//                     default:
//                     System.out.println("Invalid selection");
//                     break;

//                 }
//             }
//             while(ch.equals("q"));
//                System.out.println();
//         }
        
//     }
// }





