package lec12.ex04;

public class Student {

	private String first;
	private String last;
	
	public Student (String first, String last) {
		this.first = first;
		this.last = last;
	}
	
	public String getFullName() {
		return first + " " + last;
	}
	
}
