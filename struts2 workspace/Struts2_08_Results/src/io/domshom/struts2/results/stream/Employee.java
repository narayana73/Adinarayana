package io.domshom.struts2.results.stream;

public class Employee {
	private String id, name, designation, department;

	public Employee() {
	}

	public Employee(String id, String name, String designation,
			String department) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.department = department;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation="
				+ designation + ", department=" + department + "]";
	}

}