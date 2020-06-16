package com.test.tucm.base.annotation;

import java.util.List;

/**
 * @ClassName ParamsQo
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-29 18:29
 * @Version 1.0
 **/
public class ParamsQo extends Validator<ParamsQo> {
    @Validation(allowEmpty = false, maxLength = 5)
    private String name;
    @Validation(allowRange = {1, 20})
    private Integer age;
    @Validation(allowRange = {100, 200})
    private int num;
    @Validation(maxLength = 2)
    private List<Integer> nums;

    public ParamsQo(String name, Integer age, int num, List<Integer> nums) {
        this.name = name;
        this.age = age;
        this.num = num;
        this.nums = nums;
    }
}
