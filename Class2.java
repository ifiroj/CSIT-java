class Shape{
	String name;
	public Shape(String name){
		this.name = name;
	}

	void printName(){
		System.out.println("The name is : " + name);
	}
}

// Jun class ma main xa teslai matra public lekhne
class Rectangle extends Shape{
	int l;
	int b;

	public Rectangle(int a,int b,String n){
		super(n);//super keyword le parent class lai point garxa, this le aafailai: can use both as function and as a variable ie super(a) or super.a = a 
		l = a;
		this.b = b;
	}

	int getArea(){
		super.printName();
		return(l*b);
	}


}

class Circle extends Shape{
	float r;


	float getArea(){
		super.printName();
		return (3.14f*r*r);
	}

	void showArea(){
		System.out.println("The circles area is : " + getArea());
	}

	public Circle(float a,String n){
		super(n);
		r = a;
	}
}

public class Class2{ //yema public beacause it has main
	public static void main(String[] args){
		Circle c = new Circle(6.5f,"Circle 1");
		Rectangle r = new Rectangle(5,4,"Rectangle 1");
		float p = c.getArea();
		int q = r.getArea();
		System.out.println("The area of the circle is : " + p);
		System.out.println("The area of the rectangle is : " + q);
	}
}