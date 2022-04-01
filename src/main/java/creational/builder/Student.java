package creational.builder;

import java.security.InvalidParameterException;

public class Student {
	
	private String name;
	
	private int age;
	
	public static StudentBuilder getBuilder() {
		return new StudentBuilder();
	}
	
	public static class StudentBuilder {
		private Student student;
		
		public StudentBuilder setName(String name) {
			student.name = name;
			return this;
		}
		
		public StudentBuilder setAge(int age) {
			student.age = age;
			return this;
		}
		
		public Student build() {
			//validations
			if(student.name == null) throw new NullPointerException();
			if(student.age < 18) throw new InvalidParameterException();
			return clone(student);
			
		}
		
		public Student clone(Student st) {
			Student student = new Student();
			student.name = st.name;
			student.age = st.age;
			return student;
		}
	}

}
