package com.test.tucm.base.comparetorable;

/**
 * @ClassName Comparable
 * @Description TODO
 * @Author TUCM
 * @Date 2019-07-06 19:35
 * @Version 1.0
 **/
public class Comparable {
    public static void main(String[] args) {
        DomainComparable c1 = new DomainComparable("c");
        DomainComparable c2 = new DomainComparable("c");
        DomainComparable b = new DomainComparable("b");
        DomainComparable d = new DomainComparable("d");
        System.out.println(c1.compareTo(c2));
        System.out.println(b.compareTo(d));
        System.out.println(c1.compareTo(d));

    }
}
