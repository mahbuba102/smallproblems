package com.homework.exercise2;

public class Employee {
	
	private String name;
	private int id;
	
	public Employee(){
		
		System.out.println("Employe Class Initializing..");
	}
	
	public Employee(String name,int id){
		
		this.name = name;
		this.id = id;
	}
	
	public void display(){
		System.out.println("Name: "+this.name+" "+"Id: "+this.id);
	}
	public static void main(String[] args) {
		Employee employee = new Employee("Mahbuba",27);
		employee.display();
	}

}
