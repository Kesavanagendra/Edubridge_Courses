package geeks_practice;
import java.util.*;
import java.util.Scanner;
class Cuboid {

    int length,width,height;
    public void set_length(int l)
    {
        this.length = l;
    }
    public int get_length()
    {
        return length;
    }
    public void set_width(int w)
    {
        this.width = w;
    }
    public int get_width()
    {
        return width;
    }
    public void set_height(int h)
    {
        this.height = h;
    }
    public int get_height()
    {
        return height;
    }
    public int volume()
    {
        //System.out.println(length*width*height);
        return get_length()*get_width()*get_height();
    }
    public static void main(String[] args) {
        Cuboid obj =new Cuboid();
        obj.set_length(4);
        obj.set_width(3);
        obj.set_height(2);
        System.out.println(obj.volume());
    }
    
}
