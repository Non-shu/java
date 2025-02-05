package com.yedam.interfaces;

public class Radio implements RemoteControl {
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("라디오의 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("라디오의 전원을 끕니다.");
	}
}
