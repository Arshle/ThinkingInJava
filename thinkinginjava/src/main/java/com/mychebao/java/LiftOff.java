/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: LiftOff.java
 * Author:   zhangdanji
 * Date:     2017年08月23日
 * Description:   
 */
package com.mychebao.java;

/**
 * @author zhangdanji
 */
public class LiftOff implements Runnable {
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount ++;

    public LiftOff(){}

    public LiftOff(int countDown){
        this.countDown = countDown;
    }

    public String status(){
        return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff!") + "), ";
    }

    public void run() {
        while(countDown -- > 0){
            System.out.println(status());
            Thread.yield();
        }
    }
}
