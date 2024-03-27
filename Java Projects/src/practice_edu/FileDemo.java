package practice_edu;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;


//-------------------------File creation and file writing------------------------------------------------


public class FileDemo {
    public static void main(String[] args) throws IOException {
        File obj = new File("C:\\Users\\kesava nagendra\\OneDrive\\Documents\\Demofile\\first.txt");//--File creation

        FileWriter writerobj = new FileWriter(obj); //--Writing the txt in to the file.
        writerobj.write("Hi, this is my first file created by me.");
        
        writerobj.close();
        
        if(obj.createNewFile()){
            System.out.println("file crerated");
        } 
        else    
            System.out.println("not created");    
        
    }
}




//---------------------File Reading---------------------------------------------

// public class FileDemo {
//     public static void main(String[] args) throws IOException {
//         File obj = new File("C:\\Users\\kesava nagendra\\OneDrive\\Documents\\Demofile\\first.txt");//--File creation

//         Scanner sc = new Scanner(obj);
        
//        while(sc.hasNextLine()){
//         String res = sc.nextLine();
//         System.out.println(res);
//        }
            
        
//     }
// }



//--------------------Another method for file Writing-----------------------------------

// public class FileDemo {
//     public static void main(String[] args) throws IOException {
//         File obj = new File("C:\\Users\\kesava nagendra\\OneDrive\\Documents\\Demofile\\first.txt");

//         OutputStream os = new FileOutputStream(obj);
//         os.write(70);
//         os.write(65);
//         os.write(78);
//         os.close();
//         System.out.println("Successfully writting in file");
//     }
// }