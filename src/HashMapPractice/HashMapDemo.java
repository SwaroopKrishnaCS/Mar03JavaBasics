package hashMapPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;



public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> employeeList = new HashMap<Integer, String>();

		employeeList.put(101, "Swaroop");
		employeeList.put(102, "Manvir");
		employeeList.put(103, "Ketaki");
		employeeList.put(102, "Sojan");
		employeeList.put(547, "Rajat");
		employeeList.put(106, null);
		employeeList.put(null, "Kamal");

		System.out.println(employeeList.get(102));

		Employee manpreet = new Employee("Manpreet", 1234, 85000, "Dev");
		Employee neelam = new Employee("Neelam", 4567, 84000, "BSA");
		Employee maria = new Employee("Mariya", 4678, 80000, "HR");
		Employee asha = new Employee("Asha", 7890, 83000, "QA");

		List<Employee> technicalDept = new ArrayList<Employee>(Arrays.asList(manpreet,asha));

//		technicalDept.add(manpreet);
//		technicalDept.add(asha);

		List<Employee> businessDept = new ArrayList<Employee>();

		businessDept.add(neelam);
		businessDept.add(maria);

		HashMap<String, List<Employee>> departmentMap = new HashMap<String, List<Employee>>();

		departmentMap.put("Technical", technicalDept);
		departmentMap.put("Business", businessDept);

		// Check if Neelam is present in Business Department

		List<Employee> employeesBusiness = departmentMap.get("Business");

		for (int i = 0; i < employeesBusiness.size(); i++) {
			if (employeesBusiness.get(i).getNameOfEmployee().equals("Neelam")) {
				System.out.println("Neelam is present in Business Dept");
			}
		}

	}

}
