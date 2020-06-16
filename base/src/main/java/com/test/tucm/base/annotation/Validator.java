package com.test.tucm.base.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;

/**
 * @ClassName Validator
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-29 18:02
 * @Version 1.0
 **/
public class Validator<T> {
    private Class<T> entity;

    /**
     * 核心校验方式
     */
    public void validate() {
        entity = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        if (this.entity != null) {
            Field[] fields = entity.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                //获取字段中包含Validation的注解
                Validation v = field.getAnnotation(Validation.class);
                if (v != null) {
                    if (!v.allowEmpty()) {
                        validateEmpty(field);
                    }
                    if (v.allowRange().length == 2 && (v.allowRange()[0] != Integer.MIN_VALUE || v.allowRange()[1] != Integer.MAX_VALUE)) {
                        validateRange(field, v);
                    }
                    if (v.maxLength() > 0) {
                        validateMaxLength(field, v);
                    }
                }
            }
        }
    }

    /**
     * 校验字符串长度、集合长度
     *
     * @param field
     * @param v
     */
    private void validateMaxLength(Field field, Validation v) {
        System.out.println("验证长度");

    }

    /**
     * 校验数据范围 数值、集合大小
     *
     * @param field
     * @param v
     */
    private void validateRange(Field field, Validation v) {
        System.out.println("验证范围");

    }

    /**
     * 校验字符串、集合是否为空
     *
     * @param field
     */
    private void validateEmpty(Field field) {
        System.out.println("验证是否非空");

    }
}
