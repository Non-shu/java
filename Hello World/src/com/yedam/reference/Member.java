package com.yedam.reference;

import java.util.Date;

/*
 *  ID, PW, Name
 */

public class Member {
	//필드
	private String memberId;
	private String password;
	private String memberName;
	private Date writeDate;
	//생성자
	public Member(String id, String password, String memberName, Date writeDate) {
		super();
		this.memberId = id;
		this.password = password;
		this.memberName = memberName;
		this.writeDate = writeDate;
	}
	//메서드
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String id) {
		this.memberId = id;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public Date getWriteDate(Date writeDate) {
		return writeDate;
	}
	
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}



}
