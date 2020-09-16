package com.test.tucm.base.comparetorable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName Comparable
 * @Description Comparable测试
 * @Author TUCM
 * @Date 2019-07-06 19:35
 * @Version 1.0
 **/
public class ComparableTest {
    public static void main(String[] args) {
        DomainComparable c1 = new DomainComparable("c");
        DomainComparable c2 = new DomainComparable("c");
        DomainComparable b = new DomainComparable("b");
        DomainComparable d = new DomainComparable("d");
        System.out.println(c1.compareTo(c2));
        System.out.println(b.compareTo(d));
        System.out.println(c1.compareTo(d));
        List<DomainComparable> list = new ArrayList<>();
        list.add(d);
        list.add(b);
        list.add(c1);
        list.add(c2);
        System.out.println("排序前：");
        for (DomainComparable domainComparable : list) {
            System.out.print(domainComparable.getStr());
        }

        Collections.sort(list);
        System.out.println();
        System.out.println("排序后：");
        for (DomainComparable domainComparable : list) {
            System.out.print(domainComparable.getStr());
        }

    }
}
