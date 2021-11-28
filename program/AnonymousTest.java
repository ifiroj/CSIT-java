abstract class Shape{ //abstract class ko object bandaina
	String name;

	public void printName(){
		System.out.println(name);
	}

	public abstract void printArea(float[] d); //abstract method yesari declare garne

}

// class Square extends Shape{
// 	public void printArea(float[] d){
// 		printName();
// 		System.out.println(d[0] * d[0]);
// 	}
// }

// class Circle extends Shape{
// 	public void printArea(float[] d){
// 		printName();
// 		System.out.println(3.14f * d[0] * d[0]);
// 	}
// }

// class Rectangle extends Shape{
// 	public void printArea(float[] d){
// 		printName();
// 		System.out.println(d[0] * d[1]);
// 	}
// }

public class AnonymousTest{
	public static void main(String[] args){
		Shape c = new Shape(){	//creating functions of anonymous class circle w/o the class circle
			public void printArea(float[] d){
			printName();
			System.out.println(3.14f * d[0] * d[0]);
			}
		};
		c.name = "Circle1";
		float[] a = {3.5f};
		c.printArea(a);

		Shape r = new Shape(){	//creating functions of anonymous class rectangle w/o the class rectangle
			public void printArea(float[] d){
			printName();
			System.out.println(d[0] * d[1]);
			}
		};
		r.name = "Rectangle1";
		float[] b = {5.7f,4.9f};
		r.printArea(b);

		// Square s = new Square();
		// s.name = "Square1";
		// float[] d = {6.6f};
		// s.printArea(d);
	}
}