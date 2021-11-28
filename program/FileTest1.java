import java.io.*;

public class FileTest1
{
	public void writeToFile(String s)
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("abc.txt");
			fos.write(s.getBytes());
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
			FileInputStream fis = new FileInputStream("abc.txt");
			int n = fis.available();
			byte[] g = new byte[n];
			fis.read(g);
			System.out.println("Reading....");
			System.out.println(new String(g));
			fis.close();		
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


	public static void main(String[] r)
	{
		FileTest1 f = new FileTest1();
		f.writeToFile("File Write Test....");
		f.readFromFile();
	}

}