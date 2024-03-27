package geeks_practice;
import java.util.*;
import java.util.HashMap;
// public class Commonele{
//     public static void main(String[] args) {
//         int v1[]={3,4,2,2,4};
//         int v2[]={3,2,2,7};
//         HashMap<Integer,Integer> map = new HashMap<>();
//         HashMap<Integer,Integer> v3 = new HashMap<>();
//         ArrayList<Integer> a = new ArrayList<>();
//         Arrays.sort(v1);
//         Arrays.sort(v2);
//         for(int i=0;i<v1.length;i++)
//         {
//             if(map.containsKey(v1[i]))
//             {
//                 map.put(v1[i],map.get(v1[i])+1);
//             }
//             else{
//                 map.put(v1[i],1);
//             }
//         }
//         for(int i=0;i<v2.length;i++)
//         {
//             if(map.containsKey(v2[i]))
//             {
//                 v3.put(i,v2[i]);
//                 if(map.get(v2[i])-1== 0)
//                 {
//                     map.remove(v2[i]);
//                 }
//                 else
//                 {
//                     map.put(v2[i],map.get(v2[i])-1);
//                 }
//             }
//         }
        
//         // System.out.println(Arrays.toString(v1));
//         // System.out.println(Arrays.toString(v1));
//         // System.out.println(v3.values());

//         //--------or------------------
//         for(int i=0;i<v3.size();i++){
//             System.out.print(v3.get(i) + " ");
//         }
//     }
// }




//another method-----------------------

import java.util.*;
public class Commonele {
    public static void main(String[] args) {
        ArrayList<Integer> v1 = new ArrayList<>();
        ArrayList<Integer> v2 = new ArrayList<>();
        v1.addAll(Arrays.asList(new Integer[] {3,4,2,2,4}));
        v2.addAll(Arrays.asList(new Integer[] {3,2,2,7}));
        ArrayList<Integer> v3 = new ArrayList<>();
        for(int val : v1){
            v3.add(val);
        }
        v3.retainAll(v2);//--it gives common elements.

        // v3.removeAll(v2);//---it gives uncommon elements.
        System.out.println(v3);

    }

}