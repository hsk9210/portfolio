package org.hsk9210.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="ADDRESS",
	uniqueConstraints={@UniqueConstraint(columnNames={"EMP_ID"})})
public class Address {
	private int empId;
	private String addressLine1;
	private String zipCode;
	private String city;
	private Employee employee;

	@Id
	@Column(name="EMP_ID")
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Column(name="ADDRESS_LINE1")
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	@Column(name="ZIPCODE")
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Column(name="CITY")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@OneToOne
	@PrimaryKeyJoinColumn
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Address [empId=" + empId + ", addressLine1="
				+ addressLine1 + ", zipCode=" + zipCode + ", city=" + city
				+ "]";
	}
}
