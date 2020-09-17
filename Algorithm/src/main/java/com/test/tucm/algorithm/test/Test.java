package com.test.tucm.algorithm.test;

import java.util.*;

public class Test {
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
        //TODO 输入，解析
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        Map<String, String> map = new HashMap<>();
        //System.out.println("输入数据：");
        while (scanner.hasNextLine()) {

            try {

                String input = scanner.nextLine();
                String[] arr = input.split(" +");
                boolean flag = true;
                for (int i = 0; i < arr.length; i++) {
                    String[] data = arr[i].split(",");
                    if (map.containsKey(data[0])) {
                        String mapData = map.get(data[0]);
                        String[] mapDataArr = map.get(data[0]).split(",");
                        int time = Integer.parseInt(mapDataArr[1]);
                        String city = mapDataArr[3];
                        if (!data[3].equals(city) && Integer.parseInt(data[1]) - time > 0 && Integer.parseInt(data[1]) - time <= 60) {
                            flag = false;
                            //放入对列
                            queue.offer(mapData);
                            queue.offer(arr[i]);
                            map.put(data[0], arr[i]);
                            continue;

                        }

                    }

                    if (Integer.parseInt(data[2]) > 1000) {
                        flag = false;
                        //放入队列
                        queue.offer(arr[i]);
                        continue;
                    }
                    map.put(data[0], arr[i]);
                }
                System.out.println();
                if (flag) {
                    System.out.println("none");
                } else {
                    while (!queue.isEmpty()) {

                        System.out.print(queue.poll() + " ");
                    }
                }
            } catch (Exception e) {
                System.out.println("");
            }


        }

    }
}
