/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: AtomicityTest.java
 * Author:   zhangdanji
 * Date:     2017年08月24日
 * Description:   
 */
package com.mychebao.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zhangdanji
 */
public class AtomicityTest implements Runnable {
    private int i = 0;

    public int getValue(){
        return i;
    }

    private synchronized void evenIncrement(){
        i++;
        i++;
    }

    public void run() {
        while(true){
            evenIncrement();
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        AtomicityTest at = new AtomicityTest();
        exec.execute(at);
        while(true){
            int val = at.getValue();
            if(val % 2 != 0){
                System.out.println(val);
                System.exit(0);
            }
        }
    }
}
