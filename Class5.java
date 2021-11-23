class OuterClass{
	int o;
	public OuterClass(int i){
		o=i;
		InnerClass b = new InnerClass(20);
		System.out.println(b.i);
	}
	class InnerClass{
	int i;
	public InnerClass(int a){
		i=a;
	}

  }

}



public class Class5{

	public static void main(String args[]){
			OuterClass a = new OuterClass(10);
			System.out.println(a.o);

			//InnerClass b = new InnerClass(20);
			//System.out.println(b.i);


	}

}