/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: BasicThreads.java
 * Author:   zhangdanji
 * Date:     2017年08月23日
 * Description:   
 */
package com.mychebao.java;

/**
 * @author zhangdanji
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for Liftoff");
        Thread test = new Thread(){
            @Override
            public void run() {
                System.out.println(1111111);
            }
        };
        test.start();
    }
}
