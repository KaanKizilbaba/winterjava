package day29abstractclass;

public class Runner {

	public static void main(String[] args) {
		
		ElementarySchoolCalculator elStudent = new ElementarySchoolCalculator();
		System.out.println(elStudent.add(2, 3, 4));//9
		
		HighSchoolCalculator hsStudent = new HighSchoolCalculator();
		System.out.println(hsStudent.division(12, 3));//4

	}

}
