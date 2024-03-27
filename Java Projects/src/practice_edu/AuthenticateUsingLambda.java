package practice_edu;

import java.util.Scanner;

interface Authent{
    Boolean validate(String Username, String Password);
}
public class AuthenticateUsingLambda {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      
        Authent aob = (Username,Password)->{

            Boolean val = Username.equalsIgnoreCase("Alexa") && Password.equals("coded123")? true:false;
            return val;

             //-----or-------------------
            // if(Username.equalsIgnoreCase(user) && Password.equals(pass)){
            //     return true;
            // }
            // else    
            //     return false;

        };
        String Username = sc.next();
        String Password=sc.next();

        Boolean res = aob.validate(Username,Password);
        System.out.println(res);
      
    }
}
