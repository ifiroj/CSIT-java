import java.util.*;

public class ExceptionTest{
	public ExceptionTest(){

	}
 
	public void checkZero(float m) throws IllegalArgumentException
	{
		if(m==0){
			throw new IllegalArgumentException();
		}
	}

	public void divide(){
		Scanner sc = new Scanner(System.in);				
		try{
			System.out.println("Input numerator : ");
			float a = sc.nextFloat();	//scanf, system.in le keyboard ko input linxa
			System.out.println("Input denominator : ");
			float  b = sc.nextFloat();
			checkZero(b);
			float c = a/b;
			System.out.println(c);
			}
			catch(InputMismatchException i){
				System.out.println("Input must be numbers");
			}
			catch(IllegalArgumentException i){
				System.out.println("Denominator cannot be 0");
			}
			finally{
				System.out.println("Exiting the program");
			}
	}

	public static void main(String[] args){
			ExceptionTest e = new ExceptionTest();
			e.divide();
	}
}

// catch(Exception e){} Exam ma lekhda hunxa
