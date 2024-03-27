package practice_edu;

abstract class Shape // Shape ob=new Shape(); //error
{
    int color;
       Shape(){
      }
    // An abstract function
    abstract void draw(); //no body function
   void display(){
          System.out.println("Display method");
   }
}

 class Reactangle extends Shape{
         void draw(){ 
                 System.out.println("Reactangle Drawing");
         }
}
public class MainAbstract {
   public static void main(String args[]){
    // Shape obj = new Reactangle();// here we creating the reference for class .so it can access data of classes(shape,rectangle) 
    // obj.display();
    // obj.draw();

      Reactangle rob=new Reactangle();
          rob.draw();
           rob.display();
        // Shape sob=new Shape();  //--->error because abstract class cannot be instantiated
   }
}