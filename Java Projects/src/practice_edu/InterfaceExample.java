package practice_edu;
interface Writer{
    String write = null;

    void show();
}
class pen implements Writer{
    public void show(){
        System.out.println("Iam a pen");
    }
}
class pencil implements Writer{
    public void show(){
        System.out.println("Iam a pencil");
    }

}
class Dem{
    void doSomething(Writer p){
        p.show();
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        // pen p = new pen();
        // pencil pc = new pencil();

        //---or--//

        Writer p = new pen();
        Writer pc = new pencil();

        Dem k= new Dem();
        k.doSomething(p);
    }
}
