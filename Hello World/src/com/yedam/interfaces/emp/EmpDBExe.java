package com.yedam.interfaces.emp;

import java.awt.BorderLayout;
import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * EmpDAO(인터페이스)구현하는 클래스.
 */
public class EmpDBExe implements EmpDAO {
	
	Connection getConnect(){
	String url = "jdbc:oracle:thin:@localhost:1521:xe";// 오라클 db의 접속정보.
	String user = "hr";
	String password = "hr";
	Connection conn = null;
	try {
		 conn = DriverManager.getConnection(url, user, password);
		
	}catch (SQLException e) {
		e.printStackTrace();
	} return conn;
	}// end of getConnect().
	@Override
	public boolean registerEmp(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		String qurey = "insert into tbl_employees ";
		qurey += "values("+ emp.getEmpNo() + ","+ emp.getEmpName() + "," + emp.getTelNo() + ","+ emp.getHireDate() + "," + emp.getSalary()+")";		
		try {
			Statement stmt = getConnect().createStatement();
			int r = stmt.executeUpdate(qurey);
			if(r>0) {
				return true;
			}
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean removeEmp(int empNo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> search(Employee emp) {
		List<Employee> empList = new ArrayList<>();
		String qry = "select * from tbl_employees " +"where emp_name = nvl('"+emp.getEmpName()+ "',  emp_name)" 
				+ " order by emp_no";
		try {
		Statement stmt = getConnect().createStatement();
		ResultSet rs = stmt.executeQuery(qry);
		while(rs.next()) {
			Employee empl = new Employee();
			empl.setEmpNo(rs.getInt("emp_no"));
			empl.setEmpName(rs.getString("emp_name"));
			empl.setHireDate(rs.getDate("hire_date"));
			empl.setSalary(rs.getInt("salary"));
			empl.setTelNo(rs.getString("tel_no"));
			
			empList.add(empl);
		}
		} catch (SQLException e) {
			e.printStackTrace();;
		}
		return empList;
	}

}
