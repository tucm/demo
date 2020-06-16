package com.test.tucm.base.annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ValidationTest
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-29 18:30
 * @Version 1.0
 **/
public class ValidationTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        ParamsQo paramsQo = new ParamsQo("xx", 5, 111, list);
        paramsQo.validate();//对应错误抛异常
    }
}
