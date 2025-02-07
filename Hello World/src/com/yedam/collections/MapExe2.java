package com.yedam.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExe2 {
	public static void main(String[] args) {
		// map컬렉션
		Map<Integer, Person> family = new HashMap<Integer, Person>();
		family.put(01, new Person("홍길동", 45, "낚시"));
		family.put(02, new Person("최지수", 40, "독서"));
		family.put(03, new Person("홍석이", 13, "게임"));
		family.put(04, new Person("홍영서", 11, "유튜브"));
		
		Person result = family.get(02);
		System.out.println(result.getName()+","+result.getAge()+","+result.getHobby());
			
	}

}
