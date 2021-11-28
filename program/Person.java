public class Address
{
	String house_number;
	int country_code;
	int district_code;

}


public class Person extends Address
{
	String name;
	String email;	

}


public class Student extends Person
{
	int roll;
}

public class Teacher extends Person
{
	int staff_id;
}
