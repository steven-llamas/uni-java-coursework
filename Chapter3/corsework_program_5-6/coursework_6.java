/*
Module: 3. Inheritance & Polymorphism
Program: 6. Program to demonstrate concept of interfaces
*/

interface salary { void insertsalary (int salary); }  // Interface have variables & methods

// Class 1, Implementing the salary in the SDE1 class
class SDE1 implements salary 
{
	int salary;
	@Override public void insertsalary(int salary) {	this.salary = salary; }
	void printSalary() { System.out.println("SDE1 class salary: " + this.salary); }
}

// Class 2, Implementing the salary inside the SDE2 class
class SDE2 implements salary 
{
	int salary;
	@Override public void insertsalary(int salary)	{  this.salary = salary;	}
	void printSalary() { System.out.println("SDE2 class salary: " + this.salary); }
}

public class Main 
{
	public static void main(String[] args)
	{
		SDE1 obj1 = new SDE1(); // Insert different salaries
		obj1.insertsalary(1000);
		obj1.printSalary();
		
		SDE2 obj2 = new SDE2();
		obj2.insertsalary(2000);
		obj2.printSalary();
	}
}