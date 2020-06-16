package com.test.tucm.base.comparetorable;

/**
 * @ClassName DomainComparable
 * @Description TODO
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
