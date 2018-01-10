/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: SimplePriorities.java
 * Author:   zhangdanji
 * Date:     2017年08月23日
 * Description:   
 */
package com.mychebao.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zhangdanji
 */
public class SimplePriorities implements Runnable {
    private int countDown = 5;
    private volatile  double d;
    private int priority;

    public SimplePriorities(int priority){
        this.priority = priority;
    }

    public String toString(){
        return Thread.currentThread() + ":" + countDown;
    }

    public void run() {
        Thread.currentThread().setPriority(priority);
        while(true){
            for(int i = 1; i < 100000; i ++){
                d += (Math.PI + Math.E) / (double)i;
                if(i % 1000 == 0){
                    Thread.yield();
                }
            }
            System.out.println(this);
            if(--countDown == 0){
                return;
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < 5; i ++){
            exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));
        }
        exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
        exec.shutdown();
    }
}
