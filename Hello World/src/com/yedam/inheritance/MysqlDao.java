package com.yedam.inheritance;

public class MysqlDao extends Dao{
	
public void register() {
	System.out.println("등록기능");
	}

	public void delete() {
		System.out.println("삭제기능.");
	}

	public void search() {
		System.out.println("조회기능.");
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
}
