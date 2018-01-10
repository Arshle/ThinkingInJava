/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: NotifyVsNotifyAll.java
 * Author:   zhangdanji
 * Date:     2017年08月24日
 * Description:   
 */
package com.mychebao.java;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author zhangdanji
 */
class Blocker{
    synchronized void waitingCall(){
        try {
            while(!Thread.interrupted()){
                wait();
                System.out.println(Thread.currentThread() + " ");
            }
        } catch (InterruptedException e) {

        }
    }

    synchronized void prod(){
        notify();
    }

    synchronized void prodAll(){
        notifyAll();
    }
}

class Task implements Runnable{

    static Blocker blocker = new Blocker();

    public void run() {
         blocker.waitingCall();
    }
}

class Task2 implements Runnable{

    static Blocker blocker = new Blocker();

    public void run() {
        blocker.waitingCall();
    }
}

public class NotifyVsNotifyAll {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < 5; i++){
            exec.execute(new Task());
        }
        exec.execute(new Task2());
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {

            boolean prod = true;

            @Override
            public void run() {
                if(prod){
                    System.out.println("\nnotify() ");
                    Task.blocker.prod();
                    prod = false;
                }else{
                    System.out.println("\nnotifyAll() ");
                    Task.blocker.prodAll();
                    prod = true;
                }

            }
        },400,400);
        TimeUnit.SECONDS.sleep(5);
        timer.cancel();
        System.out.println("\nTimer canceled");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println("Task.blocker.prodAll() ");
        Task2.blocker.prodAll();
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println("\nShutting down");
        exec.shutdownNow();
    }
}
