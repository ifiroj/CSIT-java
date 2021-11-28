class Shape
{
	final float PI = 3.14f;
}

public class Circle extends Shape
{
	float r;

	public Circle(float r)
	{
		this.r = r;
	}

	public void printArea()
	{
		//PI = 5.5f;
		System.out.println(PI * r * r);
	}

	public static void main(String a[])
	{
		Circle c1 = new Circle(12.5f);
		c1.printArea();
	}
}