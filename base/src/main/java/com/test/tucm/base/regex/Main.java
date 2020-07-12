package com.test.tucm.base.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName Main
 * @Description 正则常用方法
 * @Author owl
 * @Date 2020-07-12 18:29
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        String regex = "count(\\d+)(df)";
        String s = "count000dfdfsdffaaaa1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        //是否匹配
        if (matcher.find()) {
            //匹配的所有串
            System.out.println(matcher.group(0));
            //匹配的第一个括号内的值
            System.out.println(matcher.group(1));
            //匹配的第二个括号内的值
            System.out.println(matcher.group(2));
        }
    }
}
