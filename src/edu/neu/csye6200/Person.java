package edu.neu.csye6200;

public class Person implements Comparable<Person> {
	
	private String ID;
	
	private int age;
	
	private String lastName;
	
	public Person(String iD, int age, String lastName) {
		super();
		ID = iD;
		this.age = age;
		this.lastName = lastName;
	}	

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Person [ID=" + ID + ", age=" + age + ", lastName=" + lastName + "]";
	}


	@Override
	public int compareTo(Person o) {
		return this.ID.compareTo(o.getID());
	}

}
