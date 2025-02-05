package com.yedam.interfaces.emp;

/*
 * 배열활용. 
 */
public class EmpAryExe implements EmpDAO{

	Employee[] employees = new Employee[10];//저장
	//생성자
	public EmpAryExe() {
		//초기값.
		employees[0]=new Employee(1001, "홍길동", "432-1234");
		employees[1]=new Employee(1011, "고길동", "435-1134");
		employees[2]=new Employee(1002, "홍준식", "432-2214");
		employees[3]=new Employee(1000, "박사장", "333-1114","2000-01-01", 800);
		

	}
	@Override
	public boolean registerEmp(Employee emp) {
		return false;	
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		return false; 
	}

	@Override
	public boolean removeEmp(int empNo) {
		return false;
	}

	@Override
	public Employee[] search(Employee emp) {
		Employee[] result = new Employee[10];
		int idx=0;
		String name = emp.getEmpName();			
		for(int i = 0; i< employees.length;i++) {	
			 if(employees[i] != null && employees[i].getEmpName().equals(name)) {
				result[idx] = employees[i];
				idx++;
			}
		}
		return result;
	}

}
