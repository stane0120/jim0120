package kr.ac.kopo.day10.extend;

public class Manager03 extends Employee{

	Employee[] empList;

	Manager03() {

	}

	Manager03(int no, String name, int salary, String grade, Employee[] empList) {
		super(no, name, salary, grade);
		this.empList = empList;
	}
	
	void info() {
		System.out.println("사원번호 : " + no + ", 사원명 : " + name + ", 연봉 : " + salary + "만원, 직급 : " + grade);
		System.out.println("-----------------------------------------------------");
		System.out.println("\t< 관리사원 리스트 >");
		System.out.println("-----------------------------------------------------");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("-----------------------------------------------------");
	}
}
