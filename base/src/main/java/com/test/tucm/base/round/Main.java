package com.test.tucm.base.round;

/**
 * @ClassName Main
 * @Description 多重循环时，continue和break都只跳出单层循环
 * @Author TUCM
 * @Date 2019/7/5 15:20
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                if (i==1){
                    //continue;
                    break;
                    //return;
                }
                System.out.println("i="+i+",j="+j);
            }
        }
    }
}
