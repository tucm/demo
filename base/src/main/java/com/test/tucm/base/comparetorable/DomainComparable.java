package com.test.tucm.base.comparetorable;

/**
 * @ClassName DomainComparable
 * @Description Comparable可以认为是一个内比较器，实现了Comparable接口的类有一个特点，
 * 就是这些 类是可以和自己比较的，至于具体和另一个实现了Comparable接口的类如何比较，
 * 则依赖compareTo方法的实现，compareTo方法也被称为自然比较方法。
 * 如果开发者add进入一个Collection的对象想要Collections的sort方法帮你自动进行排序的话，
 * 那么这个对象必须实现Comparable接口。
 * <p>
 * compareTo方法：
 * 1、比较者大于被比较者（也就是compareTo方法里面的对象），那么返回正整数
 * 2、比较者等于被比较者，那么返回0
 * 3、比较者小于被比较者，那么返回负整数
 * 简单理解为：每次add，都会根据compareTo里的规则，两两进行比较
 * @Author TUCM
 * @Date 2019-07-06 19:36
 * @Version 1.0
 **/
public class DomainComparable implements java.lang.Comparable<DomainComparable> {
    private String str;

    public DomainComparable(String str) {
        this.str = str;
    }

    @Override
    public int compareTo(DomainComparable domainComparable) {

        if (this.str.compareTo(domainComparable.str) > 0)
            return 1;
        else if (this.str.compareTo(domainComparable.str) == 0)
            return 0;
        else
            return -1;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
