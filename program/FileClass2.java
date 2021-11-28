import java.io.*;

class Customer implements Serializable{
	String name;
	String address;
	transient String password;

	public Customer(String n,String a,String p){

		name=n;
		address=a;
		password=p;
	}

	public void printData(){
		System.out.println(name);
		System.out.println(address);
		System.out.println(password);

	}
}

public class FileClass2{

	FileOutputStream fos;
	FileInputStream fis;
	ObjectOutputStream oos;
	ObjectInputStream ois;

	public FileClass2(){

	}

	public void writeToFile(Customer s){
		//program to file = output string
		//file to program = input string

		try{

			fos=new FileOutputStream("pqr.txt"); //make file
			oos = new ObjectOutputStream(fos); //connect oos and fos
			oos.writeObject(s);
			fos.close();
			oos.close();
		}
		catch(FileNotFoundException i){

			System.out.println("File not Found");
		}

		catch(IOException i){
				//System.out.println("IO Exception");
			i.printStackTrace(); //exception details for developers
		}

	}

	public void readFromFile(){
		
		try{

			fis=new FileInputStream("pqr.txt"); //make file
			ois = new ObjectInputStream(fis); //connect oos and fos
			
			Customer m = (Customer)ois.readObject();
			m.printData();
			fis.close();
			ois.close();

       }

       catch(FileNotFoundException i){

			System.out.println("File not Found");
		}

		catch(IOException i){
				System.out.println("IO Exception");

		}

		catch(ClassNotFoundException i){
				System.out.println("ClassNotFound Exception");
			}

	}

	public static void main(String args[]){

		FileClass2 f=new FileClass2();

		Customer c = new Customer("samir","Dharan","2222");

		f.writeToFile(c);
		f.readFromFile();

	}
}