public class Student
{
	int roll;
	String name;

	void printDetails()
	{
		System.out.println(name);
		System.out.println(roll);
	}

	public static void main(String[] args)
	{
		System.out.println("Hello World.....");

		Student s = new Student();
		s.roll = 25;
		s.name = "Ram";

		s.printDetails();

	}

}
