package com.test.tucm.base.comparetorable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName Comparator
 * @Description Comparator测试
 * @Author TUCM
 * @Date 2019-07-06 19:53
 * @Version 1.0
 **/
public class ComparatorTest {
    public static void main(String[] args) {
        DomainComparator c1 = new DomainComparator("c");
        DomainComparator c2 = new DomainComparator("c");
        DomainComparator b = new DomainComparator("b");
        DomainComparator d = new DomainComparator("d");
        MyComparator comparator = new MyComparator();
        System.out.println(comparator.compare(c1, c2));
        System.out.println(comparator.compare(c1, b));
        System.out.println(comparator.compare(c1, d));
        List<DomainComparator> list = new ArrayList<>();
        list.add(d);
        list.add(b);
        list.add(c1);
        list.add(c2);
        System.out.println("排序前：");
        for (DomainComparator domainComparator : list) {
            System.out.print(domainComparator.getStr());
        }

        Collections.sort(list, comparator);
//        Collections.sort(list, new Comparator<DomainComparator>() {
//            @Override
//            public int compare(DomainComparator o1, DomainComparator o2) {
//                if (o1.getStr().compareTo(o2.getStr()) > 0)
//                    return 1;
//                else if (o1.getStr().compareTo(o2.getStr()) == 0)
//                    return 0;
//                else
//                    return -1;
//            }
//        });
        System.out.println();
        System.out.println("排序后：");
        for (DomainComparator domainComparator : list) {
            System.out.print(domainComparator.getStr());
        }

    }
}
