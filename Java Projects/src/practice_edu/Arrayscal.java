// package practice_edu;
// import java.util.*;
// import java.util.Scanner;
// class Demo1{
//     int sum=0;
//     void display(int a[],int n){
//         for(int i=0;i<n;i++){
//             System.out.print(a[i]+" ");
//         }
//         System.out.println();
//     }
//     void sum(int a[],int n){
//         for(int i=0;i<n;i++){
//             sum = sum+a[i];
//         }
//         System.out.println("sum is "+ sum);
//     }
//     void avg(int n){
// 		float avg = (float)sum/n;
// 		System.out.println("avg is "+ avg);

// 	}
//     void max(int a[],int n){
//         int max =0;
//         for(int i=0;i<n;i++){
//             int temp=Math.max(max,a[i]);
//             max=temp;
//         }
//         System.out.println("largest is "+max);
//     }
//     void min(int a[],int n){
//         int min=a[0];
//         for(int i=0;i<n;i++){
//             int temp=Math.min(min,a[i]);
//             min=temp;
//         }
//         System.out.println("least is "+min);
//     }

//     void sorting(int[] a,int n){
//         Arrays.sort(a);
//         for(int i=0;i<n;i++){
//             System.out.print(a[i]+" ");
//         }
//     }
// }
// public class Arrayscal {
// 	public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// 	 int a[] = new int[5];
// 	 Demo1 obj = new Demo1();
// 	 int l=a.length;
// 	 for(int i=0;i<l;i++){
// 		a[i]=sc.nextInt();
// 	}
// 	obj.display(a, l);
// 	obj.sum(a, l);
//     obj.avg( l);
// 	obj.max(a,l);
// 	obj.min(a,l);
// 	obj.sorting(a,l);
		
// 	}

// }


   




package practice_edu;
import java.util.*;
import java.util.Scanner;
class Demo1{
    int a[] = new int[5];
    int sum=0;
    int l=a.length;
    void inputData(){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<l;i++){
		    a[i]=sc.nextInt();
	    }
    }
    void display(){
        for(int i=0;i<l;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    void sum(){
        for(int i=0;i<l;i++){
            sum = sum+a[i];
        }
        System.out.println("sum is "+ sum);
    }
    void avg(){
		float avg = (float)sum/l;
		System.out.println("avg is "+ avg);

	}
    void max(){
        int max =0;
        for(int i=0;i<l;i++){
            int temp=Math.max(max,a[i]);
            max=temp;
        }
        System.out.println("largest is "+max);
    }
    void min(){
        int min=a[0];
        for(int i=0;i<l;i++){
            int temp=Math.min(min,a[i]);
            min=temp;
        }
        System.out.println("least is "+min);
    }

    void sorting(){
        Arrays.sort(a);
        for(int i=0;i<l;i++){
            System.out.print(a[i]+" ");
        }
    }
}
public class Arrayscal {
	public static void main(String[] args) {
       	
        Demo1 obj = new Demo1();
        obj.inputData();
        obj.display();
        obj.sum();
        obj.avg();
        obj.max();
        obj.min();
        obj.sorting();
		
	}

}


   



 

    

  
    


 

    

  
    
