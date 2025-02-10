package com.yedam.stream.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseExe {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";// 오라클 db의 접속정보.
		String user = "hr";
		String password = "hr";
		try {
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement stmt = conn.createStatement();
			//추가 (insert)
			//stmt.executeUpdate("insert into tbl_student (student_no, student_name) values('S007','박현수')");
			//수정 (update)
			stmt.executeUpdate("update tbl_student  set phone ='010-8787-6565' where student_no = 'S007'");//박현수의 연락처 010-8787-6565
			/*String query = "'update tbl_student'" + "set phone = '010-8787-6565'" + "'where student_name ='박현수'";			 * 
			 * int r = stmt.excuteUpdate(query);
			 * if(r >0){
			 * 	System.out.println("수정완료.");
			 * }
			 */
			//삭제 (delete)
			String query = "delete from tbl_student " + "where student_name = '박현수'";
			int r= stmt.executeUpdate(query); //처리된 변수 반환 값
			if(r>0) {
				System.out.println("삭제완료");
			}
			
			//조회(select)
			ResultSet rs = stmt.executeQuery("select * from tbl_student");
			// 반복문활용
			while (rs.next()) { // 조회결과가 있으면 true, 마지막데이터 false.
				// 컬럼
				System.out.println(rs.getString("student_no")//
						+ " " + rs.getString("student_name")//
						+ " " + rs.getString("phone")//
						+ " " + rs.getString("address")
				);
			}
			System.out.println("end of data.");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
