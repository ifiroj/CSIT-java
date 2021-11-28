import java.io.*;

class Book implements Serializable
{
	String title;
	String isbn;
	float price;

	transient String password;

	public Book(String t, String i, float p, String pwd)
	{
		title = t;
		isbn = i;
		price = p;
		password = pwd;
	}

	public void printData()
	{
		System.out.println(title);
		System.out.println(isbn);
		System.out.println(price);
		System.out.println(password);
	}

}


public class FileTest2
{
	public void writeToFile(Book b)
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("abc_1.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(b);

			oos.close();
			fos.close();	
		}
		catch(FileNotFoundException f)
		{
			System.out.println("FileNotFoundException");
		}
		catch(IOException e)
		{
			System.out.println("IOException");
		}
		
	}

	public void readFromFile()
	{
		try
		{
			FileInputStream fis = new FileInputStream("abc_1.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);		
			
			System.out.println("Reading....");
			Book b = (Book)ois.readObject();
			b.printData();

			ois.close();
			fis.close();	
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
	}


	public static void main(String[] r)
	{
		FileTest2 f = new FileTest2();

		Book b = new Book("Java Book", "aaaa-333-444", 100.05f, "MyPwd");
		f.writeToFile(b);

		f.readFromFile();
	}

}