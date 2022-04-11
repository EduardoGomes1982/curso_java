package curso.classes.application;

import java.util.Locale;
import java.util.Scanner;

import curso.classes.application.entities.Student;

public class StudentProgram {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();
		student.name = sc.nextLine();
		student.firstQuarterGrade = sc.nextDouble();
		student.secondQuarterGrade = sc.nextDouble();
		student.thirdQuarterGrade = sc.nextDouble();
		System.out.printf("NOTA FINAL: %.2f%n", student.gradeFinal());
		System.out.println(student.result());
		sc.close();
	}
}
