package com.test.tucm.base.comparetorable;

/**
 * @ClassName Domain
 * @Description TODO
 * @Author TUCM
 * @Date 2019-07-06 19:36
 * @Version 1.0
 **/
public class Domain implements java.lang.Comparable<Domain> {
    private String str;

    public Domain(String str) {
        this.str = str;
    }

    @Override
    public int compareTo(Domain domain) {

        if (this.str.compareTo(domain.str) > 0)
            return 1;
        else if (this.str.compareTo(domain.str) == 0)
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
