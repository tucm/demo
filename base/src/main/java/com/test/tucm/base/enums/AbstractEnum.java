package com.test.tucm.base.enums;

/**
 * @ClassName AbstractEnum
 * @Description 包含抽象方法的枚举
 * @Author owl
 * @Date 2020-06-20 16:41
 * @Version 1.0
 **/
public enum AbstractEnum {
    FIRST {
        @Override
        public String getInfo() {
            return "FIRST TIME";
        }
    },
    SECOND {
        @Override
        public String getInfo() {
            return "SECOND TIME";
        }
    };

    /**
     * 定义抽象方法
     *
     * @return
     */
    public abstract String getInfo();

    /**
     * 输出结果:
     * F:FIRST TIME
     * S:SECOND TIME
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("F:" + AbstractEnum.FIRST.getInfo());
        System.out.println("S:" + AbstractEnum.SECOND.getInfo());

    }
}
