import java.io.Serializable;

public class Book implements Serializable{
    String title;
    String isbn;
    transient float price;

    public Book(String title,String isbn,float price){
        this.title=title;
        this.isbn=isbn;
        this.price=price;
    }
    public void printDetail(){
        System.out.println(title);
        System.out.println(isbn);
        System.out.println(price);
    }
}
