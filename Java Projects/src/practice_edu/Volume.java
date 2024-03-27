package practice_edu;


class Volumedup{
    double volumeCal(double r){
        System.out.println("sphere");
        return (double)4/3*(3.14)*Math.pow(r,3);
    }
    double volumeCal(double r, double h){
        System.out.println("rect");
        return (3.14)*Math.pow(r,2)*h;
    }
    double volumeCal(double l,double b ,double h){
        System.out.println("cylinder");
        return l*b*h;
    }
}
public class Volume {
    public static void main(String[] args) {
        Volumedup obj = new Volumedup();
        //   double res = obj.volumeCal(10);
        // double res = obj.volumeCal(10, 20);
        double res = obj.volumeCal(5, 5, 10);

        System.out.println(res);
     
    }
}
