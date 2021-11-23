abstract class CalculatorA
{
	String name;

	public void add();
	public void subtract();

	public void printName()
	{
		System.out.println(name);
	}
}


class IntegerCalculatorA extends CalculatorA
{
	int a, b;

	public IntegerCalculatorA(int a, int b)
	{
		this.a = a;
		this.b = b;
	}	


	public void subtract()
	{
		System.out.println(a-b);
	}

	public void add()
	{
		System.out.println(a+b);
	}
}


class DecimalCalculatorA extends CalculatorA
{
	float a, b;

	public DecimalCalculatorA(float a, float b)
	{
		this.a = a;
		this.b = b;
	}	


	public void subtract()
	{
		System.out.println(a-b);
	}

	public void add()
	{
		System.out.println(a+b);
	}
}


class ImaginaryCalculatorA extends CalculatorA
{
	int[] a; // c + id
	int[] b; // p + iq

	public ImaginaryCalculatorA(int[] a, int b[])
	{
		this.a = a;
		this.b = b;
	}

	public void subtract()
	{
		int r = a[0] - b[0];
		int i = a[1] - b[1];

		System.out.println(r + " + i " + i);
	}

	public void add()
	{
		int r = a[0] + b[0];
		int i = a[1] + b[1];

		System.out.println(r + " + i " + i);
	}

}


public class CalculatorAbstract
{
	public static void main(String[] r)
	{
		IntegerCalculatorA i = new IntegerCalculatorA(10, 20);
		i.add();
		i.subtract();

		DecimalCalculatorA d = new DecimalCalculatorA(10.5f, 20.2f);
		d.add();
		d.subtract();


		int[] p = {4,5};//4 + i5
		int[] q = {40,50};//40 + i50

		ImaginaryCalculatorA im = new ImaginaryCalculatorA(p, q);
		im.add();
		im.subtract();

	}
}















