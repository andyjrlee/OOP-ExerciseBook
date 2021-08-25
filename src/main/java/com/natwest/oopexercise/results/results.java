package com.natwest.oopexercise.results;

public class results {
	
	public static void main(String[] args) {
	System.out.println("Exam Results Below");
	System.out.println("Physics Results - " + Physics(150));
	System.out.println("Chemistry Results - " + Chemistry(150));
	System.out.println("Biology Results - " + Biology(150));
	System.out.println("Total Exam Score - " + TotalExam(150,150,150));
	examPercentage(90,90,90);
	
		//int Physics;
		//int Chemistry;
		//int Biology;
		//int totalExam;
		//double examPercentage;
	}
	
	public static int Physics(int number1) {
		return number1;
	}
	public static int Chemistry(int number1) {
		return number1;
	}
	
	public static int Biology(int number1) {
		return number1;
	}
	
	public static int TotalExam(int number1, int number2, int number3) {
		int ans = number1 + number2 + number3;
		return ans;
	}
	
	public static void examPercentage (double number1, double number2, double number3) {
		if (((number1 + number2 + number3) / 450 * 100) >= 60.0) {
			double result = (((number1 + number2 + number3) / 450) * 100);
			System.out.println(result);
		} else {
			System.out.println("Fail");}
		}
	
	

//	Expand the Results class so that there is now a pass mark of 60%; 
//	if the person receives under 60% they get a fail message.
}

// Expand the previous example so that even if the person gets higher 
//than 60% overall, if they fail 1 or more of the exams 
//(pass grade of 60% for each exam) they still fail overall.
//eg. if a student's scores were: Biology: 150, Chemistry: 150, Physics: 84
//they would have an overall grade of 85.3% (Pass)
//but in this case the student would fail because their physics grade is 54% (Fail)