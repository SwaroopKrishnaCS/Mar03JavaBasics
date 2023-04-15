package constructorDemo;

public class Student {

	String name;
	int age;
	int marksObtained;

	Student(String studentName, int studentAge) {
		name = studentName;
		age = studentAge;
	}

	void didStudentPass() {
		if (marksObtained >= 60) {
			System.out.println(name + " is passed");
		} else {
			System.out.println(name + " is failed");
		}
	}

	Student() {

	}
}
