package geeks_practice;
import java.util.*;
public class Hash {
    public int map(String s[],int arr[],String r){
        HashMap<String,Integer> h=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            h.put(s[i],arr[i]);
        }
        if(h.containsKey(r)){
            return h.get(r);
        }
        return -1;
    }
    public static void main(String[] args) {
        String s[] ={"sak","varun","vijay"};
        Scanner sc = new Scanner(System.in);
        String r = sc.next();
        int arr[]={5,7,3};
        Hash obj =new Hash();
        System.out.println(obj.map(s,arr,r));

        
    }
    
}


