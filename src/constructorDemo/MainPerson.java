package constructorDemo;

public class MainPerson {

	public static void main(String[] args) {

		Student swaroop = new Student("Swaroop",36);
		swaroop.marksObtained = 90;
		swaroop.didStudentPass();
//		Student jobin = new Student();
//		jobin.didStudentPass();
//		swaroop.name = "Swaroop";
//		swaroop.age = 36;
//		swaroop.address = "Brampton";
		Student manvir = new Student("Manvir",35);
//		manvir.name = "Manvir";
//		manvir.age = 35;
//		manvir.address = "Mississauga";
		Student neelam = new Student("Neelam",16);
//		neelam.name = "Neelam";
//		neelam.age = 16;
//		neelam.address = "Scarbrough";
	}

}
