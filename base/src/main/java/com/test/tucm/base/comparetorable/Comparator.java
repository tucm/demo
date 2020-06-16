package com.test.tucm.base.comparetorable;

/**
 * @ClassName Comparator
 * @Description TODO
 * @Author TUCM
 * @Date 2019-07-06 19:53
 * @Version 1.0
 **/
public class Comparator {
    public static void main(String[] args) {
        DomainComparable c1 = new DomainComparable("c");
        DomainComparable c2 = new DomainComparable("c");
        DomainComparable b = new DomainComparable("b");
        DomainComparable d = new DomainComparable("d");
        DomainComparator dc = new DomainComparator();
        System.out.println(dc.compare(c1, c2));
        System.out.println(dc.compare(c1, b));
        System.out.println(dc.compare(c1, d));
    }
}
