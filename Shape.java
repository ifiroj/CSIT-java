class Shape{
	String name;
	public Shape(String name){
		this.name = name;
	}
}

// Jun class ma main xa teslai matra public lekhne
class Rectangle extends Shape{
	int l;
	int b;

	public Rectangle(int a,int b,String n){
		l = a;
		this.b = b;					//super keyword le parent class lai point garxa, this le aafailai: can use both as function and as a variable ie super(a) or super.a = a
		super(n);
	}
}

class Circle extends Shape{
	float r;

	public Circle(float a,String n){
		r = a;
		super(n);
	}
}

public class Class2{ //yema public beacause it has main
	public static void main(String[] args){

	}
}