class MathConstants{
	//static float pi = 3.14f;  //Static variable lai use garna object banaunu pardaina
	final float pi = 3.14f;  //value change garna paidaina program vari, function overriding garna paidaina ani inheritance garna paidaina

}

class Circle{
	float r; 

	public Circle(float a){
		r = a;
	}

	void printArea(){
		System.out.println(MathConstants.pi* r * r);
	}

}

public class TestFinal{
	public static void main(String args[]){
		Circle c = new Circle(4.6f);
		c.printArea();
	}
}