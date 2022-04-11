package curso.classes.application.entities;

public class Student {
	public String name;
	public double firstQuarterGrade;
	public double secondQuarterGrade;
	public double thirdQuarterGrade;
	
	public double gradeFinal() {
		return this.firstQuarterGrade + this.secondQuarterGrade + this.thirdQuarterGrade;
	}
	
	public String result() {
		double grade = gradeFinal();
		double min = 60.0;
		if (grade >= min)
			return "PASS";
		else
			return String.format("FAIL%nFALTARAM %.2f PONTOS", min - grade);
	}
}
