/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: WaxOMatic2.java
 * Author:   zhangdanji
 * Date:     2017年08月24日
 * Description:   
 */
package com.mychebao.java;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhangdanji
 */
class Car2{
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean waxOn = false;

    public void waxed(){
        lock.lock();
        try {
            waxOn = true;
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void buffed(){
        lock.lock();
        try {
            waxOn = false;
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void waitForWaxing(){
        lock.lock();
        try {
            while(!waxOn){
                condition.await();
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        } finally {
            lock.unlock();
        }
    }

    public void waitForBuffing(){
        lock.lock();
        try {
            while(waxOn){
                condition.await();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

class WaxOn2 implements Runnable{

    private Car2 car;

    public WaxOn2(Car2 c){
        this.car = c;
    }

    public void run() {

    }
}

public class WaxOMatic2 {
}
