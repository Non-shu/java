package com.yedam.inheritance;
/*
 * Data Access Object.
 * 추상클래스 규칙
 * MysqlDao -> register, remove, search
 * OracleDao -> register, remove, search
 * 실행 클래스의 코드수정 최소화 가능. 
 */
public abstract class Dao {
	//등록.
	public abstract void register();
	//삭제.
	public abstract void remove();
	//조회
	public abstract void search();
}
