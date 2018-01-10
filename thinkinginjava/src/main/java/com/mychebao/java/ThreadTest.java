/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: ThreadTest.java
 * Author:   zhangdanji
 * Date:     2017年08月24日
 * Description:   
 */
package com.mychebao.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author zhangdanji
 */
class runThread implements Runnable{
    public void run() {
        while(true){
            System.out.println("waiting...");
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(1);
        Future<?> f = exec.submit(new runThread());
        exec.shutdown();
        System.out.println("start shutdown");
        f.cancel(true);
        System.out.println("end shutdown");
        exec.shutdownNow();
    }

}
