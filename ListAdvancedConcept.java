package com.csi.collectionrevision;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	private int empId;

	private String empName;

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

}

public class ListAdvancedConcept {
	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee(121, "SWARA"));
		empList.add(new Employee(122, "BINU"));
		empList.add(new Employee(125, "MANI"));
		//empList.remove(1);
		// System.out.println(empList.size());

		/*long empCount = empList.stream().collect(Collectors.counting());
		System.out.println("\n Employee Count: "+ empCount);*/
		
		
		for(Employee e1: empList)
		{
			//empList.remove(1);
			System.out.println(e1);
		}
	}
}
