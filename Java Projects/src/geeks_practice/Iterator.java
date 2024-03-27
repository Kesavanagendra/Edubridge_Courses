package geeks_practice;
import java.util.*;
public class Iterator {
    public ArrayList iter(ArrayList<Integer> a,int k)
    {   
        ArrayList<Integer> b = new ArrayList<>();
        a.sort(null);
        for(int i=0;i<a.size();i++){
            if(a.get(i)>k){
                b.add(a.get(i));
            }
        }
        return b;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.addAll(Arrays.asList(new Integer[] {1,6,9,5,4,2,11}));
        Scanner sc = new Scanner(System.in);
        Iterator obj = new Iterator();
        int k=sc.nextInt();
        System.out.println(obj.iter(a,k));
    }
}


//------------another way---------------------

// import java.util.*;
// public class Iterator {
//     public ArrayList iter(ArrayList<Integer> a,int k)
//     {   
//         ArrayList<Integer> b = new ArrayList<>();
//         java.util.Iterator<Integer> it = a.iterator();
//         while(it.hasNext()){
//             int m=it.next();
//             if(m<k){
//                 it.remove();
//             }
//         }
//         Collections.sort(a);
//         return a;
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> a = new ArrayList<>();
//         a.addAll(Arrays.asList(new Integer[] {1,6,9,5,4,2,11}));
//         Scanner sc = new Scanner(System.in);
//         Iterator obj = new Iterator();
//         int k=sc.nextInt();
//         System.out.println(obj.iter(a,k));
//     }
// }
