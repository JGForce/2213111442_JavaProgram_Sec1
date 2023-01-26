
public class TestStudent {

	public static void main(String[] args) {
		// Test Constructor and toString()
		Student jirat = new Student("Jirat Gaysorn","1 Happy Ave");
		System.out.println(jirat); //toString()
		
		// Test Setters and Getters
		jirat.setAddress("25 Pattanakarn");
		System.out.println(jirat);//toString()
		System.out.println(jirat.getName());
		System.out.println(jirat.getAddress());
		
		//Test addCoursesGrade(),printGrades() and getAverageGrade()
		jirat.addCourseGrade("INT107",87);
		jirat.addCourseGrade("INT108",81);
		jirat.addCourseGrade("MSC-202",92);
		jirat.printGrades();
		
		System.out.printf("The average grade is %.2f%n", jirat.getAverageGrade());
	}

}
