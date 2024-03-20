package kr.ac.kopo.day10.extend;

public class Manager04 extends Employee{

	Employee[] empList;
	
	public Manager04() {
	   	super();
	}

	public Manager04(int no, String name, int salary, String grade, Employee[] empList) {
		super(no, name, salary, grade);
		this.empList = empList;
	}
}	