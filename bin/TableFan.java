package products.bmc;
import products.electronics.*;
public class TableFan extends Fan{
    String remoteControl; 
    public TableFan(String model,String color,String power,float price,String remoteControl){
        // this.model =model;
        // this.color = color;
        // this.power = power;
        // this.price = price;
        super(model,color,power,price); //calling from parent class
        this.remoteControl =remoteControl;
    }   
    public void printDetail(){
        // System.out.println(model);
        System.out.println(color);
        System.out.println(power);
        // System.out.println(price);
        System.out.println(remoteControl);
    }
}
