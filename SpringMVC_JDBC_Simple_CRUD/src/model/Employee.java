package model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Employee {

	private int id; 
	@NotEmpty(message="ovo polje ne sme biti prazno")//za string vazi jedino notempty,za ove ostale ne moze da se koristi not empty
	@Pattern(regexp="[^0-9]+", message="ime ne sme da sadrzi cifre")
	private String name;  
	
	//@NotNull(message="unesite podatak o zaradi")
	private double salary;  
	
	private String designation;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Employee() {
		super();
	}
	public Employee(int id, String name, double salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	} 
	
	
}
