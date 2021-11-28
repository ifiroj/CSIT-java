import java.io.*;

public class FileClass1{

	FileOutputStream fos;
	FileInputStream fis;

	public FileClass1(){

	}

	public void writeToFile(String s){
		//program to file = output string
		//file to program = input string

		try{

		fos=new FileOutputStream("abc.txt");
		fos.write(s.getBytes());
		fos.close();
		}
		catch(FileNotFoundException i){

			System.out.println("File not Found");
		}

		catch(IOException i){
				System.out.println("IO Exception");
		}

	}

	public void readFromFile(){
		
		try{

		fis = new FileInputStream("abc.txt");
		int n=fis.available();
		byte[] d = new byte[n]; //array yesari banauxa
		fis.read();
		System.out.println(new String(d));
		fis.close();

       }

       catch(FileNotFoundException i){

			System.out.println("File not Found");
		}

		catch(IOException i){
				System.out.println("IO Exception");
		}

	}

	public static void main(String args[]){

		FileClass1 f=new FileClass1();
		f.writeToFile("Hello");
		f.readFromFile();

	}
}