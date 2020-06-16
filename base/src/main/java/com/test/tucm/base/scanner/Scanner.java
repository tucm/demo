package com.test.tucm.base.scanner;

/**
 * @ClassName Scanner
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-01 21:39
 * @Version 1.0
 **/
public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("请输入文字：");
        //scanner.hasNext()会造成线程阻塞
        while (scanner.hasNext()) {
            System.out.println("输入的文字为：" + scanner.nextLine());
        }
    }
}
