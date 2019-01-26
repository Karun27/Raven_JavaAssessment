package Collections_Employee;

import java.util.ArrayList;
import java.util.Collections;

public class Employee_Main {

	public static void main(String args[]) {

		Employee_Collections emp_1 = new Employee_Collections(1,21,"MKBHD");
		Employee_Collections emp_2 = new Employee_Collections(2,18,"Logan Paul");
		Employee_Collections emp_3 = new Employee_Collections(3,35,"Casey Neistat");
		ArrayList<Employee_Collections> main = new ArrayList<Employee_Collections>();
		main.add(emp_1);
		main.add(emp_2);
		main.add(emp_3);
		main.sort(emp_1.getId());
	}
}

