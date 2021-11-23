interface Teacher{ //all function automatically abstract or non implementable, so no need to write abstract on funtion and no class 
	public void teach();
	public void prepareQuestion();
}

class EnglishTeacher implements Teacher{ //inheriting from interface extends -> implements
	public void teach(){
		System.out.println("Teaching english");
	}

	public void prepareQuestion(){
		System.out.println("Preparing english questions");
	}
}

class MathsTeacher implements Teacher{
	public void teach(){
		System.out.println("Teaching maths");
	}

	public void prepareQuestion(){
		System.out.println("Preparing maths questions");
	}
}

public class InterfaceTest{
	public static void main(String[]  args){
		EnglishTeacher e = new EnglishTeacher();
		e.teach();
		e.prepareQuestion();

		MathsTeacher m = new MathsTeacher();
		m.teach();
		m.prepareQuestion();
	}
}