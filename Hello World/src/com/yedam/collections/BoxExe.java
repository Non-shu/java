package com.yedam.collections;
class Box<E>{
	E item;
		
	void setItem(E item) {
		this.item = item;
	}
	E getItem() {
		return item;
	}
}


public class BoxExe {
public static void main(String[] args) {
	Box<String> box = new Box<String>();
	box.setItem("오렌지");
	//box.setItem(100);
	
	String result = (String) box.getItem(); // Object -> String 
	System.out.println(result);
}
}
