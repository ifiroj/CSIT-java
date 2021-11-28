class OuterClass
{
	String o;
	public OuterClass(String o)
	{
		this.o = o;
	}

	public void printO()
	{
		System.out.println(o);

		InnerClass ic = new InnerClass("INNER");
		ic.printI();
	}


	class InnerClass
	{
		String i;
		public InnerClass(String i)
		{
			this.i = i;
		}

		public void printI()
		{
			System.out.println(i);
		}
	}
}


public class InnerClassTest
{
	public static void main(String[] r)
	{
		OuterClass oc = new OuterClass("OUTER");
		oc.printO();
	}
}