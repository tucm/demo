package com.test.tucm.base.scanner;

/**
 * @ClassName Scanner
 * @Description nextLine()以回车键为结束符，返回回车键之前的数据
 * nextInt()只会读取数值，剩下"\n"还没有读取
 * next()以空格为结束符，返回空格之前的数据（不会包含空格）
 * @Author TUCM
 * @Date 2020-03-01 21:39
 * @Version 1.0
 **/
public class Scanner {


    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("请输入文字：");
        //scanner.hasNext()会造成线程阻塞
        while (scanner.hasNextLine()) {
            //System.out.println("");
            //System.out.println("输入的文字为：");
            //scanner.nextLine();
            System.out.println(scanner.nextLine());

        }
    }


    public void method() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("请输入文字：");
        //scanner.hasNext()会造成线程阻塞

        while (scanner.hasNext()) {
            //System.out.println("");
            //System.out.println("输入的文字为：");
            //scanner.nextLine();
            System.out.println(scanner.next());

        }
    }
}
