package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class School {
	
	List<Student> studentRoster;
	List<Person> personRoster;
	public School() {
		super();
		studentRoster = new ArrayList<>();
		personRoster = new ArrayList<>();
	}
	
	
	public void addStudentsToStudentRooster(Student student) {
		this.studentRoster.add(student);
	}
	
	public void addStudentsToPersonRooster(Student student) {
		this.personRoster.add(student);
	}
	
	public void sortStudentRooster(School school) {
		System.out.println("\n Student list before sorting");
		school.getStudentRoster().forEach(System.out::println);
		
		System.out.println("\n Student list sorted by ID");
		school.getStudentRoster().sort(null);
		school.getStudentRoster().forEach(System.out::println);
		
		System.out.println("\n Student list sorted by AGE");
		school.getStudentRoster().sort(Comparator.comparing(Student::getAge));
		school.getStudentRoster().forEach(System.out::println);
		
		System.out.println("\n Student list sorted by LAST NAME");
		school.getStudentRoster().sort(Comparator.comparing(Student::getLastName));
		school.getStudentRoster().forEach(System.out::println);
		
		System.out.println("\n Student list sorted by GPA");
		school.getStudentRoster().sort(Comparator.comparing(Student::getGpa));
		school.getStudentRoster().forEach(System.out::println);
		
	}

	
	public void sortPersonRooster(School school) {
		System.out.println("Person list before sorting");
		school.getPersonRoster().forEach(System.out::println);
		
		System.out.println("\n Person list sorted by ID");
		school.getPersonRoster().sort(null);
		school.getPersonRoster().forEach(System.out::println);
		
		System.out.println("\n Person list sorted by AGE");
		school.getPersonRoster().sort(Comparator.comparing(Person::getAge));
		school.getPersonRoster().forEach(System.out::println);
		
		System.out.println("\n Person list sorted by LAST NAMR");
		school.getPersonRoster().sort(Comparator.comparing(Person::getLastName));
		school.getPersonRoster().forEach(System.out::println);
		
		System.out.println("\n Person list sorted by GPA- Will not work");
		// Sorting of the person List is not possible with GPA,as GPA is defined in Student class
		// school.getPersonRoster().sort(Comparator.comparing(Person::getGpa));
		school.getPersonRoster().forEach(System.out::println);
		
	}

	public List<Student> getStudentRoster() {
		return studentRoster;
	}


	public List<Person> getPersonRoster() {
		return personRoster;
	}

	
	public static void demo() {
		School school =new School();
		
		school.addStudentsToPersonRooster(new Student("#4", 23, "Joe", 8.1));
		school.addStudentsToPersonRooster(new Student("#1", 21, "Rob", 4.1));
		school.addStudentsToPersonRooster(new Student("#5", 19, "James", 9.1));
		school.addStudentsToPersonRooster(new Student("#2", 26, "Nikhil", 10));
		school.addStudentsToPersonRooster(new Student("#3", 18, "Prathyush", 8.9));
		
		
		school.addStudentsToStudentRooster(new Student("#8", 17, "Alan", 3.1));
		school.addStudentsToStudentRooster(new Student("#6", 24, "Walker", 3.9));
		school.addStudentsToStudentRooster(new Student("#10", 19, "Ed", 2.1));
		school.addStudentsToStudentRooster(new Student("#7", 26, "Sheran", 2.9));
		school.addStudentsToStudentRooster(new Student("#9", 14, "Jasu", 4));
		
		school.sortPersonRooster(school);
		school.sortStudentRooster(school);


	}
	

}
