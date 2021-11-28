package products.electronics;
public class TestFan {
    public static void main(String[] args) {
     Fan f = new Fan("model1","Red","1000W",3000.2f);
    //  System.out.println(f.model);
     System.out.println(f.color);
     System.out.println(f.power);
     System.out.println(f.price);   
    }
}
// run class file : java product.electronics.FILENAME.java