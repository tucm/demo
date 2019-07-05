package com.test.tucm.base.collection;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName ListContain
 * @Description contains方法的源码是用equals()比较的,也就是说比较的是地址
 * @Author TUCM
 * @Date 2019/7/5 17:35
 * @Version 1.0
 **/
public class ListContain {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        User u1 = new User("1","e");
        User u2 = new User("5","e");
        User u3 = new User("5","e");
        User u4 = new User("5","e");
        User u5 = new User("5","e");
        User u = new User("5","e");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u5);
        Boolean f = list.contains(u);
        if(f){
            System.out.println("包含");
        }else{
            System.out.println("不包含");
        }
    }
}
