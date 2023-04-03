package com.java.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

//List to employe belongs to mumbai
		System.out.println("Hello");
		
		//Employee emp1 = new Employee(1, ", null, 0)
		
		
		List<Employee> empList = new ArrayList<Employee>();
		
		List<Employee> empList1 = empList.stream().filter(emp->emp.getCity().equals("Mumbai")))).collect(Collectors.toList()));
		
		//List<Employee> empList1 = empList.stream().filter(emp->emp.getCity().equals("Mumbai")).summ).collect(Collectors.toList()));
		
 

//.collect(Collectors.toList()));
		
		
	}

	class Employee {
		private int id;
		private String name;
		private String city;
		private float salary;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public float getSalary() {
			return salary;
		}

		public void setSalary(float salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
		}

		public Employee(int id, String name, String city, float salary) {
			super();
			this.id = id;
			this.name = name;
			this.city = city;
			this.salary = salary;
		}

	}

}
