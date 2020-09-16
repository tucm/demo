package com.test.tucm.base.comparetorable;

import java.util.Comparator;

/**
 * @ClassName DomainComparator
 * @Description Comparator可以认为是是一个外比较器，个人认为有两种情况可以使用实现Comparator接口的方式：
 * 1、一个对象不支持自己和自己比较（没有实现Comparable接口），但是又想对两个对象进行比较。
 * 2、一个对象实现了Comparable接口，但是开发者认为compareTo方法中的比较方式并不是自己想要的那种比较方式。
 * Comparator接口里面有一个compare方法，方法有两个参数T o1和T o2，是泛型的表示方式，分别表示待比较的两个对象，
 * 方法返回值和Comparable接口一样是int，有三种情况：
 * <p>
 * 1、o1大于o2，返回正整数
 * 2、o1等于o2，返回0
 * 3、o1小于o3，返回负整数
 * Comparator和Compareable触发入口不一样
 * ompareable：Collections.sort(list);
 * Comparator：Collections.sort(list, comparator);
 * @Author TUCM
 * @Date 2019-07-06 19:48
 * @Version 1.0
 **/
public class MyComparator implements Comparator<DomainComparator> {
    @Override
    public int compare(DomainComparator o1, DomainComparator o2) {
        if (o1.getStr().compareTo(o2.getStr()) > 0)
            return 1;
        else if (o1.getStr().compareTo(o2.getStr()) == 0)
            return 0;
        else
            return -1;
    }
}
