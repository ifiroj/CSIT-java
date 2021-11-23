final class Person{
	String name;

	public Person(String a){
		name = a;
	}

	final void printDetail(){
		System.out.println("Name : " + name);
	}
}

class Student extends Person{
	int roll;

	public Student(int r,String n){
		super(n);
		roll = r;
	}

	void printDetail(){
		super.printDetail();  //FUNCTION OVERRIDING
		System.out.println("Roll : " + roll);
	}
}

public class Class3{
	public static void main(String args[]){
		Student s = new Student(1,"Samir");
		s.printDetail();
	}
}