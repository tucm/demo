package com.test.tucm.algorithm.test;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        T1();
    }


    /**
     * 某银行在交易判定中如果出现下述两种情况，该笔交易视为无效交易：
     * <p>
     * （1）交易金额超过 1000元
     * （2）或者，该笔交易与另一个城市中相同客户名称的另一笔交易相隔不超过 60 分钟（含60分钟）
     * <p>
     * 每笔交易通过字符串 transactions[i] 标识，transactions[i] 按 "{name},{time},{amount},{city}" 的格式进行记录，这些值分别表示交易的客户名称、时间（以分钟计）、金额、城市。
     * <p>
     * 给你一份交易清单 transactions，包含多笔交易字符串，以空格分隔，返回可能无效的交易列表。
     */
    public static void T1() {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] arr = input.split(" +");
            List<String> list = getList(arr);
            if (list.size() == 0) {
                System.out.println("none");
            }
            for (String str : list) {
                System.out.print(str + " ");
            }


        }

    }

    public static List<String> getList(String[] transactions) {
        List<String> res = new ArrayList<>();
        Map<String, List<String[]>> map = new HashMap<>();
        for (String string : transactions) {
            String[] temp = string.split(",");//分成交易的名称，时间（以分钟计），金额以及城市。
            if (Integer.parseInt(temp[2]) > 1000)//交易金额超过 ¥1000
            {
                res.add(string);
            }
            if (!map.containsKey(temp[0])) {

                map.put(temp[0], new ArrayList<>());
                map.get(temp[0]).add(temp);
            } else {
                boolean flag = false;
                for (String[] s : map.get(temp[0])) {

                    if (temp[3].equals(s[3])) continue;
                    String h = String.join(",", s);
                    if (Math.abs(Integer.parseInt(temp[1]) - Integer.parseInt(s[1])) <= 60) {//检查它和另一个城市中同名的另一笔交易相隔不超过 60 分钟
                        if (!res.contains(h))
                            res.add(h);
                        flag = true;
                    }

                }
                map.get(temp[0]).add(temp);
                if (flag && !res.contains(string)) res.add(string);
            }
        }
        return res;

    }


}
