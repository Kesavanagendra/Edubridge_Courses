/*Prgogram of deadlock occurs.*/

package practice_edu;

public class TestDeadlockExample1 {  
    public static void main(String[] args) {  
        final String resource1 = "ratan jaiswal";  
        final String resource2 = "vimal jaiswal";  
        
        Thread t1 = new Thread() {  
        public void run() {  
                synchronized (resource1)   // t1 tries to lock resource1 then resource2 
                {
                    System.out.println("Thread 1: locked resource 1");  
            
                        try{ 
                            Thread.sleep(100);
                        } 
                        catch(Exception e){}  
            
                        synchronized (resource2) {  
                            System.out.println("Thread 1: locked resource 2");  
                        }  
                }  
            }  
        };  
    
        
        Thread t2 = new Thread() {  
            public void run(){  
                synchronized (resource2)// t2 tries to lock resource2 then resource1
                {  
                    System.out.println("Thread 2: locked resource 2"); 
        
                    try
                    { 
                        Thread.sleep(100);
                    }
                    catch (Exception e) {}  
        
                    synchronized (resource1)
                    {  
                    System.out.println("Thread 2: locked resource 1");  
                    }  
                }  
            }  
        }; 

        t1.start();  
        t2.start();  
    }  
}   







/*Program to solve the Deadlock occurs. by re-order the statements where the code is accessing shared resources.*/



// package practice_edu;

// public class TestDeadlockExample1 {  
//     public static void main(String[] args) {  
//         final String resource1 = "ratan jaiswal";  
//         final String resource2 = "vimal jaiswal";  
//         Thread t1 = new Thread(){  
//             public void run(){  
//                 synchronized (resource1)// Thread-1 have resource1 but need resource2 also 
//                 {  
//                     System.out.println("Thread 1: locked resource 1");  
//                     try{ 
//                         Thread.sleep(100);
//                     } 
//                     catch(Exception e) {}  
                
//                     synchronized (resource2){  
//                         System.out.println("Thread 1: locked resource 2");  
//                     }  
//                 }  
//             }  
//         };  
    
//         Thread t2 = new Thread(){  
//             public void run(){  
//                 synchronized (resource1){ // Thread-2 have resource2 but need resource1 also 
//                     System.out.println("Thread 2: locked resource 1"); 
    
//                     try{
//                         Thread.sleep(100);
//                     } 
//                     catch (Exception e) {}  
    
//                     synchronized (resource2){  
//                         System.out.println("Thread 2: locked resource 2");
//                     }  
//                 }  
//             }  
//         };  

//         t1.start();  
//         t2.start();  
//     }  
// }   
