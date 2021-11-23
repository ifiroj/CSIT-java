public class Calculator{
	void add(int a,int b){
		System.out.println(a+b);
	}

	void add(float a,float b){
		System.out.println(a+b);
	}

	public static void main(String args[]){
		Calculator c = new Calculator();
		c.add(5,10);
		c.add(5.5f,10.5f);  //FUNCTION OVERLOADING
	}
}