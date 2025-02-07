package com.yedam.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExe {
public static void main(String[] args) {
	Set<String> set = new HashSet<String>();
	
	set.add("홍길동");
	set.add("반갑습니다");
	set.add("1000");
	set.add(String.valueOf(true));
	set.add("홍길동");
	
	Iterator<String> iter = set.iterator(); // 반복자
	while (iter.hasNext()) { // 컬렉션에 요소있는지 확인.
		String result = iter.next(); //컬렉션의 요소를 반환
		System.out.println(result);
	}
	
	for(String str : set) {//향상된 for구문
		System.out.println(str);
	}
}
}
