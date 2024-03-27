package practice_edu;

public class Sum_of_fact {
    public static void main(String[] args) {

        //--using for loop//1/1!+2/2!+3/3!+4/4!+5/5!  find the sum of this series
         int i;double sum=0;
        for(i=1;i<=5;i++){
            int fact =1;
            for(int j=1;j<=i;j++){
                fact = fact*j;
            }
            sum = sum + ((double)i/fact);
        }
        System.out.println(sum);
    }
    
}
