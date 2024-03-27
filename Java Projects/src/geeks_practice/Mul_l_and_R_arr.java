package geeks_practice;
public class Mul_l_and_R_arr {
    public static void main(String[] args) {
        // int a[]={1,2,3,4};
        int a[]={1,2,3,2,1,1};
        int len =a.length;
        int l=len/2;
        int sum1=0;
        int sum2=0;int res;
        for(int i=0;i<len;i++){
            if(i<l){
                sum1=sum1+a[i];
            }
            else 
                sum2=sum2+a[i];
        }
        res=sum1*sum2;
        System.out.println(res);
    }
}



//---Another problem -------------------//
//-------Balanced Array------------------//

// public class Mul_l_and_R_arr {
//     public static void main(String[] args) {
//         int a[]={1,2,3,2,1,1};
//         int len =a.length;
//         int l=len/2;
//         int sum1=0;
//         int sum2=0;int res;
//         for(int i=0;i<len;i++){
//             if(i<l){
//                 sum1=sum1+a[i];
//             }
//             else 
//                 sum2=sum2+a[i];
//         }
//         if(sum1>sum2){
//            res= sum1-sum2;
//            System.out.println(res);
//         }
//         else{
//             res=sum2-sum1;
//             System.out.println(res);
//         }
//     }
// }
