package bmc.shapes;
public class Rectangle{

    int l;
    int w;

    public Rectangle(int l, int w){
        this.l = l;
        this.w = w;
    }

    public int getArea(){
        return l*w;
    }

}