import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;
import java.util.*;

public class TestApplet extends Applet{
    

    public TestApplet(){
        System.out.println("in constructor");
    }
    public void init(){
        System.out.println("in init");
    }

    public void start(){
        System.out.println("in start");
    }

    public void stop(){
        System.out.println("in stop");
    }
    public void destroy(){
        System.out.println("in destroy");
    }
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(100,100,100,100);
    }    
    
    
}
