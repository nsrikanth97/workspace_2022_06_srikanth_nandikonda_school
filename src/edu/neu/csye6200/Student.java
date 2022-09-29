package edu.neu.csye6200;

public class Student extends Person{

	private double gpa;

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public Student(String iD, int age, String lastName, double gpa) {
		super(iD, age, lastName);
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [gpa=" + gpa + ", ID=" + getID() + ", Age=" + getAge() + ", Lastname()="
				+ getLastName() + "]";
	}	


	
	
	
	
}
