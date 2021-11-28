class Person{
	Address a; // Person has an address (Compostion, not inheritance)

	public Person(){
			a = new Address();
	}

	public void setEmail(String s){
		a.setEmail(s);
	}

	public String getEmail(){
		return a.getEmail();
	}
}

class Student extends Person{

}

class Employee extends Person{

}

class Teacher extends Employee{

}

class Staff extends Employee{

}

class Address{
	Web w;		//Address has a web address (Compostion, not inheritance)
	Physical p;	//Address has a physical address (Compostion, not inheritance)

	public Address(){
		w = new Web();
		p = new Physical();
	}

	public void setEmail(String s){
			w.setEmail(s);
	}

	public String getEmail(){
		return w.getEmail();
	}
}

class Web{
	String email;

	public Web(){
		email = "";
	}

	public void setEmail(String s){
			email = s;
	}

	public String getEmail(){
			return email;
	}
}

class Physical{

}

public class Class4{
	public static void main(String[] args){
		Staff f = new Staff();
		// f.a.w.email = "kfpanda009@gmail.com"; // w/o abstraction
		// System.out.println(f.a.w.email);

		f.setEmail("samirkhadka89@gmail.com");
		System.out.println("Email : " + f.getEmail());
	}
}