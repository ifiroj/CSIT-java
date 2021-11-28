interface Calculator
{
	public void add();
	public void subtract();
}

class IntegerCalculator implements Calculator
{
	int a, b;

	public IntegerCalculator(int a, int b)
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


class DecimalCalculator implements Calculator
{
	float a, b;

	public DecimalCalculator(float a, float b)
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


class ImaginaryCalculator implements Calculator
{
	int[] a; // c + id
	int[] b; // p + iq

	public ImaginaryCalculator(int[] a, int b[])
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


public class CalculatorTest
{
	public static void main(String[] r)
	{
		IntegerCalculator i = new IntegerCalculator(10, 20);
		i.add();
		i.subtract();

		DecimalCalculator d = new DecimalCalculator(10.5f, 20.2f);
		d.add();
		d.subtract();


		int[] p = {4,5};//4 + i5
		int[] q = {40,50};//40 + i50

		ImaginaryCalculator im = new ImaginaryCalculator(p, q);
		im.add();
		im.subtract();

	}
}















