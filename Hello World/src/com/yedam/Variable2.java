package com.yedam;

public class Variable2 {

	public static void main(String[] args) {

		for (int j = 1; j <= 9; j++) {
			for (int i = 2; i <= 9; i++) {
//				System.out.print(num + "*" + i + "=" + num * i);
				System.out.printf("%d * %d = %2d ", i, j, i * j);//
			}
			System.out.println();
		}
		System.out.println("end of prog");
	}
}