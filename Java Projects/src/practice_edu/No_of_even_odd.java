package practice_edu;

public class No_of_even_odd {
    public static void main(String[] args) {
          int n =153;
         int i=0,j=0;
         while(n!=0){
           int rev = n%10;
            if(rev%2==0){
                 i++;
            }
            else    
                j++;

            n=n/10;
         }
         System.out.println("even numbers are "+i);
         System.out.println("odd numbers are "+j);
    }
    
}
