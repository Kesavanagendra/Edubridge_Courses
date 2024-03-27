package practice_edu;

public class Rev_num {
    public static void main(String[] args) {
        // int num=234;
        // int rem=num%10;
        // System.out.print(rem);
        // num = num/10;//23
        // rem = num%10;
        // System.out.print(rem);
        // int res=num/10;
        // System.out.print(res);

//---program of palindrome or not program

        int num=434;
        int temp=num;
        int sum=0;
        boolean b;
        while(num!=0){
            int rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        System.out.println(sum);
        // if(temp==sum){
        //     System.out.println("Given number is palindrome");
        // }
        // else{
        //     System.out.println("Given number is not palindrome");
        // }

        // //------or-----------
        
        b=(temp==sum);
        System.out.println("b is "+b);
    }
    
}
