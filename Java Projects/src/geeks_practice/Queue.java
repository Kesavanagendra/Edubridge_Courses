package geeks_practice;
import java.util.*;
import java.util.Scanner;
public class Queue {
    public static void main(String[] args) {
        ArrayList<Integer> a =new ArrayList<>();
        a.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,2,3,1}));
        a.sort(null);
        int m[]={1,3,2,9,10};
        int l = a.size();
        System.out.println("l is "+l);
        System.out.println(a);
        for(int i=0;i<m.length;i++)
        {
            if(a.contains(m[i])){
                System.out.println(1);
                System.out.println(a.get(l-1));
                a.remove(a.get(l-1));
                l--;
            }
            else{
                System.out.println(-1);
            }
        }
    }
}



//----Another way with function-----

// import java.util.*;
// import java.util.Scanner;
// public class Queue 
// {
//     public int check(ArrayList<Integer> a,int k,int l)
//     {
//         a.sort(null);
       
//             if(a.contains(k))
//             {
//                  return 1;
//             }
//             else{
//                  return -1;
//             }
//     }
//     public void insert(ArrayList<Integer> a, int k, int l) {
//         a.sort(null);
//         if(a.contains(k)){
//             System.out.println(a.get(l));
//             a.remove(a.get(l));
//             //System.out.println(a);
//         }
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> a =new ArrayList<>();
//         a.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,2,3,1}));
//         int m[]={1,3,2,9,10};
//         int l = a.size();
//         Queue obj =new Queue();
//         System.out.println(a);
//         for(int k:m){
//             System.out.println(obj.check(a,k,l--));
//             obj.insert(a,k,l);
//         }
//     }
// }



