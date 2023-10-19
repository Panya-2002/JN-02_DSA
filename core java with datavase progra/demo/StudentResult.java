package com.tns.demo;

public class StudentResult extends Student {
	String grade;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		//name - protected accessible within subclass def within same package
		//per - default accessible within subclass def within same package
		return "StudentResult [grade=" + grade + ", name=" + name + ", per=" + per + ", Id="+getId()+"]";
	}

	public StudentResult() {
		super();

	}

	public StudentResult(int id, String name, float per) {
		super(id, name, per);
		if (super.per >= 90)
			grade = "O";
		else if (super.per >= 80)
			grade = "A+";
		else if (super.per >= 70)
			grade = "A";
		else if (super.per >= 60)
			grade = "B+";
		else if (super.per >= 55)
			grade = "B";
		else if (super.per >= 50)
			grade = "C+";
		else if (per >= 40)
			grade = "C";
		else
			grade = "F";
	}

}
