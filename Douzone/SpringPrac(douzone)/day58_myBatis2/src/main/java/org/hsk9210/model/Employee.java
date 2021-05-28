package org.hsk9210.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="EMPLOYEE",
	uniqueConstraints={@UniqueConstraint(columnNames={"EMP_ID"})})
public class Employee {
	private int empId;
	private String empName;
	private int empSalary;
	private Address address;

	@Id
	@Column(name="EMP_ID", nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Column(name="EMP_NAME", length=20, nullable=false)
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Column(name="EMP_SALARY", nullable=false)
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	@OneToOne(mappedBy="employee")
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName="
				+ empName + ", empSalary=" + empSalary + "]";
	}
}
