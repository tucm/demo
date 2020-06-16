package com.test.tucm.base.annotation;

import java.lang.annotation.*;

/**
 * @ClassName Validation
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-29 18:00
 * @Version 1.0
 **/
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Validation {
    /**
     * 允许为空
     *
     * @return
     */
    boolean allowEmpty() default true;

    /**
     * 允许最大长度
     *
     * @return
     */
    int maxLength() default 0;

    /**
     * 允许的最大最小值
     *
     * @return
     */
    int[] allowRange() default {Integer.MIN_VALUE, Integer.MAX_VALUE};
}
