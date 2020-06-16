package com.test.tucm.base.comparetorable;

import java.util.Comparator;

/**
 * @ClassName DomainComparator
 * @Description TODO
 * @Author TUCM
 * @Date 2019-07-06 19:48
 * @Version 1.0
 **/
public class DomainComparator implements Comparator<DomainComparable> {
    @Override
    public int compare(DomainComparable domain1, DomainComparable domain2) {
        if (domain1.getStr().compareTo(domain2.getStr()) > 0)
            return 1;
        else if (domain1.getStr().compareTo(domain2.getStr()) == 0)
            return 0;
        else
            return -1;
    }
}
