import java.util.*;

public class IOTest2
{
	float gpa;

	public IOTest2()
	{

	}

	public void testGPA() throws IllegalArgumentException
	{
		if(gpa < 0.0f || gpa > 4.0f)
		{
			IllegalArgumentException e = new IllegalArgumentException();
			throw e;
		}
	}

	public void getGPA()
	{
		Scanner sc = new Scanner(System.in);

		try
		{
			System.out.println("Enter GPA : ");
			gpa = sc.nextFloat();

			testGPA();

		}
		catch(InputMismatchException e)
		{
			System.out.println("GPA must be a Number");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("valid range for GPA is 0.0 - 4.0");
			gpa = 0.0f;
		}


		System.out.println("GPA : " + gpa);
		
	}


	public static void main(String[] r)
	{
		IOTest2 a = new IOTest2();
		a.getGPA();
	}
}