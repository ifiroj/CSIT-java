public class Class1{
	int a;
	int b;

	int add(){
		return (a+b);
	}

	public Class1(int p,int q){
		a=p;
		b=q;
	}

	public static void main(String[] args){
		System.out.println("Hello World");
		Class1 c = new Class1(10,20);
		int d = c.add();
		System.out.println( "The sum is " + d );
	}
}

