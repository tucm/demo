package com.test.tucm.base.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Main
 * @Description TODO
 * @Author TUCM
 * @Date 2020-03-02 14:50
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        //        List<String> list = new ArrayList<String>();
        //        list.add("8");
        //        list.add("6");
        //        list.add("9");
        //        list.add("7");
        //
        //        Collections.sort(list);
        //        Iterator<String> iterator = list.iterator();
        //        while (iterator.hasNext()) {
        //            String string = iterator.next();
        //            System.out.println("data:" + string);
        //        }

        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "aa");
        map.put("b", "bb");
        map.put("c", "cc");
        map.put("d", "dd");
        map.put("e", "ee");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
