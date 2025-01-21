package com.yedam;

public class Variable2 {

	public static void main(String[] args) {

		for (int j = 2; j <= 7; j++) {

			int num = j;
			for (int i = 1; i <= 9; i++) {
				System.out.print(num + "*" + i + "=" + num * i + "\n");
				System.out.print("%d * %d = %d\n", num, i, num * i);//
			}
		}
		System.out.println("end of prog");
	}
}