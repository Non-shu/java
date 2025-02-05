package com.yedam.interfaces.emp;
/*
 * 사원번호(1001, 1002)
 * 사원이름 (홍길동, 고길동)
 * 덴와방고(654-1123, 654-3413)
 * 입사일자 ( 2020-02-01)
 * 급여 ( 0 0 0,) 
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private int empNo;
	private String empName;
	private String telNo;
	private Date hireDate;
	private int salary;
	
//생성자
	public Employee() {}
	
	public Employee(int empNo, String empName, String telNo) {
		this.empNo = empNo;
		this.empName = empName;
		this.telNo = telNo;
		this.hireDate = new Date();
		this.salary = 250;
	}
	public Employee(int empNo, String empName, String telNo, String hireDate, int salary) {
		this(empNo, empName, telNo);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			this.hireDate = sdf.parse(hireDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.salary = salary;
		}
	
	// 사번, 이름, 연락처, 급여. 
	public String empInfo() {
		//사 번  이 름    연락처   급 여
		//--------------------------
		//1001  고길동  426-1121  250
		return empNo + " " + empName + "  " +telNo+ "   "  +salary;
	}
	
	
	//getter setter 

	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}


	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public Date getHireDate() {
		return hireDate;
	}
	
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	



	
	
}
