/*-----reference created by the object----*/

package com.sample.ManExample;

import org.springframework.beans.factory.annotation.Autowired;

public class HumanBody {

    @Autowired
    private Heart heart;

    public void humanAlive(){
        if(heart!=null){
            Heart.heartBeat();
        }
        else{
            System.out.println("Sorry");
        }
    }
}




/*-----reference created by the constructor---*/

// package com.sample.ManExample;

// import org.springframework.beans.factory.annotation.Autowired;

// public class HumanBody {

//     private Heart heart;

//     @Autowired
//     public HumanBody(Heart heart){
//         this.heart = heart;
//     }

//     public void humanAlive(){
//         if(heart!=null){
//             Heart.heartBeat();
//         }
//         else{
//             System.out.println("Sorry");
//         }
//     }
// }




/*-------reference created by setter method----*/

// package com.sample.ManExample;

// import org.springframework.beans.factory.annotation.Autowired;

// public class HumanBody {

//     private Heart heart;

//     @Autowired
//     public void setHeart(Heart heart) {
//         this.heart = heart;
//     }
    
//     public void humanAlive(){
//         if(heart!=null){
//             Heart.heartBeat();
//         }
//         else{
//             System.out.println("Sorry");
//         }
//     }
// }