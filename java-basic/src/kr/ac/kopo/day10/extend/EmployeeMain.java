package kr.ac.kopo.day10.extend;

public class EmployeeMain {
	public static void main(String[] args) {
		
		Employee e = new Employee(1, "홍길동", 3_200, "사원");
		Employee e2 = new Employee(2, "강길동", 3_500, "사원");
		Employee e3 = new Employee(3, "고길동", 4_000, "대리");
		Employee e4 = new Employee(4, "윤길동", 5_000, "과장");
		
		e.info();
		e2.info();
		e3.info();
		e4.info();
		
		Employee[] empList = {e, e2, e4};
		Manager m = new Manager(1000, "나최고", 9_000, "부장", empList);
		m.info();
	}
}
