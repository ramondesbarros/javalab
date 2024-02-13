package br.com.javalab.testsclass;

public class Type {


	public Type() {

	}

	
	public Type(String name, String number) {

		super();
		this.name = name;
		this.number = number;
	}
	
	private String name;
	private String number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Type [name=" + name + ", number=" + number + ", getName()=" + getName() + ", getNumber()=" + getNumber()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
