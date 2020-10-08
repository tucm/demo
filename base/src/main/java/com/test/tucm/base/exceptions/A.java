package com.test.tucm.base.exceptions;

/**
 * "|" 可以当作逻辑或用。
 * 
 * @Author owl
 * @Date 2020-06-14 17:08
 * @Version 1.0
 **/
public class A {
	public static void main(String[] args) {

		int a = 8;

		try {
			if (a == 10) {
				throw new NullPointerException("cc");
			} else if (a == 9) {
				throw new ArithmeticException("aa");
			} else {
				throw new ArrayIndexOutOfBoundsException("dd");
			}
		} catch (NullPointerException | ArithmeticException e) {
			System.out.println("|语句生成");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("总异常");
			e.printStackTrace();
		}

	}
}
