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
        Domain c1 = new Domain("c");
        Domain c2 = new Domain("c");
        Domain b = new Domain("b");
        Domain d = new Domain("d");
        System.out.println(c1.compareTo(c2));
        System.out.println(b.compareTo(d));
        System.out.println(c1.compareTo(d));

    }
}
