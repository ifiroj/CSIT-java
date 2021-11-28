package products.electronics;
public class Fan {
    private String model;
    public String color;
    protected String power;
    float price;//default type access modifier
    
    public Fan(String model,String color,String power,float price){
        this.model=model;
        this.color=color;
        this.power=power;
        this.price=price;
    }
}
// compile package : javac -d . FILENAME.java