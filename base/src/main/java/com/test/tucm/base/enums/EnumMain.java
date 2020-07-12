package com.test.tucm.base.enums;

/**
 * @ClassName EnumMain @Description TODO
 * @Author owl
 * @Date 2020-06-20 15:56
 * @Version 1.0
 */
public class EnumMain {
    public static void main(String[] args) {

        //common();
        useClass();
    }

    /**
     * 常用方法
     * values:响应所有成员的数组
     * valueOf:根据成员获取枚举
     */
    public static void common() {
        Day[] days = Day.values();
        for (Day day : days) {
            System.out.println(day);
        }
        Day day = Day.valueOf("MONDAY");
        System.out.println("day:" + day);
    }

    /**
     * 使用class类获取枚举
     */
    public static void useClass() {
        Day[] days = Day.values();
        // 向上转型Enum
        Enum e = Day.MONDAY;
        // 无法调用,没有此方法
        // e.values();
        // 获取class对象引用
        Class<?> clasz = e.getDeclaringClass();
        if (clasz.isEnum()) {
            Day[] dsz = (Day[]) clasz.getEnumConstants();
            for (Day day : days) {
                System.out.println(day);
            }
        }
    }
}
