package com.test.tucm.algorithm.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 
 * 设某银行有A、B两个业务窗口，且处理业务的速度不一样， 其中A窗口处理速度是B窗口的2倍---即当A窗口处理完2个顾客时，
 * B窗口处理完一个顾客。给定到达银行的顾客序列，请按业务完成的顺序输出顾客序列。
 * 假定不考虑顾客先后到达的时间间隔，并且当不同窗口同时处理完2个顾客时，A窗口顾客优先输出。
 * 
 */
public class Test3 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextInt()) {
			int n = cin.nextInt();
			Queue<Integer> a = new LinkedList<>();
			Queue<Integer> b = new LinkedList<>();
			if (n > 1000) {
				cin.nextLine();
				continue;
			}

			for (int i = 0; i < n; i++) {
				int num = cin.nextInt();
				if (num % 2 == 1)
					a.offer(num);
				else if (num % 2 == 0)
					b.offer(num);

			}

			int flag = 0;
			while (!a.isEmpty() || !b.isEmpty()) {
				if (!a.isEmpty()) {
					if (flag == 0) {
						System.out.print(a.poll());
						flag = 1;
					} else {
						System.out.print(" " + a.poll());
					}
				}
				if (!a.isEmpty()) {
					System.out.print(" " + a.poll());
				}
				if (!b.isEmpty()) {
					if (flag == 0) {
						System.out.print(b.poll());
						flag = 1;
					} else {
						System.out.print(" " + b.poll());
					}
				}
			}
		}

	}

}
