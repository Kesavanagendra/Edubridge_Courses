package practice_edu;

import java.util.Scanner;
class Bubblesort1{
  int a[], size;
  
    void input() {
        Scanner sc= new Scanner(System.in);  //System.in->Keyboard
        System.out.println("Enter array size");
        size = sc.nextInt();
        a = new int[size];
        //Input data 
        
        System.out.println("Enter "+size+" elements");
        for(int i=0 ;i<a.length;i++) {
            a[i] = sc.nextInt();
        }
    }
  
    void displayArray() {
        
        System.out.println("Array elements are ");
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
  
  //Ascending 
    void sortElements() {
	  int temp;
        for(int i=0;i<a.length;i++) {       
            for(int j=0;j<a.length-i-1;j++) {  
                                        
                if(a[j]<a[j+1]) {           
                    temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("After Sort");
        System.out.println("Second largest assuming no duplicates "+a[1]);
    }
 
    void secondLargestDuplicates(){
        for(int i=0;i<a.length;i++){
            int c=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                }
            }
            if(c>1){

                System.out.println("count of "+ a[i]+" is " + c);
            }
        }
    } 
}

public class Bubblesort {

	public static void main(String[] args) {
	  
		Bubblesort1 ob=new Bubblesort1();
		 ob.input();
		//  ob.displayArray();
		//  ob.sortElements();
		//  ob.displayArray();
		ob.secondLargestDuplicates();
	}

}

