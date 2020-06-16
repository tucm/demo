package com.test.tucm.base.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName A
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-02 19:41
 * @Version 1.0
 **/
public class A {

    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();
        name.add("icon");
        age.add(18);
        number.add(314);
        System.out.println();
        getUperNumber(age);//2
        getUperNumber(number);//3

    }

    /**
     * @param data
     */
    public static void getData(List<?> data) {
        System.out.println("data :" + data.get(0));
    }

    public static void getUperNumber(List<? extends Number> data) {
        System.out.println("data :" + data.get(0));
    }

}
