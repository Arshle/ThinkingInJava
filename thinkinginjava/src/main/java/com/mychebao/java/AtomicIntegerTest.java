/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: AtomicIntegerTest.java
 * Author:   zhangdanji
 * Date:     2017年08月24日
 * Description:   
 */
package com.mychebao.java;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zhangdanji
 */
public class AtomicIntegerTest implements Runnable {
    private CyclicBarrier cyclicBarrier = new CyclicBarrier(5);
    private AtomicInteger i = new AtomicInteger();
    public int getValue(){
        return i.get();
    }

    private void evenIncrement(){
        i.addAndGet(2);
    }

    public void run() {
        while(true){
            evenIncrement();
        }
    }

    public static void main(String[] args) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.err.println("Aborting");
                System.exit(0);
            }
        },5000);

        ExecutorService exec = Executors.newCachedThreadPool();
        AtomicIntegerTest ait = new AtomicIntegerTest();
        exec.execute(ait);
        while(true){
            int val = ait.getValue();
            if(val % 2 != 0){
                System.out.println(val);
                System.exit(0);
            }
        }
    }
}
