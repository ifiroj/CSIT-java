public class StaticTest{
	static int a;

	public static void main(String args[]){
		StaticTest s1 = new StaticTest();
		StaticTest s2 = new StaticTest();
		StaticTest s3 = new StaticTest();

		s1.a = 10;
		s2.a = 20;
		s3.a = 30;

		s2.a = 50;
		System.out.println(s1.a);
		System.out.println(s2.a);
		System.out.println(s3.a);
	}
}