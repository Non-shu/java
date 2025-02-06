package com.yedam.interfaces.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.yedam.reference.Board;

/*
 * 배열활용. 
 */
public class EmpAryExe implements EmpDAO {

	Employee[] employees = new Employee[10];// 저장
	// 생성자

	public EmpAryExe() {
		// 초기값.
		employees[0] = new Employee(1001, "홍길동", "432-1234");
		employees[1] = new Employee(1011, "고길동", "435-1134");
		employees[2] = new Employee(1002, "홍준식", "432-2214");
		employees[3] = new Employee(1000, "박사장", "333-1114", "2000-01-01", 800);

	}

	@Override
	public boolean registerEmp(Employee emp) {
		for (int i = 0; i < employees.length; i++) {
			// 빈공간에 추가
			if (employees[i] == null) {
				employees[i] = emp;
				System.out.println("등록완료");
				return true;
				// 한건만 등록.
			}
		}
		return false; // 등록불가.
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < employees.length; i++) {
			// 사원번호 비교
			if (employees[i] != null && employees[i].getEmpNo() == emp.getEmpNo()) {
				// 연락처값이 "" 이 아닐 때 변경
				if (!emp.getTelNo().equals("")) {
					employees[i].setTelNo(emp.getTelNo());
				}
				try {
					// 값을 변경하지않으려고 엔터("")일 경우 1900-01-01
					if (!emp.getHireDate().equals(sdf.parse("1900-01-01"))) {
						employees[i].setHireDate(emp.getHireDate());
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
				if (emp.getSalary() != 0) {
					employees[i].setSalary(emp.getSalary());
				}
				return true; // 정상수정.
			}
		}
		return false; // 수정못함.
	}

	@Override
	public boolean removeEmp(int empNo) {
		for(int i = 0; i < employees.length;i++) {
			if(employees[i] != null && employees[i].getEmpNo()==empNo) {
				employees[i] = null;//삭제
				return true;
			}
		}
		return false;
	}

	@Override
	public Employee[] search(Employee emp) {
		Employee[] result = new Employee[10];
		int idx = 0;
		String name = emp.getEmpName();
		
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null && employees[i].getEmpName().indexOf(name)> -1) {
				result[idx] = employees[i];
				idx++;
			}
		}
		return result;
	}

}
