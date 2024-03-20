package kr.ac.kopo.day10;

public class Employee {
	String name;
	int salary;
	static int empTotal;
	
	Employee() {
		Employee.empTotal++;
	}
	
	Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
		Employee.empTotal++;
	}
	
	void info() {
		System.out.println("사원명 : " + name + ", 연봉 : " + salary + "만원");
	}
	
	static void employeeTotalInfo() {
		System.out.println("총 사원수 : " + empTotal + "명");
	}
}
